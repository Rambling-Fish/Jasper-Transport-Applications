package org.jasper.dta.ncgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/CancelCallNurseWrapped")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class CancelCallNurseWrappedImpl implements CancelCallNurseWrapped {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelCallNurse")
	private CancelCallNurse cancelCallNurse;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelCallNurse")
	public CancelCallNurse getCancelCallNurse() {
		return cancelCallNurse;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelCallNurse")
	public void setCancelCallNurse(CancelCallNurse cancelCallNurse) {
		this.cancelCallNurse = cancelCallNurse;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cancelCallNurse == null) ? 0 : cancelCallNurse.hashCode());
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
		CancelCallNurseWrappedImpl other = (CancelCallNurseWrappedImpl) obj;
		if (cancelCallNurse == null) {
			if (other.cancelCallNurse != null)
				return false;
		} else if (!cancelCallNurse.equals(other.cancelCallNurse))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "CancelCallNurseWrappedImpl [ " + "cancelCallNurse="
				+ cancelCallNurse + " ]";
	}
}
