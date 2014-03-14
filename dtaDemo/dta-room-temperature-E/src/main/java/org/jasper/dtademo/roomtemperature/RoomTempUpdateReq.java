package org.jasper.dtademo.roomtemperature;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/RoomTempUpdateReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=RoomTempUpdateReqImpl.class, name="http://coralcea.ca/jasper/RoomTempUpdateReq")
})
public interface RoomTempUpdateReq {

	/**
	 * @return roomTemperature 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomTemperature")
	public int getRoomTemperature();

	/**
	 * @return timestamp 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public String getTimestamp();

	/**
	 * @return roomId 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public String getRoomId();

	/**
	 * @param roomTemperature 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomTemperature")
	public void setRoomTemperature(int roomTemperature);

	/**
	 * @param timestamp 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public void setTimestamp(String timestamp);

	/**
	 * @param roomId 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public void setRoomId(String roomId);
}

