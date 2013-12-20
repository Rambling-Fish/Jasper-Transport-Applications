package org.jasper.dtaDemo.BloodPressureB;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.jena.atlas.json.JSON;
import org.apache.jena.atlas.json.JsonObject;
import org.apache.jena.atlas.json.JsonValue;

public class LocalCache {

	private static final String BP_SID_URI = "http://coralcea.ca/jasper/bpSID";
	
	private static final SensorData SENSOR_DATA_100K;
	static{
		BpData[] bpData = new BpData[375];
		int MAX_S = 145;
		int MIN_S = 70;
		int MAX_D = 90;
		int MIN_D = 50;
		
		
		for(int i = 0;i<bpData.length;i++){
			int s = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
			int d = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
			bpData[i] = new BpData(s, d);
		}
		
		SENSOR_DATA_100K = new SensorData(bpData);
	}
	
	private Map<String, ArrayList<BpData>> bpSensors = new ConcurrentHashMap<String, ArrayList<BpData>>();

	public SensorData getSensorData(Map<String,Serializable>  map){
		if(map.get(BP_SID_URI) == null || !(map.get(BP_SID_URI) instanceof String)){
			return null;
		}

		String bpSID = (String)map.get(BP_SID_URI);

		if(isSpecialSID(bpSID)){
			return specialSensorInfo(bpSID);
		}
		
		int MAX_S = 145;
		int MIN_S = 70;
		int MAX_D = 90;
		int MIN_D = 50;
		int s = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
		int d = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
		
		
		
		ArrayList<BpData> bpData = bpSensors.get(bpSID);
		
		if(bpData == null){
			bpData = new ArrayList<BpData>();
			bpSensors.put(bpSID, bpData);
		}
		if(bpData.size()>10){
			bpData.remove(0);
		}
		
		bpData.add(new BpData(s,d));
		
		return new SensorData(bpData.toArray(new BpData[]{}));	
	}

	
	public SensorData getSensorData(String str){

		JsonObject myjobj = JSON.parse(str);
		JsonValue myjvalue = myjobj.get(BP_SID_URI);
		
		String bpSID = new String(myjvalue.toString());

		// the converted Json string has double quotes that must be removed.
		bpSID = bpSID.replaceAll("\"","");
		
		if(isSpecialSID(bpSID)){
			return specialSensorInfo(bpSID);
		}
		
		int MAX_S = 145;
		int MIN_S = 70;
		int MAX_D = 90;
		int MIN_D = 50;
		int s = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
		int d = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
				
		ArrayList<BpData> bpData = bpSensors.get(bpSID);
		
		if(bpData == null){
			bpData = new ArrayList<BpData>();
			bpSensors.put(bpSID, bpData);
		}
		if(bpData.size()>10){
			bpData.remove(0);
		}
		
		bpData.add(new BpData(s,d));
		
		return new SensorData(bpData.toArray(new BpData[]{}));	
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
