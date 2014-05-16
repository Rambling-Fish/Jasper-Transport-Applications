package org.jasper.dta.ncgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/CancelEmergencyWrapped")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class CancelEmergencyWrappedImpl implements CancelEmergencyWrapped {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelEmergency")
	private CancelEmergency cancelEmergency;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelEmergency")
	public CancelEmergency getCancelEmergency() {
		return cancelEmergency;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelEmergency")
	public void setCancelEmergency(CancelEmergency cancelEmergency) {
		this.cancelEmergency = cancelEmergency;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cancelEmergency == null) ? 0 : cancelEmergency.hashCode());
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
		CancelEmergencyWrappedImpl other = (CancelEmergencyWrappedImpl) obj;
		if (cancelEmergency == null) {
			if (other.cancelEmergency != null)
				return false;
		} else if (!cancelEmergency.equals(other.cancelEmergency))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "CancelEmergencyWrappedImpl [ " + "cancelEmergency="
				+ cancelEmergency + " ]";
	}
}
