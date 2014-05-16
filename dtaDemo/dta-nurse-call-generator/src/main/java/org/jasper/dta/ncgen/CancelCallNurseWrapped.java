package org.jasper.dta.ncgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/CancelCallNurseWrapped")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=CancelCallNurseWrappedImpl.class, name="http://coralcea.ca/jasper/NurseCall/CancelCallNurseWrapped")
})
public interface CancelCallNurseWrapped {

	/**
	 * @return cancelCallNurse 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelCallNurse")
	public CancelCallNurse getCancelCallNurse();

	/**
	 * @param cancelCallNurse 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelCallNurse")
	public void setCancelCallNurse(CancelCallNurse cancelCallNurse);
}

