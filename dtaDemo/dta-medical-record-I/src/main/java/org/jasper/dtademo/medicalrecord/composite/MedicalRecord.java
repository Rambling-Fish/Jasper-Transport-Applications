package org.jasper.dtademo.medicalrecord.composite;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/composite/MedicalRecord")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=MedicalRecordImpl.class, name="http://coralcea.ca/jasper/composite/MedicalRecord")
})
public interface MedicalRecord {

	/**
	 * @return hrData 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrData")
	public org.jasper.dtademo.medicalrecord.HrData[] getHrData();

	/**
	 * @return bpData 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpData")
	public org.jasper.dtademo.medicalrecord.BpData[] getBpData();

	/**
	 * @return patientInfo 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientInfo")
	public org.jasper.dtademo.medicalrecord.PatientInfo getPatientInfo();

	/**
	 * @param hrData 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrData")
	public void setHrData(org.jasper.dtademo.medicalrecord.HrData[] hrData);

	/**
	 * @param bpData 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpData")
	public void setBpData(org.jasper.dtademo.medicalrecord.BpData[] bpData);

	/**
	 * @param patientInfo 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientInfo")
	public void setPatientInfo(org.jasper.dtademo.medicalrecord.PatientInfo patientInfo);
}

