package org.jasper.dtademo.roomtemperature;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/RoomTempData")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=RoomTempDataImpl.class, name="http://coralcea.ca/jasper/RoomTempData")
})
public interface RoomTempData {

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
}

