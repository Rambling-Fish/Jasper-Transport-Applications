package org.jasper.dta.ncgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/cancelEmergency")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=CancelEmergencyImpl.class, name="http://coralcea.ca/jasper/NurseCall/cancelEmergency")
})
public interface CancelEmergency {

	/**
	 * @return location 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/location")
	public String getLocation();

	/**
	 * @return payload 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/payload")
	public String getPayload();

	/**
	 * @param location 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/location")
	public void setLocation(String location);

	/**
	 * @param payload 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/payload")
	public void setPayload(String payload);
}

