package org.jasper.dta.ncgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/CallNurseWrapped")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=CallNurseWrappedImpl.class, name="http://coralcea.ca/jasper/NurseCall/CallNurseWrapped")
})
public interface CallNurseWrapped {

	/**
	 * @return callNurse 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/callNurse")
	public CallNurse getCallNurse();

	/**
	 * @param callNurse 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/callNurse")
	public void setCallNurse(CallNurse callNurse);
}

