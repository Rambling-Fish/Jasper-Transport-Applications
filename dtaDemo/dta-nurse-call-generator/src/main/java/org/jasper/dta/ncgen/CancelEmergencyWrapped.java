package org.jasper.dta.ncgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/CancelEmergencyWrapped")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=CancelEmergencyWrappedImpl.class, name="http://coralcea.ca/jasper/NurseCall/CancelEmergencyWrapped")
})
public interface CancelEmergencyWrapped {

	/**
	 * @return cancelEmergency 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelEmergency")
	public CancelEmergency getCancelEmergency();

	/**
	 * @param cancelEmergency 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelEmergency")
	public void setCancelEmergency(CancelEmergency cancelEmergency);
}

