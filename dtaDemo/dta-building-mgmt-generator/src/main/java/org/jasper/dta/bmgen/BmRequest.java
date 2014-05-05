package org.jasper.dta.bmgen;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BmRequest {
	public static final String JASPER_PREFIX          = "http://coralcea.ca/jasper/";
	public static final String BM_PREFIX              = "http://coralcea.ca/jasper/BuildingMgmt/";

	public static final String ROOM_ID                = "roomID";
	public static final String TEMPERATURE            = "temperature";
	public static final String TIMESTAMP              = "timestamp";

	public static final String DOOR_ID                = "doorID";
	public static final String DOOR_STATE             = "doorState";
	
	public static final String ROOM_ID_URI            = "http://coralcea.ca/jasper/BuildingMgmt/roomID";
	public static final String TEMPERATURE_URI        = "http://coralcea.ca/jasper/BuildingMgmt/temperature";
	public static final String TIMESTAMP_URI          = "http://coralcea.ca/jasper/timestamp";
	public static final String PAYLOAD_URI            = "http://coralcea.ca/jasper/BuildingMgmt/payload";

	public static final String DOOR_ID_URI            = "http://coralcea.ca/jasper/BuildingMgmt/doorID";
	public static final String DOOR_STATE_URI         = "http://coralcea.ca/jasper/BuildingMgmt/doorState";

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
            aMap.put("010", PAYLOAD_10K);
            aMap.put("020", PAYLOAD_20K);
            aMap.put("030", PAYLOAD_30K);
            aMap.put("040", PAYLOAD_40K);
            aMap.put("050", PAYLOAD_50K);
            aMap.put("060", PAYLOAD_60K);
            aMap.put("070", PAYLOAD_70K);
            aMap.put("080", PAYLOAD_80K);
            aMap.put("090", PAYLOAD_90K);
            aMap.put("100", PAYLOAD_100K);

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
