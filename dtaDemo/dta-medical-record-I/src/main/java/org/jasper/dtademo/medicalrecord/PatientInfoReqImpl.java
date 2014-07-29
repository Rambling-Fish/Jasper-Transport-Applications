package org.jasper.dtademo.medicalrecord;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/PatientInfoReq")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class PatientInfoReqImpl implements PatientInfoReq {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientID")
	private String patientID;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientID")
	public String getPatientID() {
		return patientID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientID")
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
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
		PatientInfoReqImpl other = (PatientInfoReqImpl) obj;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "PatientInfoReqImpl [ " + "patientID=" + patientID + " ]";
	}
}
