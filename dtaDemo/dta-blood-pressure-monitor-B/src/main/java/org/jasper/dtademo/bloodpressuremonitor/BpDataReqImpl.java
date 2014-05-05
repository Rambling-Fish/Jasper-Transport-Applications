package org.jasper.dtademo.bloodpressuremonitor;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BpDataReq")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class BpDataReqImpl implements BpDataReq {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSID")
	private String bpSID;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSID")
	public String getBpSID() {
		return bpSID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSID")
	public void setBpSID(String bpSID) {
		this.bpSID = bpSID;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bpSID == null) ? 0 : bpSID.hashCode());
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
		BpDataReqImpl other = (BpDataReqImpl) obj;
		if (bpSID == null) {
			if (other.bpSID != null)
				return false;
		} else if (!bpSID.equals(other.bpSID))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "BpDataReqImpl [ " + "bpSID=" + bpSID + " ]";
	}
}
