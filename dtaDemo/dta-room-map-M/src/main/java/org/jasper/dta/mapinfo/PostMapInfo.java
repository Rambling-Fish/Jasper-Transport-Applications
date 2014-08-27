package org.jasper.dta.mapinfo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonTypeName;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/postMapInfo")
public class PostMapInfo implements Callable {

	@Generated("false")
	private static Map<String,String> mapData = new ConcurrentHashMap<String,String>();
	
	@Generated("false")
	public String getMapInfo(String roomName){
		return mapData.get(roomName);
	}

	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("true")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		MapInfoUpdateReq parameter = (MapInfoUpdateReq) message.getPayload();
		Object data = execute(parameter, message);
		message.setPayload(data);
		return message;
	}

	/**
	 * Execute the operation (put your implementation here)
	 * To report error code, call muleMessage.setOutboundProperty("code", <integer>)
	 * To report error description, call muleMessage.setOutboundProperty("description", <string>)
	 * 
	 * @param mapInfoUpdateReq
	 * @param muleMessage
	 * @return null (or another Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object execute(MapInfoUpdateReq mapInfoUpdateReq, MuleMessage muleMessage) throws Exception {
		String newMapInfo = new String();

		// room id
		String          roomId    = mapInfoUpdateReq.getRoomId();

		// full name 
		String          fullName    = mapInfoUpdateReq.getFullName();
				
		if(roomId == null || roomId.length() == 0){
			return null;
		}

		if(fullName == null || fullName.length() == 0){
			return null;
		}

		mapData.put(roomId, fullName);
		
		muleMessage.setOutboundProperty("statusCode", 200);
		
		return fullName;
	}
}

