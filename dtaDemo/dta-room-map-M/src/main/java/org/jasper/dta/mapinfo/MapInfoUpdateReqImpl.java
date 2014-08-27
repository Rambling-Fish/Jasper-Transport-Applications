package org.jasper.dta.mapinfo;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/MapInfoUpdateReq")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class MapInfoUpdateReqImpl implements MapInfoUpdateReq {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/map/fullName")
	private String fullName;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	private String roomId;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/map/fullName")
	public String getFullName() {
		return fullName;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public String getRoomId() {
		return roomId;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/map/fullName")
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
		result = prime * result
				+ ((fullName == null) ? 0 : fullName.hashCode());
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
		MapInfoUpdateReqImpl other = (MapInfoUpdateReqImpl) obj;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
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
		return "MapInfoUpdateReqImpl [ " + "fullName=" + fullName + ", "
				+ "roomId=" + roomId + " ]";
	}
}
