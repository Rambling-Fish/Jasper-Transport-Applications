package org.jasper.jtaDemo.EMRC;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LocalCache {
	
	private static final Map<String, PatientInfo> PATIENTS;
	static{
		Map<String, PatientInfo> aMap = new HashMap<String, PatientInfo>();
		aMap.put("001", new PatientInfo("001", "ICU-3", "1", "hr1", "bp1"));	
		aMap.put("002", new PatientInfo("002", "ICU-3", "3", "hr2", null));	
		aMap.put("003", new PatientInfo("004", "ICU-3", "4", null, "bp3"));	
		PATIENTS = Collections.unmodifiableMap(aMap);
	}
	
	public PatientInfo getPatientInfo(HashMap<String,String> map){
		
		if(map.get(PatientInfo.PID_URI) == null || !(map.get(PatientInfo.PID_URI) instanceof String)){
			return null;
		}
		
		String pid = (String)map.get(PatientInfo.PID_URI);
		
		return PATIENTS.get(pid);

	}
}
