package org.jasper.dtademo.heartratemonitor;

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
@JsonTypeName("http://coralcea.ca/jasper/getHrData")
public class GetHrData implements Callable {

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
        SENSOR_DATA_2K  = new SensorData(generateArray(13));
        SENSOR_DATA_5K  = new SensorData(generateArray(32));
        SENSOR_DATA_10K = new SensorData(generateArray(63));
        SENSOR_DATA_20K = new SensorData(generateArray(126));
        SENSOR_DATA_30K = new SensorData(generateArray(190));
        SENSOR_DATA_40K = new SensorData(generateArray(253));
        SENSOR_DATA_50K = new SensorData(generateArray(317));
        SENSOR_DATA_60K = new SensorData(generateArray(380));
        SENSOR_DATA_70K = new SensorData(generateArray(443));
        SENSOR_DATA_80K = new SensorData(generateArray(507));
        SENSOR_DATA_90K = new SensorData(generateArray(570));
        SENSOR_DATA_100K = new SensorData(generateArray(633));

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
	
    private static HrData[] generateArray(int size){
        HrData[] array = new HrData[size];
        int MAX_HR = 99;
        int MIN_HR = 45;
        for(int i = 0;i<array.length;i++){
                int bpm = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
                array[i] = new HrDataImpl();
                array[i].setBpm(bpm);
                array[i].setTimestamp(dt.format(new Date()));
        }
        return array;
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

		if (hrDataReq.getHrSID() == null) 
		{
			log.warn("null HrDataReq hrSID parameter : http://coralcea.ca/jasper/hrSID");
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new HrData[] {null};
		}

		String hrSid = new String(hrDataReq.getHrSID());

		if ((hrSid == null) || (hrSid.length() == 0)) 
		{
			log.warn("null hrSid parameter : http://coralcea.ca/jasper/hrSID");
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new HrData[] {null};
		}

		if (hrSid.equalsIgnoreCase("0k"))
		{
			return new HrData[] {null};
		}

		if(SENSORS.containsKey(hrSid.toLowerCase())) {
			return SENSORS.get(hrSid.toLowerCase()).getSensorData();
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

		if(SENSORS.containsKey(hrSid)) {
			return SENSORS.get(hrSid).getSensorData();
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

