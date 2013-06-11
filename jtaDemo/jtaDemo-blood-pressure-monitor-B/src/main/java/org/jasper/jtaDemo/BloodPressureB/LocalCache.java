package org.jasper.jtaDemo.BloodPressureB;

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
	
	public static String getWard(HashMap<String,String> map){
		int MAX_S = 145;
		int MIN_S = 70;
		int MAX_D = 90;
		int MIN_D = 50;
		int s1 = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
		int s2 = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
		int d1 = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
		int d2 = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
		
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS zzz"); 
		Date t1 = new Date();
		t1.setTime(t1.getTime()-5000);
		String timeStamp1 =  dt.format(t1);
		String timeStamp2 =  dt.format(new Date());
		
		System.out.println("map : " + map);
		
		
		if(map.get("http://coralcea.ca/jasper/medicalSensor/bloodPressure/sensorId").equals("bp1")){
			return  "{    \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/data\": [" +
			"        {" +
			"            \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/systolic\": " + s2 +  ", " +
			"            \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/diastolic\":" + d2 +  "," +
			"            \"http://coralcea.ca/jasper/timeStamp\": \"" + timeStamp2 +"\"" +
			"        }, " +
			"        {" +
			"            \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/systolic\": " + s1 +  ", " +
			"            \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/diastolic\":" + d1 +  "," +
			"            \"http://coralcea.ca/jasper/timeStamp\": \"" + timeStamp1 +"\"" +
			"        }" +
			"    ], " +
			"    \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/sensorId\": \"bp1\"" +
			"}";	
		}else if(map.get("http://coralcea.ca/jasper/medicalSensor/bloodPressure/sensorId").equals("bp3")){
			return  "{    \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/data\": [" +
			"        {" +
			"            \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/systolic\": " + s2 +  ", " +
			"            \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/diastolic\":" + d2 +  "," +
			"            \"http://coralcea.ca/jasper/timeStamp\": \"" + timeStamp2 +"\"" +
			"        }, " +
			"        {" +
			"            \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/systolic\": " + s1 +  ", " +
			"            \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/diastolic\":" + d1 +  "," +
			"            \"http://coralcea.ca/jasper/timeStamp\": \"" + timeStamp1 +"\"" +
			"        }" +
			"    ], " +
			"    \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/sensorId\": \"bp2\"" +
			"}";	
		}else {
			return "{}";
		}
	}
}
