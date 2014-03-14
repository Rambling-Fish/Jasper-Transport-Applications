package org.jasper.dtademo.roomtemperature;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonTypeName;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

@Generated("false")
@JsonTypeName("http://coralcea.ca/jasper/updateRoomTemp")
public class UpdateRoomTemp implements Callable {
	
	private static final RoomTempDataImpl roomTempData = new RoomTempDataImpl();
	private static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");

	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("false")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		RoomTempUpdateReq input = (RoomTempUpdateReq) message.getPayload();
		Object output = process(input, message);
		message.setPayload(output);
		
		return message;
	}
	
	public RoomTempDataImpl getInstance(){
		return roomTempData;
	}

	/**
	 * @param roomTempUpdateReq
	 * @param muleMessage (on which you may set the outbound property 'statusCode' to an error code)
	 * @return null (or some other Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object process(RoomTempUpdateReq roomTempUpdateReq, MuleMessage muleMessage) throws Exception {
		int newTemp = roomTempUpdateReq.getRoomTemperature();
		String newTimestamp = roomTempUpdateReq.getTimestamp();
		
		if(newTimestamp == null || newTimestamp.length() == 0){
			newTimestamp = dt.format(new Date());
		}
		
		roomTempData.setRoomTemperature(newTemp);
		roomTempData.setTimestamp(newTimestamp);
		muleMessage.setOutboundProperty("statusCode", 200);
		
		return roomTempData;
	}
}

