package org.jasper.jtaDemo.EMRC;

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
		
		System.out.println("map : " + map);
		
		if(map.get("http://coralcea.ca/jasper/patient/id").equals("001")){
			return "{" +
			"    \"http://coralcea.ca/jasper/patient/id\": \"001\", " +
			"    \"http://coralcea.ca/jasper/ward\": \"ICU-3\"," +
			"    \"http://coralcea.ca/jasper/bed\": \"1\", " +
			"    \"http://coralcea.ca/jasper/medicalSensor/heartRate/sensorId\": \"hr1\", " +
			"    \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/sensorId\": \"bp1\"" +
			"}";
		}else if(map.get("http://coralcea.ca/jasper/patient/id").equals("002")){
			return "{" +
			"    \"http://coralcea.ca/jasper/patient/id\": \"002\", " +
			"    \"http://coralcea.ca/jasper/ward\": \"ICU-3\"," +
			"    \"http://coralcea.ca/jasper/bed\": \"2\", " +
			"    \"http://coralcea.ca/jasper/medicalSensor/heartRate/sensorId\": \"hr2\"" +
			"}";
		}else if(map.get("http://coralcea.ca/jasper/patient/id").equals("003")){
			return "{" +
			"    \"http://coralcea.ca/jasper/patient/id\": \"003\", " +
			"    \"http://coralcea.ca/jasper/ward\": \"ICU-3\"," +
			"    \"http://coralcea.ca/jasper/bed\": \"3\", " +
			"    \"http://coralcea.ca/jasper/medicalSensor/bloodPressure/sensorId\": \"bp3\"" +
			"}";
		}else{
			return "{}";
		}	
	}
}
