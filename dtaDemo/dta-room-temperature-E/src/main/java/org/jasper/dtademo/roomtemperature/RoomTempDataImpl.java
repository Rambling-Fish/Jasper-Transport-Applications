package org.jasper.dtademo.roomtemperature;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/RoomTempData")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class RoomTempDataImpl implements RoomTempData {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomTemperature")
	private int roomTemperature;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	private String timestamp;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomTemperature")
	public int getRoomTemperature() {
		return roomTemperature;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomTemperature")
	public void setRoomTemperature(int roomTemperature) {
		this.roomTemperature = roomTemperature;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roomTemperature;
		result = prime * result
				+ ((timestamp == null) ? 0 : timestamp.hashCode());
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
		RoomTempDataImpl other = (RoomTempDataImpl) obj;
		if (roomTemperature != other.roomTemperature)
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "RoomTempDataImpl [ " + "roomTemperature=" + roomTemperature
				+ ", " + "timestamp=" + timestamp + " ]";
	}
}
