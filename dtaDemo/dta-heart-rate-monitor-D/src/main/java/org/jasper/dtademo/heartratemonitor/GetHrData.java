package org.jasper.dtademo.heartratemonitor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.apache.log4j.Logger;

@Generated("false")
@JsonTypeName("http://coralcea.ca/jasper/getHrData")
public class GetHrData implements Callable {

	private static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");
	
	private static final HrDataImpl[] shrData = new HrDataImpl[600];
	static{
		int MAX_HR = 145;
		int MIN_HR = 45;
		
		for(int i = 0;i<shrData.length;i++){
			int bpm = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
			String timestamp = dt.format(new Date());

			shrData[i] = new HrDataImpl();
			shrData[i].setBpm(bpm);
			shrData[i].setTimestamp(timestamp);
		}
		
	}	
	
	private Map<String, ArrayList<HrDataImpl>> hrSensors = new ConcurrentHashMap<String, ArrayList<HrDataImpl>>();	

	private static Logger log = Logger.getLogger(GetHrData.class.getName());
	
	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("false")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		
		if (message.getPayload() instanceof HrDataReq) {
			HrDataReq input = (HrDataReq) message.getPayload();
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
	 * @param hrDataReq
	 * @param muleMessage (on which you may set the outbound property 'statusCode' to an error code)
	 * @return HrData[] (or some other Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object process(HrDataReq hrDataReq, MuleMessage muleMessage) throws Exception {

		String hrSid = new String(hrDataReq.getHrSID());

		if ((hrSid == null) || (hrSid.length() == 0)) 
		{
			log.warn("null parameter : http://coralcea.ca/jasper/hrSID");
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new HrData[] {null};
		}
		
		if(isSpecialSID(hrSid)){
			return specialSensorInfo(hrSid);
		}
		
		int MAX_HR = 145;
		int MIN_HR = 45;
		int bpm = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
			
		ArrayList<HrDataImpl> hrData = hrSensors.get(hrSid);

		if(hrData == null){
			hrData = new ArrayList<HrDataImpl>();
			hrSensors.put(hrSid, hrData);
		}
		if(hrData.size()>10){
			hrData.remove(0);
		}
		
		HrDataImpl newHrData = new HrDataImpl();
		newHrData.setBpm(bpm);
		newHrData.setTimestamp(dt.format(new Date()));
		hrData.add(newHrData);
		
		muleMessage.setOutboundProperty("statusCode", 200);  // Ok

		return hrData.toArray(new HrDataImpl[]{});							
	}

	private HrData[] specialSensorInfo(String sID) {
		if("100k".equals(sID)){
			return shrData;
		}
		return new HrData[] {null};
	}

	private boolean isSpecialSID(String sID) {
		return ("100k".equals(sID));
	}
	
	// method below is temporary and to be removed once above JSC code can be tested
	/**
	 * @param String
	 * @param muleMessage (on which you may set the outbound property 'statusCode' to an error code)
	 * @return HrData[] (or some other Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object process(String request, MuleMessage muleMessage) throws Exception {

		String requestArray[] = request.split("\\?");
		if (requestArray.length != 2) {
			log.info("invalid request : " + request);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new HrData[] {null};
		}
				
		String parmPair[] = requestArray[1].split("\\=");
		if (parmPair.length != 2) {
			log.info("invalid parameter pair : " + requestArray[1]);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new HrData[] {null};
		}
		
		if (!parmPair[0].matches("http://coralcea.ca/jasper/hrSID"))
		{
			log.info("invalid parameter : " + parmPair[0]);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new HrData[] {null};
		}
		
		String hrSid = parmPair[1];

		if ((hrSid == null) || (hrSid.length() == 0)) 
		{
			log.info("null parameter : " + parmPair[0]);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new HrData[] {null};
		}
		
		if(isSpecialSID(hrSid)){
			return specialSensorInfo(hrSid);
		}
		
		int MAX_HR = 145;
		int MIN_HR = 45;
		int bpm = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
			
		ArrayList<HrDataImpl> hrData = hrSensors.get(hrSid);

		if(hrData == null){
			hrData = new ArrayList<HrDataImpl>();
			hrSensors.put(hrSid, hrData);
		}
		if(hrData.size()>10){
			hrData.remove(0);
		}
		
		HrDataImpl newHrData = new HrDataImpl();
		newHrData.setBpm(bpm);
		newHrData.setTimestamp(dt.format(new Date()));
		hrData.add(newHrData);
		
		muleMessage.setOutboundProperty("statusCode", 200);  // Ok

		return hrData.toArray(new HrDataImpl[]{});							
	}

}

