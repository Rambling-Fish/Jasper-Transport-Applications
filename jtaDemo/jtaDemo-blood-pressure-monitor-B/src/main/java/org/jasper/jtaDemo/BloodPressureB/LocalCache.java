package org.jasper.jtaDemo.BloodPressureB;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.codehaus.jackson.annotate.JsonProperty;

public class LocalCache {

	static SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS zzz"); 
	
	private static final String BP_DATA_URI = "http://coralcea.ca/jasper/medicalSensor/bloodPressure/data";
	private static final String BP_SYS_URI = "http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/systolic";
	private static final String BP_DIA_URI = "http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/diastolic";
	private static final String TIMESTAMP_URI = "http://coralcea.ca/jasper/timeStamp";
	private static final String BP_SID_URI = "http://coralcea.ca/jasper/bpSID";
	
	public class BpData{
		
		@JsonProperty(value=BP_SYS_URI)
		private int sys;
		
		@JsonProperty(value=BP_DIA_URI)
		private int dia;

		@JsonProperty(value=TIMESTAMP_URI)
		private String timestamp;

		public BpData(int systolic, int diastolic) {
			super();
			this.sys = systolic;
			this.dia = diastolic;
			timestamp = dt.format(new Date());
		}
	}
	
	public class SensorData{
		@JsonProperty(value=BP_DATA_URI)
		private BpData[] bpData;
		
		public SensorData(BpData[] data){
			this.bpData = data;
		}
	}
	
	private Map<String, ArrayList<BpData>> bpSensors = new ConcurrentHashMap<String, ArrayList<BpData>>();
	
	public SensorData getSensorData(Map<String,Serializable>  map){
		int MAX_S = 145;
		int MIN_S = 70;
		int MAX_D = 90;
		int MIN_D = 50;
		int s = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
		int d = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
		
		if(map.get(BP_SID_URI) == null || !(map.get(BP_SID_URI) instanceof String)){
			return null;
		}
		
		String bpSID = (String)map.get(BP_SID_URI);
		
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
