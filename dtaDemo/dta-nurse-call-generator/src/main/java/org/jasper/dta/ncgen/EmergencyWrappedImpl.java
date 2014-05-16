package org.jasper.dta.ncgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/EmergencyWrapped")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class EmergencyWrappedImpl implements EmergencyWrapped {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/emergency")
	private Emergency emergency;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/emergency")
	public Emergency getEmergency() {
		return emergency;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/emergency")
	public void setEmergency(Emergency emergency) {
		this.emergency = emergency;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((emergency == null) ? 0 : emergency.hashCode());
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
		EmergencyWrappedImpl other = (EmergencyWrappedImpl) obj;
		if (emergency == null) {
			if (other.emergency != null)
				return false;
		} else if (!emergency.equals(other.emergency))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "EmergencyWrappedImpl [ " + "emergency=" + emergency + " ]";
	}
}
