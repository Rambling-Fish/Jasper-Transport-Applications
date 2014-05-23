package org.jasper.dtademo.emr;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.apache.log4j.Logger;

@Generated("false")
@JsonTypeName("http://coralcea.ca/jasper/getPatientInfo")
public class GetPatientInfo implements Callable {

    private static final Map<String, PatientInfoImpl> PATIENTS;

    private static final String WARD_INFO_2K;
    private static final String WARD_INFO_5K;
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
        StringBuffer sb9780 = new StringBuffer();
        StringBuffer sb2K = new StringBuffer();
        StringBuffer sb5K = new StringBuffer();
        StringBuffer sb10K = new StringBuffer();

        // reduce 2k string buffer to 1780 bytes (less 220).  Total json response is approx 2k.
        for(int i = 0;i < 178;i++){
        	sb2K.append("0123456789");
        }

        // reduce 5k string buffer to 1780 bytes (less 220).  Total json response is approx 5k.
        for(int i = 0;i < 478;i++){
        	sb5K.append("0123456789");
        }

        // reduce initial 10k string buffer to 9780 bytes (less 220).  Total json response is approx 10k.
        for(int i = 0;i < 978;i++){
        	sb9780.append("0123456789");
        }

        // 10k appender.
        for(int i = 0;i < 1000;i++){
        	sb10K.append("0123456789");
        }

        WARD_INFO_2K = "WARD_INFO_2K" + sb2K.toString();
        WARD_INFO_5K = "WARD_INFO_5K" + sb5K.toString();
        sbFinalResult.append(sb9780); WARD_INFO_10K = "WARD_INFO_10K" + sbFinalResult.toString();
        sbFinalResult.append(sb10K); WARD_INFO_20K = "WARD_INFO_20K" + sbFinalResult.toString();
        sbFinalResult.append(sb10K); WARD_INFO_30K = "WARD_INFO_30K" + sbFinalResult.toString();
        sbFinalResult.append(sb10K); WARD_INFO_40K = "WARD_INFO_40K" + sbFinalResult.toString();
        sbFinalResult.append(sb10K); WARD_INFO_50K = "WARD_INFO_50K" + sbFinalResult.toString();
        sbFinalResult.append(sb10K); WARD_INFO_60K = "WARD_INFO_60K" + sbFinalResult.toString();
        sbFinalResult.append(sb10K); WARD_INFO_70K = "WARD_INFO_70K" + sbFinalResult.toString();
        sbFinalResult.append(sb10K); WARD_INFO_80K = "WARD_INFO_80K" + sbFinalResult.toString();
        sbFinalResult.append(sb10K); WARD_INFO_90K = "WARD_INFO_90K" + sbFinalResult.toString();
        sbFinalResult.append(sb10K); WARD_INFO_100K = "WARD_INFO_100K" + sbFinalResult.toString();
    	
            Map<String, PatientInfoImpl> aMap = new HashMap<String, PatientInfoImpl>();

            aMap.put("001", new PatientInfoImpl("001", "ICU-3", "1", "hr1", "bp1"));
            aMap.put("002", new PatientInfoImpl("002", "ICU-3", "2", "hr2", null));
            aMap.put("003", new PatientInfoImpl("003", "ICU-3", "3", null, "bp3"));
            
            // 011 returns patientID 012 
            // 012 returns patientID 012 ok
            aMap.put("011", new PatientInfoImpl("012", "ICU-10", "1", "hr11", "bp11"));
            aMap.put("012", new PatientInfoImpl("012", "ICU-10", "2", "hr12", "bp12"));
            
            // 021 returns patientID 022 <--.
            // 022 returns patientID 021  --'
            aMap.put("021", new PatientInfoImpl("022", "ICU-20", "1", "hr21", "bp21"));
            aMap.put("022", new PatientInfoImpl("021", "ICU-20", "2", "hr22", "bp22"));
            
            // 031 returns patientID 032
            // 032 returns patientID 033
            // 033 returns patientID 033 ok
            aMap.put("031", new PatientInfoImpl("032", "ICU-30", "1", "hr31", "bp31"));
            aMap.put("032", new PatientInfoImpl("033", "ICU-30", "2", "hr32", "bp32"));
            aMap.put("033", new PatientInfoImpl("033", "ICU-30", "3", "hr33", "bp33"));
            
            // 041 returns patientID 042 <--.
            // 042 returns patientID 043    |
            // 043 returns patientID 041  --'
            aMap.put("041", new PatientInfoImpl("042", "ICU-40", "1", "hr41", "bp41"));
            aMap.put("042", new PatientInfoImpl("043", "ICU-40", "2", "hr42", "bp42"));
            aMap.put("043", new PatientInfoImpl("041", "ICU-40", "3", "hr43", "bp43"));

            aMap.put("2k", new PatientInfoImpl("2k", WARD_INFO_2K, "BED-2k", "2k", "2k"));
            aMap.put("5k", new PatientInfoImpl("5k", WARD_INFO_5K, "BED-5k", "5k", "5k"));
            aMap.put("10k", new PatientInfoImpl("10k", WARD_INFO_10K, "BED-10k", "10k", "10k"));
            aMap.put("20k", new PatientInfoImpl("20k", WARD_INFO_20K, "BED-20k", "20k", "20k"));
            aMap.put("30k", new PatientInfoImpl("30k", WARD_INFO_30K, "BED-30k", "30k", "30k"));
            aMap.put("40k", new PatientInfoImpl("40k", WARD_INFO_40K, "BED-40k", "40k", "40k"));
            aMap.put("50k", new PatientInfoImpl("50k", WARD_INFO_50K, "BED-50k", "50k", "50k"));
            aMap.put("60k", new PatientInfoImpl("60k", WARD_INFO_60K, "BED-60k", "60k", "60k"));
            aMap.put("70k", new PatientInfoImpl("70k", WARD_INFO_70K, "BED-70k", "70k", "70k"));
            aMap.put("80k", new PatientInfoImpl("80k", WARD_INFO_80K, "BED-80k", "80k", "80k"));
            aMap.put("90k", new PatientInfoImpl("90k", WARD_INFO_90K, "BED-90k", "90k", "90k"));
            aMap.put("100k", new PatientInfoImpl("100k", WARD_INFO_100K, "BED-100k", "100k", "100k"));

            PATIENTS = Collections.unmodifiableMap(aMap);
    }

    private static Logger log = Logger.getLogger(GetPatientInfo.class.getName());
    
    /**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("false")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {

		MuleMessage message = muleEventContext.getMessage();

		if (message.getPayload() instanceof PatientInfoReq) {
			PatientInfoReq input = (PatientInfoReq) message.getPayload();
			Object output = process(input, message);
			message.setPayload(output);
		} 
		else
		{
			String input = (String) message.getPayload();
			Object output = process(input, message);
			message.setPayload(output);
		}
		
		return message;
	}

	/**
	 * @param patientInfoReq
	 * @param muleMessage (on which you may set the outbound property 'statusCode' to an error code)
	 * @return PatientInfo[] (or some other Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object process(PatientInfoReq patientInfoReq, MuleMessage muleMessage) throws Exception {

		String patientId = patientInfoReq.getPatientID();

		if ((patientId == null) || (patientId.length() == 0)) 
		{
			log.info("null parameter : http://coralcea.ca/jasper/patientID");
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new PatientInfo[] {null};
		}
		
		muleMessage.setOutboundProperty("statusCode", 200);  // Ok

		return new PatientInfo[] {PATIENTS.get(patientId.toLowerCase())};
	}

	// method below is temporary and to be removed once above JSC code can be tested
	/**
	 * @param String
	 * @param muleMessage (on which you may set the outbound property 'statusCode' to an error code)
	 * @return PatientInfo[] (or some other Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object process(String patientInfoReq, MuleMessage muleMessage) throws Exception {

		String requestArray[] = patientInfoReq.split("\\?");
		if (requestArray.length != 2) {
			log.info("invalid request : " + patientInfoReq);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new PatientInfo[] {null};
		}

		String parmPair[] = requestArray[1].split("\\=");
		if (parmPair.length != 2) {
			log.info("invalid parameter pair : " + requestArray[1]);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new PatientInfo[] {null};
		}
		
		if (!parmPair[0].matches("http://coralcea.ca/jasper/patientID"))
		{
			log.info("invalid parameter : " + parmPair[0]);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new PatientInfo[] {null};
		}
		
		String patientId = parmPair[1];
		
		if ((patientId == null) || (patientId.length() == 0)) 
		{
			log.info("null parameter : " + parmPair[0]);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new PatientInfo[] {null};
		}

		muleMessage.setOutboundProperty("statusCode", 200);  // Ok

		return new PatientInfo[] {PATIENTS.get(patientId)};
	}

	/**
	 * Execute the operation (put your implementation here)
	 * To report error code, call muleMessage.setOutboundProperty("code", <integer>)
	 * To report error description, call muleMessage.setOutboundProperty("description", <string>)
	 * 
	 * @param patientInfoReq
	 * @param muleMessage
	 * @return PatientInfo[] (or another Object if this processor is not terminal)
	 */
	@Generated("true")
	private Object execute(PatientInfoReq patientInfoReq, MuleMessage muleMessage) throws Exception {
		return null;
	}
}

