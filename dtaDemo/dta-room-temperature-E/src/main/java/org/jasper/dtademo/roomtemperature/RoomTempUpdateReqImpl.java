package org.jasper.dtademo.roomtemperature;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/RoomTempUpdateReq")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class RoomTempUpdateReqImpl implements RoomTempUpdateReq {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomTemperature")
	private int roomTemperature;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	private String timestamp;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	private String roomId;

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
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public String getRoomId() {
		return roomId;
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
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roomTemperature;
		result = prime * result
				+ ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
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
		RoomTempUpdateReqImpl other = (RoomTempUpdateReqImpl) obj;
		if (roomTemperature != other.roomTemperature)
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "RoomTempUpdateReqImpl [ " + "roomTemperature="
				+ roomTemperature + ", " + "timestamp=" + timestamp + ", "
				+ "roomId=" + roomId + " ]";
	}
}
