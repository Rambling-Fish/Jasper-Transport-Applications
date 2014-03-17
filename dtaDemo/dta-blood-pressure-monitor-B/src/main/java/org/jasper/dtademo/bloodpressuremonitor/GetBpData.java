package org.jasper.dtademo.bloodpressuremonitor;

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
@JsonTypeName("http://coralcea.ca/jasper/getBpData")
public class GetBpData implements Callable {

	private static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

	private static final BpDataImpl[] sbpData = new BpDataImpl[375];
	static{
        int MAX_S = 145;
        int MIN_S = 70;
        int MAX_D = 90;
        int MIN_D = 50;
		
		for(int i = 0;i<sbpData.length;i++){
            int s = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
            int d = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
			String timestamp = dt.format(new Date());

			sbpData[i] = new BpDataImpl();
			sbpData[i].setDiastolic(d);
			sbpData[i].setSystolic(s);
			sbpData[i].setTimestamp(timestamp);
		}
		
	}	
	
	private Map<String, ArrayList<BpDataImpl>> bpSensors = new ConcurrentHashMap<String, ArrayList<BpDataImpl>>();

	private static Logger log = Logger.getLogger(GetBpData.class.getName());
	
	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("true")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();

		if (message.getPayload() instanceof BpDataReq) {
			BpDataReq input = (BpDataReq) message.getPayload();
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
	 * @param bpDataReq
	 * @param muleMessage (on which you may set the outbound property 'statusCode' to an error code)
	 * @return BpData[] (or some other Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object process(BpDataReq bpDataReq, MuleMessage muleMessage) throws Exception {

		String bpSid = new String(bpDataReq.getBpSID());
		
		if ((bpSid == null) || (bpSid.length() == 0)) 
		{
			log.warn("null parameter : http://coralcea.ca/jasper/bpSID");
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new BpData[] {null};
		}

		if(isSpecialSID(bpSid)){
			return specialSensorInfo(bpSid);
		}
		
        int MAX_S = 145;
        int MIN_S = 70;
        int MAX_D = 90;
        int MIN_D = 50;
        int s = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
        int d = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
			
		ArrayList<BpDataImpl> bpData = bpSensors.get(bpSid);

		if(bpData == null){
			bpData = new ArrayList<BpDataImpl>();
			bpSensors.put(bpSid, bpData);
		}
		if(bpData.size()>10){
			bpData.remove(0);
		}
		
		BpDataImpl newBpData = new BpDataImpl();
		newBpData.setDiastolic(d);
		newBpData.setSystolic(s);
		newBpData.setTimestamp(dt.format(new Date()));
		bpData.add(newBpData);

		muleMessage.setOutboundProperty("statusCode", 200);  // Ok

		return bpData.toArray(new BpDataImpl[]{});							
	}

	private BpData[] specialSensorInfo(String sID) {
		if("100k".equals(sID)){
			return sbpData;
		}
		return new BpData[] {null};
	}

	private boolean isSpecialSID(String sID) {
		return ("100k".equals(sID));
	}

	// method below is temporary and to be removed once above JSC code can be tested
	/**
	 * @param String
	 * @param muleMessage (on which you may set the outbound property 'statusCode' to an error code)
	 * @return BpData[] (or some other Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object process(String request, MuleMessage muleMessage) throws Exception {

		String requestArray[] = request.split("\\?");
		if (requestArray.length != 2) {
			log.info("invalid request : " + request);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new BpData[] {null};
		}
				
		String parmPair[] = requestArray[1].split("\\=");
		if (parmPair.length != 2) {
			log.info("invalid parameter pair : " + requestArray[1]);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new BpData[] {null};
		}
		
		if (!parmPair[0].matches("http://coralcea.ca/jasper/bpSID"))
		{
			log.info("invalid parameter : " + parmPair[0]);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new BpData[] {null};
		}
		
		String bpSid = parmPair[1];

		if ((bpSid == null) || (bpSid.length() == 0)) 
		{
			log.info("null parameter : " + parmPair[0]);
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new BpData[] {null};
		}

		if(isSpecialSID(bpSid)){
			return specialSensorInfo(bpSid);
		}
		
        int MAX_S = 145;
        int MIN_S = 70;
        int MAX_D = 90;
        int MIN_D = 50;
        int s = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
        int d = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
			
		ArrayList<BpDataImpl> bpData = bpSensors.get(bpSid);

		if(bpData == null){
			bpData = new ArrayList<BpDataImpl>();
			bpSensors.put(bpSid, bpData);
		}
		if(bpData.size()>10){
			bpData.remove(0);
		}
		
		BpDataImpl newBpData = new BpDataImpl();
		newBpData.setDiastolic(d);
		newBpData.setSystolic(s);
		newBpData.setTimestamp(dt.format(new Date()));
		bpData.add(newBpData);
		
		muleMessage.setOutboundProperty("statusCode", 200);  // Ok

		return bpData.toArray(new BpDataImpl[]{});							
	}
}

