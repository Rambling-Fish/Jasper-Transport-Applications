package org.jasper.dta.bmgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/DoorStateChangeWrapped")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class DoorStateChangeWrappedImpl implements DoorStateChangeWrapped {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorStateChange")
	private DoorStateChange doorStateChange;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorStateChange")
	public DoorStateChange getDoorStateChange() {
		return doorStateChange;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorStateChange")
	public void setDoorStateChange(DoorStateChange doorStateChange) {
		this.doorStateChange = doorStateChange;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((doorStateChange == null) ? 0 : doorStateChange.hashCode());
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
		DoorStateChangeWrappedImpl other = (DoorStateChangeWrappedImpl) obj;
		if (doorStateChange == null) {
			if (other.doorStateChange != null)
				return false;
		} else if (!doorStateChange.equals(other.doorStateChange))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "DoorStateChangeWrappedImpl [ " + "doorStateChange="
				+ doorStateChange + " ]";
	}
}
