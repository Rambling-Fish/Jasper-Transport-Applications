package org.jasper.dta.bmgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/RoomTempUpdate")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=RoomTempUpdateImpl.class, name="http://coralcea.ca/jasper/BuildingMgmt/RoomTempUpdate")
})
public interface RoomTempUpdate {

	/**
	 * @return temperature 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/temperature")
	public int getTemperature();

	/**
	 * @return payload 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
	public String getPayload();

	/**
	 * @return timestamp 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public String getTimestamp();

	/**
	 * @return roomID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomID")
	public String getRoomID();

	/**
	 * @param temperature 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/temperature")
	public void setTemperature(int temperature);

	/**
	 * @param payload 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
	public void setPayload(String payload);

	/**
	 * @param timestamp 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public void setTimestamp(String timestamp);

	/**
	 * @param roomID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomID")
	public void setRoomID(String roomID);
}

