package org.jasper.dta.contactinfo;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/ContactInfoReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=ContactInfoReqImpl.class, name="http://coralcea.ca/jasper/ContactInfoReq")
})
public interface ContactInfoReq {

	/**
	 * @return contactName 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/contactName")
	public String getContactName();

	/**
	 * @param contactName 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/contactName")
	public void setContactName(String contactName);
}

