package org.jasper.dta.ncgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/CallNurseWrapped")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class CallNurseWrappedImpl implements CallNurseWrapped {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/callNurse")
	private CallNurse callNurse;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/callNurse")
	public CallNurse getCallNurse() {
		return callNurse;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/callNurse")
	public void setCallNurse(CallNurse callNurse) {
		this.callNurse = callNurse;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((callNurse == null) ? 0 : callNurse.hashCode());
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
		CallNurseWrappedImpl other = (CallNurseWrappedImpl) obj;
		if (callNurse == null) {
			if (other.callNurse != null)
				return false;
		} else if (!callNurse.equals(other.callNurse))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "CallNurseWrappedImpl [ " + "callNurse=" + callNurse + " ]";
	}
}
