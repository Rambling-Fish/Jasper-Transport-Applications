package org.jasper.dta.ncgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/EmergencyWrapped")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=EmergencyWrappedImpl.class, name="http://coralcea.ca/jasper/NurseCall/EmergencyWrapped")
})
public interface EmergencyWrapped {

	/**
	 * @return emergency 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/emergency")
	public Emergency getEmergency();

	/**
	 * @param emergency 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/emergency")
	public void setEmergency(Emergency emergency);
}

