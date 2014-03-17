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
    private static final String WARD_INFO_100K;
    static{
            StringBuffer sb = new StringBuffer();
            sb.append("WARD_INFO_100k");
            for(int i = 0;i < 10000;i++){
                    sb.append("0123456789");
            }
            WARD_INFO_100K = sb.toString();

            Map<String, PatientInfoImpl> aMap = new HashMap<String, PatientInfoImpl>();
            aMap.put("001", new PatientInfoImpl("ICU-3", "1", "hr1", "bp1"));
            aMap.put("002", new PatientInfoImpl("ICU-3", "2", "hr2", null));
            aMap.put("003", new PatientInfoImpl("ICU-3", "3", null, "bp3"));
            aMap.put("100k", new PatientInfoImpl(WARD_INFO_100K, "BED-100k", "100k", "100k"));
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

		return new PatientInfo[] {PATIENTS.get(patientId)};
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
}

