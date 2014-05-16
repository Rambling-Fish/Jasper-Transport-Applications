package org.jasper.dta.bmgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/RoomTempUpdate")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class RoomTempUpdateImpl implements RoomTempUpdate {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/temperature")
	private int temperature;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
	private String payload;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	private String timestamp;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomID")
	private String roomID;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/temperature")
	public int getTemperature() {
		return temperature;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
	public String getPayload() {
		return payload;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomID")
	public String getRoomID() {
		return roomID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/temperature")
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomID")
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + temperature;
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
		result = prime * result
				+ ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((roomID == null) ? 0 : roomID.hashCode());
		return result;
	}

	@Override
	@Generated("true")
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomTempUpdateImpl other = (RoomTempUpdateImpl) obj;
		if (temperature != other.temperature)
			return false;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (roomID == null) {
			if (other.roomID != null)
				return false;
		} else if (!roomID.equals(other.roomID))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "RoomTempUpdateImpl [ " + "temperature=" + temperature + ", "
				+ "payload=" + payload + ", " + "timestamp=" + timestamp + ", "
				+ "roomID=" + roomID + " ]";
	}
}
