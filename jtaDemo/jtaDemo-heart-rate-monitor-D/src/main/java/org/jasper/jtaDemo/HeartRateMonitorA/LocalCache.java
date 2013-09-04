package org.jasper.jtaDemo.HeartRateMonitorA;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.codehaus.jackson.annotate.JsonProperty;

public class LocalCache {
	
	static SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS zzz"); 
	
	private static final String HR_DATA_URI = "http://coralcea.ca/jasper/medicalSensor/heartRate/data";
	private static final String BPM_URI = "http://coralcea.ca/jasper/medicalSensor/heartRate/data/bpm";
	private static final String TIMESTAMP_URI = "http://coralcea.ca/jasper/timeStamp";
	private static final String HR_SID_URI = "http://coralcea.ca/jasper/hrSID";

	public class HrData{
		
		@JsonProperty(value=BPM_URI)
		private int bpm;

		@JsonProperty(value=TIMESTAMP_URI)
		private String timestamp;

		public HrData(int bpm) {
			this.bpm = bpm;
			timestamp = dt.format(new Date());
		}
	}
	
	public class SensorData{
		@JsonProperty(value=HR_DATA_URI)
		private HrData[] hrData;
		
		public SensorData(HrData[] data){
			this.hrData = data;
		}
	}
	
	private Map<String, ArrayList<HrData>> hrSensors = new ConcurrentHashMap<String, ArrayList<HrData>>();
	
	public SensorData getSensorData(Map<String,Serializable>  map){
		int MAX_HR = 145;
		int MIN_HR = 45;
		int bpm = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
		
		if(map.get(HR_SID_URI) == null || !(map.get(HR_SID_URI) instanceof String)){
			return null;
		}
		
		String hrSID = (String)map.get(HR_SID_URI);
		
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
}
