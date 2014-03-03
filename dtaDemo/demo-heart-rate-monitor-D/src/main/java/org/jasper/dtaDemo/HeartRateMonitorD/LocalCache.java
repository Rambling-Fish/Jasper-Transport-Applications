package org.jasper.dtaDemo.HeartRateMonitorD;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.jena.atlas.json.JSON;
import org.apache.jena.atlas.json.JsonObject;
import org.apache.jena.atlas.json.JsonValue;
import org.apache.log4j.Logger;

public class LocalCache {
	
	
	private static final String HR_SID_URI = "http://coralcea.ca/jasper/hrSID";
	static Logger logger = Logger.getLogger(LocalCache.class.getName());

	private static final Map<String, SensorData> SENSORS;
	private static final SensorData SENSOR_DATA_10K;
	private static final SensorData SENSOR_DATA_20K;
	private static final SensorData SENSOR_DATA_30K;
	private static final SensorData SENSOR_DATA_40K;
	private static final SensorData SENSOR_DATA_50K;
	private static final SensorData SENSOR_DATA_60K;
	private static final SensorData SENSOR_DATA_70K;
	private static final SensorData SENSOR_DATA_80K;
	private static final SensorData SENSOR_DATA_90K;
	private static final SensorData SENSOR_DATA_100K;
	
	static{
		SENSOR_DATA_10K = new SensorData(generateArray(74));
		SENSOR_DATA_20K = new SensorData(generateArray(148));
		SENSOR_DATA_30K = new SensorData(generateArray(222));
		SENSOR_DATA_40K = new SensorData(generateArray(296));
		SENSOR_DATA_50K = new SensorData(generateArray(370));
		SENSOR_DATA_60K = new SensorData(generateArray(444));
		SENSOR_DATA_70K = new SensorData(generateArray(519));
		SENSOR_DATA_80K = new SensorData(generateArray(593));
		SENSOR_DATA_90K = new SensorData(generateArray(667));
		SENSOR_DATA_100K = new SensorData(generateArray(741));
		
		Map<String, SensorData> aMap = new HashMap<String, SensorData>();
		aMap.put("10k", SENSOR_DATA_10K);	
		aMap.put("20k", SENSOR_DATA_20K);	
		aMap.put("30k", SENSOR_DATA_30K);	
		aMap.put("40k", SENSOR_DATA_40K);	
		aMap.put("50k", SENSOR_DATA_50K);	
		aMap.put("60k", SENSOR_DATA_60K);	
		aMap.put("70k", SENSOR_DATA_70K);	
		aMap.put("80k", SENSOR_DATA_80K);	
		aMap.put("90k", SENSOR_DATA_90K);	
		aMap.put("100k", SENSOR_DATA_100K);	
		SENSORS = Collections.unmodifiableMap(aMap);
		
	}
	
	private static HrData[] generateArray(int size){
		HrData[] array = new HrData[size];
		int MAX_HR = 99;
		int MIN_HR = 45;
		for(int i = 0;i<array.length;i++){
			int bpm = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
			array[i] = new HrData(bpm);
		}
		return array;
	}

	private Map<String, ArrayList<HrData>> hrSensors = new ConcurrentHashMap<String, ArrayList<HrData>>();

	public SensorData getSensorData(Map<String,Serializable>  map){
		
		logger.info("TIMECHECK DTA received request from UDE at " + System.currentTimeMillis());

		if(map.get(HR_SID_URI) == null || !(map.get(HR_SID_URI) instanceof String)){
			return null;
		}
		
		String hrSID = (String)map.get(HR_SID_URI);
		
		if(SENSORS.containsKey(hrSID)){
			logger.info("TIMECHECK DTA sending response back to UDE at " + System.currentTimeMillis());
			return SENSORS.get(hrSID);
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
		
		logger.info("TIMECHECK DTA sending response back to UDE at " + System.currentTimeMillis());
		return new SensorData(hrData.toArray(new HrData[]{}));		
	}

	public SensorData getSensorData(String str){
		
		logger.info("TIMECHECK DTA received request from UDE at " + System.currentTimeMillis());

		JsonObject myjobj = JSON.parse(str);
		JsonValue myjvalue = myjobj.get(HR_SID_URI);
		
		String hrSID = new String(myjvalue.toString());

		// the converted Json string has double quotes that must be removed.
		hrSID = hrSID.replaceAll("\"","");
				
		if(SENSORS.containsKey(hrSID)){
			logger.info("TIMECHECK DTA sending response back to UDE at " + System.currentTimeMillis());
			return SENSORS.get(hrSID);
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
		
		logger.info("TIMECHECK DTA sending response back to UDE at " + System.currentTimeMillis());
		return new SensorData(hrData.toArray(new HrData[]{}));		
	}

}
