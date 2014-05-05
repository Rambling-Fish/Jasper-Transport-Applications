package org.jasper.dtademo.bloodpressuremonitor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
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

    private static final Map<String, SensorData> SENSORS;
    
    private static final SensorData SENSOR_DATA_2K;
    private static final SensorData SENSOR_DATA_5K;
    private static final SensorData SENSOR_DATA_10K;
    private static final SensorData SENSOR_DATA_20K;
    private static final SensorData SENSOR_DATA_30K;
    private static final SensorData SENSOR_DATA_40K;
    private static final SensorData SENSOR_DATA_50K;
    private static final SensorData SENSOR_DATA_60K;
    private static final SensorData SENSOR_DATA_70K;
    private static final SensorData SENSOR_DATA_80K;
    private static final SensorData SENSOR_DATA_90K;
    private static final SensorData SENSOR_DATA_100K;
    
    static{
        SENSOR_DATA_2K  = new SensorData(generateArray(10));
        SENSOR_DATA_5K  = new SensorData(generateArray(24));
        SENSOR_DATA_10K = new SensorData(generateArray(47));
        SENSOR_DATA_20K = new SensorData(generateArray(94));
        SENSOR_DATA_30K = new SensorData(generateArray(141));
        SENSOR_DATA_40K = new SensorData(generateArray(188));
        SENSOR_DATA_50K = new SensorData(generateArray(235));
        SENSOR_DATA_60K = new SensorData(generateArray(282));
        SENSOR_DATA_70K = new SensorData(generateArray(329));
        SENSOR_DATA_80K = new SensorData(generateArray(376));
        SENSOR_DATA_90K = new SensorData(generateArray(423));
        SENSOR_DATA_100K = new SensorData(generateArray(470));

        Map<String, SensorData> aMap = new HashMap<String, SensorData>();
    
        aMap.put("2k", SENSOR_DATA_2K);
        aMap.put("5k", SENSOR_DATA_5K);
        aMap.put("10k", SENSOR_DATA_10K);
        aMap.put("20k", SENSOR_DATA_20K);
        aMap.put("30k", SENSOR_DATA_30K);
        aMap.put("40k", SENSOR_DATA_40K);
        aMap.put("50k", SENSOR_DATA_50K);
        aMap.put("60k", SENSOR_DATA_60K);
        aMap.put("70k", SENSOR_DATA_70K);
        aMap.put("80k", SENSOR_DATA_80K);
        aMap.put("90k", SENSOR_DATA_90K);
        aMap.put("100k", SENSOR_DATA_100K);

        SENSORS = Collections.unmodifiableMap(aMap);
    }
	
    private static BpData[] generateArray(int size){
        BpData[] array = new BpData[size];
        int MAX_S = 99;
        int MIN_S = 70;
        int MAX_D = 90;
        int MIN_D = 50;
        for(int i = 0;i<array.length;i++){
                int s = MIN_S + (int)(Math.random() * ((MAX_S - MIN_S) + 1));
                int d = MIN_D + (int)(Math.random() * ((MAX_D - MIN_D) + 1));
                array[i] = new BpDataImpl();
                array[i].setDiastolic(d);
                array[i].setSystolic(s);
                array[i].setTimestamp(dt.format(new Date()));
        }
        return array;
    
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

		if(SENSORS.containsKey(bpSid.toLowerCase())) {
			return SENSORS.get(bpSid.toLowerCase()).getSensorData();
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

		if(SENSORS.containsKey(bpSid)) {
			return SENSORS.get(bpSid).getSensorData();
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

