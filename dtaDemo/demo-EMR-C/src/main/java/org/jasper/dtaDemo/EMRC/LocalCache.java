package org.jasper.dtaDemo.EMRC;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.jena.atlas.json.JSON;
import org.apache.jena.atlas.json.JsonObject;
import org.apache.jena.atlas.json.JsonValue;

public class LocalCache {
	
	private static final Map<String, PatientInfo> PATIENTS;
	private static final String WARD_INFO_10K;
	private static final String WARD_INFO_20K;
	private static final String WARD_INFO_30K;
	private static final String WARD_INFO_40K;
	private static final String WARD_INFO_50K;
	private static final String WARD_INFO_60K;
	private static final String WARD_INFO_70K;
	private static final String WARD_INFO_80K;
	private static final String WARD_INFO_90K;
	private static final String WARD_INFO_100K;
	
	static{
		StringBuffer sbFinalResult = new StringBuffer();
		StringBuffer sb10K = new StringBuffer();

		for(int i = 0;i < 1000;i++){
			sb10K.append("0123456789");
		}
		

		sbFinalResult.append(sb10K); WARD_INFO_10K = "WARD_INFO_10K" + sbFinalResult.toString(); 
		sbFinalResult.append(sb10K); WARD_INFO_20K = "WARD_INFO_20K" + sbFinalResult.toString();
		sbFinalResult.append(sb10K); WARD_INFO_30K = "WARD_INFO_30K" + sbFinalResult.toString();
		sbFinalResult.append(sb10K); WARD_INFO_40K = "WARD_INFO_40K" + sbFinalResult.toString();
		sbFinalResult.append(sb10K); WARD_INFO_50K = "WARD_INFO_50K" + sbFinalResult.toString();
		sbFinalResult.append(sb10K); WARD_INFO_60K = "WARD_INFO_60K" + sbFinalResult.toString();
		sbFinalResult.append(sb10K); WARD_INFO_70K = "WARD_INFO_70K" + sbFinalResult.toString();
		sbFinalResult.append(sb10K); WARD_INFO_80K = "WARD_INFO_80K" + sbFinalResult.toString();
		sbFinalResult.append(sb10K); WARD_INFO_90K = "WARD_INFO_90K" + sbFinalResult.toString();
		sbFinalResult.append(sb10K); WARD_INFO_100K = "WARD_INFO_100K" + sbFinalResult.toString();		
		
		Map<String, PatientInfo> aMap = new HashMap<String, PatientInfo>();
		aMap.put("001", new PatientInfo("001", "ICU-3", "1", "hr1", "bp1"));	
		aMap.put("002", new PatientInfo("002", "ICU-3", "2", "hr2", null));	
		aMap.put("003", new PatientInfo("003", "ICU-3", "3", null, "bp3"));	
		aMap.put("10k", new PatientInfo("10k", WARD_INFO_10K, "BED-10k", "10k", "10k"));
		aMap.put("20k", new PatientInfo("20k", WARD_INFO_20K, "BED-20k", "20k", "20k"));
		aMap.put("30k", new PatientInfo("30k", WARD_INFO_30K, "BED-30k", "30k", "30k"));
		aMap.put("40k", new PatientInfo("40k", WARD_INFO_40K, "BED-40k", "40k", "40k"));
		aMap.put("50k", new PatientInfo("50k", WARD_INFO_50K, "BED-50k", "50k", "50k"));
		aMap.put("60k", new PatientInfo("60k", WARD_INFO_60K, "BED-60k", "60k", "60k"));
		aMap.put("70k", new PatientInfo("70k", WARD_INFO_70K, "BED-70k", "70k", "70k"));
		aMap.put("80k", new PatientInfo("80k", WARD_INFO_80K, "BED-80k", "80k", "80k"));
		aMap.put("90k", new PatientInfo("90k", WARD_INFO_90K, "BED-90k", "90k", "90k"));	
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

	public PatientInfo getPatientInfo(String str){

		JsonObject myjobj = JSON.parse(str);
		JsonValue  myjvalue = myjobj.get(PatientInfo.PID_URI);
		String pidstring = new String(myjvalue.toString());

		// the converted Json string has double quotes that must be removed.
		pidstring = pidstring.replaceAll("\"","");
		
		return PATIENTS.get(pidstring);		
	}

}
