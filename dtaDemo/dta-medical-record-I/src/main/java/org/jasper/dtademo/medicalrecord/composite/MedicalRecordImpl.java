package org.jasper.dtademo.medicalrecord.composite;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/composite/MedicalRecord")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class MedicalRecordImpl implements MedicalRecord {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrData")
	private org.jasper.dtademo.medicalrecord.HrData[] hrData;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpData")
	private org.jasper.dtademo.medicalrecord.BpData[] bpData;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientInfo")
	private org.jasper.dtademo.medicalrecord.PatientInfo patientInfo;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrData")
	public org.jasper.dtademo.medicalrecord.HrData[] getHrData() {
		return hrData;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpData")
	public org.jasper.dtademo.medicalrecord.BpData[] getBpData() {
		return bpData;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientInfo")
	public org.jasper.dtademo.medicalrecord.PatientInfo getPatientInfo() {
		return patientInfo;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrData")
	public void setHrData(org.jasper.dtademo.medicalrecord.HrData[] hrData) {
		this.hrData = hrData;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpData")
	public void setBpData(org.jasper.dtademo.medicalrecord.BpData[] bpData) {
		this.bpData = bpData;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientInfo")
	public void setPatientInfo(
			org.jasper.dtademo.medicalrecord.PatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + java.util.Arrays.hashCode(hrData);
		result = prime * result + java.util.Arrays.hashCode(bpData);
		result = prime * result
				+ ((patientInfo == null) ? 0 : patientInfo.hashCode());
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
		MedicalRecordImpl other = (MedicalRecordImpl) obj;
		if (!java.util.Arrays.equals(hrData, other.hrData))
			return false;
		if (!java.util.Arrays.equals(bpData, other.bpData))
			return false;
		if (patientInfo == null) {
			if (other.patientInfo != null)
				return false;
		} else if (!patientInfo.equals(other.patientInfo))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "MedicalRecordImpl [ " + "hrData="
				+ java.util.Arrays.toString(hrData) + ", " + "bpData="
				+ java.util.Arrays.toString(bpData) + ", " + "patientInfo="
				+ patientInfo + " ]";
	}
}
