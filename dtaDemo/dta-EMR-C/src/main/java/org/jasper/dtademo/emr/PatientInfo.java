package org.jasper.dtademo.emr;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/PatientInfo")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=PatientInfoImpl.class, name="http://coralcea.ca/jasper/PatientInfo")
})
public interface PatientInfo {

	/**
	 * @return patientID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientID")
	public String getPatientID();

	/**
	 * @return hrSID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSID")
	public String getHrSID();

	/**
	 * @return ward 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/ward")
	public String getWard();

	/**
	 * @return bpSID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSID")
	public String getBpSID();

	/**
	 * @return bed 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bed")
	public String getBed();

	/**
	 * @param patientID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientID")
	public void setPatientID(String patientID);

	/**
	 * @param hrSID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSID")
	public void setHrSID(String hrSID);

	/**
	 * @param ward 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/ward")
	public void setWard(String ward);

	/**
	 * @param bpSID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSID")
	public void setBpSID(String bpSID);

	/**
	 * @param bed 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bed")
	public void setBed(String bed);
}

