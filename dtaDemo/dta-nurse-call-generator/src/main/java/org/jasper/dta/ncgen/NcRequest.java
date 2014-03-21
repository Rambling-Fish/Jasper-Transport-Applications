package org.jasper.dta.ncgen;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NcRequest {

	public static final String PREFIX                 = "http://coralcea.ca/jasper/NurseCall/";

	public static final String CALL_NURSE             = "callNurse";
	public static final String CANCEL_CALL_NURSE      = "cancelCallNurse";
	public static final String EMERGENCY              = "emergency";
	public static final String CANCEL_EMERGENCY       = "cancelEmergency";

	public static final String CALL_NURSE_URI         = PREFIX + CALL_NURSE;
	public static final String CANCEL_CALL_NURSE_URI  = PREFIX + CANCEL_CALL_NURSE;
	public static final String EMERGENCY_URI          = PREFIX + EMERGENCY;
	public static final String CANCEL_EMERGENCY_URI   = PREFIX + CANCEL_EMERGENCY;
	
	public static final String LOCATION_URI           = "http://coralcea.ca/jasper/nc/location";

	public static final Map<String, String> PAYLOADS;

    private static final String PAYLOAD_10K  = SetPayload("PAYLOAD_10k",   10000);
    private static final String PAYLOAD_20K  = SetPayload("PAYLOAD_20k",   20000);
    private static final String PAYLOAD_30K  = SetPayload("PAYLOAD_30k",   30000);
    private static final String PAYLOAD_40K  = SetPayload("PAYLOAD_40k",   40000);
    private static final String PAYLOAD_50K  = SetPayload("PAYLOAD_50k",   50000);
    private static final String PAYLOAD_60K  = SetPayload("PAYLOAD_60k",   60000);
    private static final String PAYLOAD_70K  = SetPayload("PAYLOAD_70k",   70000);
    private static final String PAYLOAD_80K  = SetPayload("PAYLOAD_80k",   80000);
    private static final String PAYLOAD_90K  = SetPayload("PAYLOAD_90k",   90000);
    private static final String PAYLOAD_100K = SetPayload("PAYLOAD_100k", 100000);

    static{
            Map<String, String> aMap = new HashMap<String, String>();
            aMap.put("bed010", PAYLOAD_10K);
            aMap.put("bed020", PAYLOAD_20K);
            aMap.put("bed030", PAYLOAD_30K);
            aMap.put("bed040", PAYLOAD_40K);
            aMap.put("bed050", PAYLOAD_50K);
            aMap.put("bed060", PAYLOAD_60K);
            aMap.put("bed070", PAYLOAD_70K);
            aMap.put("bed080", PAYLOAD_80K);
            aMap.put("bed090", PAYLOAD_90K);
            aMap.put("bed100", PAYLOAD_100K);

            PAYLOADS = Collections.unmodifiableMap(aMap);
    }
    
    private static String SetPayload(String title, int size)
    {
    	StringBuffer sb = new StringBuffer();
    	int loopSize = size/10;
    	sb.append(title);
    	for(int i = 0;i < loopSize;i++){
    		sb.append("0123456789");
    	}
    	return sb.toString();
    }
}
