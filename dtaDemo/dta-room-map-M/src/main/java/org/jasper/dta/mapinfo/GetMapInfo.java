package org.jasper.dta.mapinfo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/getMapInfo")
public class GetMapInfo implements Callable {

	private PostMapInfo updateMap = new PostMapInfo();
	
	private static Logger log = Logger.getLogger(GetMapInfo.class.getName());

	private static final Map<String, String> MAPPINGS;
	
	static {
        Map<String, String> aMap = new HashMap<String, String>();

        aMap.put("room001", "Dr John Brown");
        aMap.put("room002", "Dr Jane Green");
        aMap.put("room003", "Dr Peter Black");

        MAPPINGS = Collections.unmodifiableMap(aMap);
	}

	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("true")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		MapInfoReq parameter = (MapInfoReq) message.getPayload();
		Object data = execute(parameter, message);
		message.setPayload(data);
		return message;
	}

	/**
	 * Execute the operation (put your implementation here)
	 * To report error code, call muleMessage.setOutboundProperty("code", <integer>)
	 * To report error description, call muleMessage.setOutboundProperty("description", <string>)
	 * 
	 * @param mapInfoReq
	 * @param muleMessage
	 * @return String ':map/fullName' (or another Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object execute(MapInfoReq mapInfoReq, MuleMessage muleMessage) throws Exception {
		String roomName = mapInfoReq.getRoomId();

		if ((roomName == null) || (roomName.length() == 0)) 
		{
			log.info("null parameter : http://coralcea.ca/jasper/roomId");
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return null;
		}
		
		muleMessage.setOutboundProperty("statusCode", 200);  // Ok

		// return dynamic data first if found
		if (updateMap.getMapInfo(roomName) != null)
			return updateMap.getMapInfo(roomName);
		
		// return static data if dynamic data is not found
		if (MAPPINGS.containsKey(roomName))
			return MAPPINGS.get(roomName);
	
		return null;
	}
}

