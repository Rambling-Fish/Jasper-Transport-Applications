package org.jasper.dtademo.roomtemperature;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonTypeName;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

@Generated("false")
@JsonTypeName("http://coralcea.ca/jasper/updateRoomTemp")
public class UpdateRoomTemp implements Callable {
	
	private static Map<String,RoomTempDataImpl> roomTempData = new ConcurrentHashMap<String,RoomTempDataImpl>();
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
	
	public RoomTempDataImpl getRoomTempData(String roomId){
		return roomTempData.get(roomId);
	}

	/**
	 * @param roomTempUpdateReq
	 * @param muleMessage (on which you may set the outbound property 'statusCode' to an error code)
	 * @return null (or some other Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object process(RoomTempUpdateReq roomTempUpdateReq, MuleMessage muleMessage) throws Exception {
		RoomTempDataImpl newRoomTemp = new RoomTempDataImpl();
		int newTemp = roomTempUpdateReq.getRoomTemperature();
		String newTimestamp = roomTempUpdateReq.getTimestamp();
		String roomId = roomTempUpdateReq.getRoomId();
		
		if(roomId == null || roomId.length() == 0){
			return null;
		}
		
		if(newTimestamp == null || newTimestamp.length() == 0){
			newTimestamp = dt.format(new Date());
		}
		
		newRoomTemp.setRoomTemperature(newTemp);
		newRoomTemp.setTimestamp(newTimestamp);
		roomTempData.put(roomId, newRoomTemp);
		muleMessage.setOutboundProperty("statusCode", 200);
		
		return newRoomTemp;
	}
}

