package org.jasper.dta.bmgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/RoomTempUpdateWrapped")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class RoomTempUpdateWrappedImpl implements RoomTempUpdateWrapped {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomTempUpdate")
	private RoomTempUpdate roomTempUpdate;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomTempUpdate")
	public RoomTempUpdate getRoomTempUpdate() {
		return roomTempUpdate;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomTempUpdate")
	public void setRoomTempUpdate(RoomTempUpdate roomTempUpdate) {
		this.roomTempUpdate = roomTempUpdate;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((roomTempUpdate == null) ? 0 : roomTempUpdate.hashCode());
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
		RoomTempUpdateWrappedImpl other = (RoomTempUpdateWrappedImpl) obj;
		if (roomTempUpdate == null) {
			if (other.roomTempUpdate != null)
				return false;
		} else if (!roomTempUpdate.equals(other.roomTempUpdate))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "RoomTempUpdateWrappedImpl [ " + "roomTempUpdate="
				+ roomTempUpdate + " ]";
	}
}
