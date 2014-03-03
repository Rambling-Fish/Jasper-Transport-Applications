package org.jasper.dtaDemo.BloodPressureB;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.jena.atlas.json.JSON;
import org.apache.jena.atlas.json.JsonObject;
import org.apache.jena.atlas.json.JsonValue;

public class LocalCache {

	private static final String BP_SID_URI = "http://coralcea.ca/jasper/bpSID";
	
	
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
		SENSOR_DATA_10K = new SensorData(generateArray(46));
		SENSOR_DATA_20K = new SensorData(generateArray(92));
		SENSOR_DATA_30K = new SensorData(generateArray(138));
		SENSOR_DATA_40K = new SensorData(generateArray(184));
		SENSOR_DATA_50K = new SensorData(generateArray(230));
		SENSOR_DATA_60K = new SensorData(generateArray(276));
		SENSOR_DATA_70K = new SensorData(generateArray(322));
		SENSOR_DATA_80K = new SensorData(generateArray(368));
		SENSOR_DATA_90K = new SensorData(generateArray(414));
		SENSOR_DATA_100K = new SensorData(generateArray(460));
		
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
	
	private static BpData[] generateArray(int size){
		BpData[] array = new BpData[size];
		int MAX_S = 99;
		int MIN_S = 70;
		int MAX_D = 90;
		int MIN_D = 50;
		for(int i = 0;i<array.length;i++){
			int s = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
			int d = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
			array[i] = new BpData(s, d);
		}
		return array;
	}
	
	private Map<String, ArrayList<BpData>> bpSensors = new ConcurrentHashMap<String, ArrayList<BpData>>();

	public SensorData getSensorData(Map<String,Serializable>  map){
		if(map.get(BP_SID_URI) == null || !(map.get(BP_SID_URI) instanceof String)){
			return null;
		}

		String bpSID = (String)map.get(BP_SID_URI);

		if(SENSORS.containsKey(bpSID)) return SENSORS.get(bpSID);
				
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
		
		if(SENSORS.containsKey(bpSID)) return SENSORS.get(bpSID);
		
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
	
}
