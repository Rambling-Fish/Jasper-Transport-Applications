package org.jasper.jtaDemo.EMRC;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LocalCache {
	
	private static final Map<String, PatientInfo> PATIENTS;
	private static final String WARD_INFO_100K;
	static{
		StringBuffer sb = new StringBuffer();
		sb.append("WARD_INFO_100k");
		for(int i = 0;i < 10000;i++){
			sb.append("0123456789");
		}
		WARD_INFO_100K = sb.toString();
		
		Map<String, PatientInfo> aMap = new HashMap<String, PatientInfo>();
		aMap.put("001", new PatientInfo("001", "ICU-3", "1", "hr1", "bp1"));	
		aMap.put("002", new PatientInfo("002", "ICU-3", "2", "hr2", null));	
		aMap.put("003", new PatientInfo("003", "ICU-3", "3", null, "bp3"));	
		aMap.put("100k", new PatientInfo("100k", WARD_INFO_100K, "BED-100k", "100k", "100k"));	
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
