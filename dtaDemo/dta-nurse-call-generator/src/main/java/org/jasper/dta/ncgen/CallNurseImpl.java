package org.jasper.dta.ncgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/CallNurse")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class CallNurseImpl implements CallNurse {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/location")
	private String location;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/payload")
	private String payload;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/location")
	public String getLocation() {
		return location;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/payload")
	public String getPayload() {
		return payload;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/location")
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/payload")
	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
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
		CallNurseImpl other = (CallNurseImpl) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "CallNurseImpl [ " + "location=" + location + ", " + "payload="
				+ payload + " ]";
	}
}
