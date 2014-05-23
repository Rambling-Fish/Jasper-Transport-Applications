package org.jasper.dtademo.emr;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.*;

@Generated("false")
@JsonTypeName("http://coralcea.ca/jasper/PatientInfo")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class PatientInfoImpl implements PatientInfo {

	public PatientInfoImpl(String patientID, String ward, String bed, String hrSID, String bpSID) {
		this.patientID = patientID;
		this.bed = bed;
		this.ward = ward;
		this.hrSID = hrSID;
		this.bpSID = bpSID;
	}

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientID")
	private String patientID;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSID")
	private String hrSID;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/ward")
	private String ward;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSID")
	private String bpSID;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bed")
	private String bed;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientID")
	public String getPatientID() {
		return patientID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSID")
	public String getHrSID() {
		return hrSID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/ward")
	public String getWard() {
		return ward;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSID")
	public String getBpSID() {
		return bpSID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bed")
	public String getBed() {
		return bed;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientID")
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSID")
	public void setHrSID(String hrSID) {
		this.hrSID = hrSID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/ward")
	public void setWard(String ward) {
		this.ward = ward;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSID")
	public void setBpSID(String bpSID) {
		this.bpSID = bpSID;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bed")
	public void setBed(String bed) {
		this.bed = bed;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result + ((hrSID == null) ? 0 : hrSID.hashCode());
		result = prime * result + ((ward == null) ? 0 : ward.hashCode());
		result = prime * result + ((bpSID == null) ? 0 : bpSID.hashCode());
		result = prime * result + ((bed == null) ? 0 : bed.hashCode());
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
		PatientInfoImpl other = (PatientInfoImpl) obj;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (hrSID == null) {
			if (other.hrSID != null)
				return false;
		} else if (!hrSID.equals(other.hrSID))
			return false;
		if (ward == null) {
			if (other.ward != null)
				return false;
		} else if (!ward.equals(other.ward))
			return false;
		if (bpSID == null) {
			if (other.bpSID != null)
				return false;
		} else if (!bpSID.equals(other.bpSID))
			return false;
		if (bed == null) {
			if (other.bed != null)
				return false;
		} else if (!bed.equals(other.bed))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "PatientInfoImpl [ " + "patientID=" + patientID + ", "
				+ "hrSID=" + hrSID + ", " + "ward=" + ward + ", " + "bpSID="
				+ bpSID + ", " + "bed=" + bed + " ]";
	}
}
