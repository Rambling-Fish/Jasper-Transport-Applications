package org.jasper.jtaDemo.HeartRateMonitorA;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class LocalCache {
	private static Ward ward = new Ward("Wing-5-Floor-3-Ward-4");
	
	public static void addPatientInfo(Patient p){
		ward.addPatientHeartRateData(p);
	}
	
	public static Ward getWard(String[] req){
		return getWard(req[0]);
	}

	public static Ward getWard(String str){
		return ward;
	}
	
	public static String getWard(HashMap  map){
		int MAX_HR = 145;
		int MIN_HR = 45;
		int bpm1 = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
		int bpm2 = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS zzz"); 
		Date t1 = new Date();
		t1.setTime(t1.getTime()-5000);
		String timeStamp1 =  dt.format(t1);
		String timeStamp2 =  dt.format(new Date());
		
		System.out.println("map : " + map);
		
		if(map.get("http://coralcea.ca/jasper/medicalSensor/heartRate/sensorId").equals("hr1")){
			return  "{   \"http://coralcea.ca/jasper/medicalSensor/ID\": \"hr1\", " +
			"    \"http://coralcea.ca/jasper/medicalSensor/heartRate/data\": [" +
			"        {" +
			"            \"http://coralcea.ca/jasper/medicalSensor/heartRate/data/bpm\": " + bpm2 + ", " +
			"            \"http://coralcea.ca/jasper/timeStamp\": \"" + timeStamp2 +"\"" +
			"        }, " +
			"        {" +
			"            \"http://coralcea.ca/jasper/medicalSensor/heartRate/data/bpm\": " + bpm1 + ", " +
			"            \"http://coralcea.ca/jasper/timeStamp\": \"" + timeStamp1 +"\"" +
			"        }" +
			"    ]" +
			"}";	
		}else 		if(map.get("http://coralcea.ca/jasper/medicalSensor/heartRate/sensorId").equals("hr2")){
			return  "{   \"http://coralcea.ca/jasper/medicalSensor/ID\": \"hr2\", " +
			"    \"http://coralcea.ca/jasper/medicalSensor/heartRate/data\": [" +
			"        {" +
			"            \"http://coralcea.ca/jasper/medicalSensor/heartRate/data/bpm\": " + bpm2 + ", " +
			"            \"http://coralcea.ca/jasper/timeStamp\": \"" + timeStamp2 +"\"" +
			"        }, " +
			"        {" +
			"            \"http://coralcea.ca/jasper/medicalSensor/heartRate/data/bpm\": " + bpm1 + ", " +
			"            \"http://coralcea.ca/jasper/timeStamp\": \"" + timeStamp1 +"\"" +
			"        }" +
			"    ]" +
			"}";	
		}else {
			return "{}";
		}
	}
}
