package org.jasper.dtaDemo.HeartRateMonitorD;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.jena.atlas.json.JSON;
import org.apache.jena.atlas.json.JsonObject;
import org.apache.jena.atlas.json.JsonValue;
import org.apache.log4j.Logger;

public class LocalCache {
	
	
	private static final String HR_SID_URI = "http://coralcea.ca/jasper/hrSID";
	static Logger logger = Logger.getLogger(LocalCache.class.getName());

	private static final SensorData SENSOR_DATA_100K;
	static{
		HrData[] hrData = new HrData[600];
		int MAX_HR = 145;
		int MIN_HR = 45;
		
		for(int i = 0;i<hrData.length;i++){
			int bpm = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
			hrData[i] = new HrData(bpm);
		}
		
		SENSOR_DATA_100K = new SensorData(hrData);
	}

	private Map<String, ArrayList<HrData>> hrSensors = new ConcurrentHashMap<String, ArrayList<HrData>>();

	public SensorData getSensorData(Map<String,Serializable>  map){
		
		logger.info("TIMECHECK DTA received request from UDE at" + System.currentTimeMillis());

		if(map.get(HR_SID_URI) == null || !(map.get(HR_SID_URI) instanceof String)){
			return null;
		}
		
		String hrSID = (String)map.get(HR_SID_URI);
		
		if(isSpecialSID(hrSID)){
			return specialSensorInfo(hrSID);
		}
		
		int MAX_HR = 145;
		int MIN_HR = 45;
		int bpm = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
			
		ArrayList<HrData> hrData = hrSensors.get(hrSID);
		if(hrData == null){
			hrData = new ArrayList<HrData>();
			hrSensors.put(hrSID, hrData);
		}
		if(hrData.size()>10){
			hrData.remove(0);
		}
		
		hrData.add(new HrData(bpm));
		
		return new SensorData(hrData.toArray(new HrData[]{}));		
	}

	public SensorData getSensorData(String str){
		
		logger.info("TIMECHECK DTA received request from UDE at" + System.currentTimeMillis());

		JsonObject myjobj = JSON.parse(str);
		JsonValue myjvalue = myjobj.get(HR_SID_URI);
		
		String hrSID = new String(myjvalue.toString());

		// the converted Json string has double quotes that must be removed.
		hrSID = hrSID.replaceAll("\"","");
				
		if(isSpecialSID(hrSID)){
			logger.info("TIMECHECK DTA sending response back to UDE at" + System.currentTimeMillis());
			return specialSensorInfo(hrSID);
		}
		
		int MAX_HR = 145;
		int MIN_HR = 45;
		int bpm = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
			
		ArrayList<HrData> hrData = hrSensors.get(hrSID);
		if(hrData == null){
			hrData = new ArrayList<HrData>();
			hrSensors.put(hrSID, hrData);
		}
		if(hrData.size()>10){
			hrData.remove(0);
		}
		
		hrData.add(new HrData(bpm));
		
		logger.info("TIMECHECK DTA sending response back to UDE at" + System.currentTimeMillis());
		return new SensorData(hrData.toArray(new HrData[]{}));		
	}

	private SensorData specialSensorInfo(String sID) {
		if("100k".equals(sID)){
			return SENSOR_DATA_100K;
		}
		return null;
	}

	private boolean isSpecialSID(String sID) {
		return ("100k".equals(sID));
	}
}
