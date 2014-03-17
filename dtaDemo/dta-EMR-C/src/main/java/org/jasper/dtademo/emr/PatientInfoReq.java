package org.jasper.dtademo.emr;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/PatientInfoReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=PatientInfoReqImpl.class, name="http://coralcea.ca/jasper/PatientInfoReq")
})
public interface PatientInfoReq {

	/**
	 * @return patientID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientID")
	public String getPatientID();

	/**
	 * @param patientID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/patientID")
	public void setPatientID(String patientID);
}

