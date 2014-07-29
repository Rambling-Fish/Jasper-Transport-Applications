package org.jasper.dtademo.medicalrecord;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/HrData")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=HrDataImpl.class, name="http://coralcea.ca/jasper/HrData")
})
public interface HrData extends MsData {

	/**
	 * @return bpm 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSensor/bpm")
	public int getBpm();

	/**
	 * @return timestamp 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public String getTimestamp();

	/**
	 * @param bpm 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSensor/bpm")
	public void setBpm(int bpm);

	/**
	 * @param timestamp 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public void setTimestamp(String timestamp);
}

