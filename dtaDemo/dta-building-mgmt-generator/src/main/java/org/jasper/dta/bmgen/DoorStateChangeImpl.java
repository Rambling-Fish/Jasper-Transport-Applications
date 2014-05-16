package org.jasper.dta.bmgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/DoorStateChange")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class DoorStateChangeImpl implements DoorStateChange {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorID")
	private String doorID;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
	private String payload;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorState")
	private String doorState;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorID")
	public String getDoorID() {
		return doorID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
	public String getPayload() {
		return payload;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorState")
	public String getDoorState() {
		return doorState;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorID")
	public void setDoorID(String doorID) {
		this.doorID = doorID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorState")
	public void setDoorState(String doorState) {
		this.doorState = doorState;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doorID == null) ? 0 : doorID.hashCode());
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
		result = prime * result
				+ ((doorState == null) ? 0 : doorState.hashCode());
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
		DoorStateChangeImpl other = (DoorStateChangeImpl) obj;
		if (doorID == null) {
			if (other.doorID != null)
				return false;
		} else if (!doorID.equals(other.doorID))
			return false;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		if (doorState == null) {
			if (other.doorState != null)
				return false;
		} else if (!doorState.equals(other.doorState))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "DoorStateChangeImpl [ " + "doorID=" + doorID + ", "
				+ "payload=" + payload + ", " + "doorState=" + doorState + " ]";
	}
}
