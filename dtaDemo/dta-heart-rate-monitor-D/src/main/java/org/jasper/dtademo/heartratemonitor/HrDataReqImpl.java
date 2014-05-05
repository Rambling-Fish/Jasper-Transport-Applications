package org.jasper.dtademo.heartratemonitor;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/HrDataReq")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class HrDataReqImpl implements HrDataReq {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSID")
	private String hrSID;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSID")
	public String getHrSID() {
		return hrSID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSID")
	public void setHrSID(String hrSID) {
		this.hrSID = hrSID;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hrSID == null) ? 0 : hrSID.hashCode());
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
		HrDataReqImpl other = (HrDataReqImpl) obj;
		if (hrSID == null) {
			if (other.hrSID != null)
				return false;
		} else if (!hrSID.equals(other.hrSID))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "HrDataReqImpl [ " + "hrSID=" + hrSID + " ]";
	}
}
