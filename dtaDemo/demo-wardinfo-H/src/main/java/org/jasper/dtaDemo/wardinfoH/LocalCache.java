package org.jasper.dtaDemo.wardinfoH;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.jena.atlas.json.JSON;
import org.apache.jena.atlas.json.JsonObject;
import org.apache.jena.atlas.json.JsonValue;

public class LocalCache {

	private static final int MAX_HR = 145;
	private static final int MIN_HR = 45;
	private static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ"); 
	
	public String getSensorData(String str){
		return "{\n" + 
				"    \"@context\": {\n" + 
				"      \"wardID\": \"http://coralcea.ca/demo/wardId\",\n" + 
				"      \"pData\": \"http://coralcea.ca/demo/patient/data\",\n" + 
				"      \"bpm\": \"http://coralcea.ca/demo/bpm\",\n" + 
				"      \"timestamp\": \"http://coralcea.ca/demo/timestamp\",\n" + 
				"      \"pid\": \"http://coralcea.ca/demo/patient/id\"\n" + 
				"    },\n" + 
				"    \"wardId\": \"Wing-5-Floor-3-Ward-4\", \n" + 
				"    \"pData\": [\n" + 
				"        {\n" + 
				"            \"bpm\": " + (MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1))) +   ", \n" + 
				"            \"timestamp\": \"" + dt.format(new Date()) + "\",\n" + 
				"            \"pid\": \"0\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"           \"bpm\": " + (MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1))) +  ", \n" + 
				"            \"timestamp\": \"" + dt.format(new Date()) + "\",\n" + 
				"            \"pid\": \"0\"\n" + 
				"        }, \n" + 
				"        {\n" + 
				"            \"bpm\": "+ (MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1))) + ", \n" + 
				"            \"timestamp\": \"" + dt.format(new Date()) + "\",\n" + 
				"            \"pid\": \"1\"\n" + 
				"        }, \n" + 
				"        {\n" + 
				"            \"bpm\": "+ (MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1))) + ", \n" + 
				"            \"timestamp\": \"" + dt.format(new Date()) + "\",\n" + 
				"            \"pid\": \"2\"\n" + 
				"        }, \n" + 
				"        {\n" + 
				"            \"bpm\": "+ (MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1))) + ", \n" + 
				"            \"timestamp\": \"" + dt.format(new Date()) + "\",\n" + 
				"            \"pid\": \"3\"\n" + 
				"        }, \n" + 
				"        {\n" + 
				"            \"bpm\": "+ (MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1))) + ", \n" + 
				"            \"timestamp\": \"" + dt.format(new Date()) + "\",\n" + 
				"            \"pid\": \"4\"\n" + 
				"        }\n" + 
				"    ]\n" + 
				"}";
				
	}

}
