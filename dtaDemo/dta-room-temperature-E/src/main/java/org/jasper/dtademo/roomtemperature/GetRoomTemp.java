package org.jasper.dtademo.roomtemperature;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonTypeName;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

@Generated("false")
@JsonTypeName("http://coralcea.ca/jasper/getRoomTemp")
public class GetRoomTemp implements Callable {
	
	private UpdateRoomTemp updateTemp = new UpdateRoomTemp();

	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("false")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		RoomTempDataReq input = (RoomTempDataReq) message.getPayload();
		Object output = process(input, message);
		message.setPayload(output);
		
		return message;
	}

	/**
	 * @param roomTempDataReq
	 * @param muleMessage (on which you may set the outbound property 'statusCode' to an error code)
	 * @return RoomTempData (or some other Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object process(RoomTempDataReq roomTempDataReq, MuleMessage muleMessage) throws Exception {
		muleMessage.setOutboundProperty("statusCode", 200);
		String roomId = roomTempDataReq.getRoomId();
		
		return updateTemp.getRoomTempData(roomId);
	}
}

