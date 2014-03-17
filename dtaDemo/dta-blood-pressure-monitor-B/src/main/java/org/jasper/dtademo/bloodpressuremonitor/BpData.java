package org.jasper.dtademo.bloodpressuremonitor;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BpData")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=BpDataImpl.class, name="http://coralcea.ca/jasper/BpData")
})
public interface BpData {

	/**
	 * @return systolic 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSensor/systolic")
	public int getSystolic();

	/**
	 * @return diastolic 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSensor/diastolic")
	public int getDiastolic();

	/**
	 * @return timestamp 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public String getTimestamp();

	/**
	 * @param systolic 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSensor/systolic")
	public void setSystolic(int systolic);

	/**
	 * @param diastolic 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSensor/diastolic")
	public void setDiastolic(int diastolic);

	/**
	 * @param timestamp 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public void setTimestamp(String timestamp);
}

