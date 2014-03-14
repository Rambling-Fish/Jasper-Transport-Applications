package org.jasper.dtademo.roomtemperature;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/RoomTempDataReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=RoomTempDataReqImpl.class, name="http://coralcea.ca/jasper/RoomTempDataReq")
})
public interface RoomTempDataReq {

	/**
	 * @return roomId 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public String getRoomId();

	/**
	 * @param roomId 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public void setRoomId(String roomId);
}

