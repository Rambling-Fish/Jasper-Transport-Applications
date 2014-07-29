package org.jasper.dta.notify.jasper;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/EmailReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=EmailReqImpl.class, name="http://coralcea.ca/jasper/EmailReq")
})
public interface EmailReq {

	/**
	 * @return emailAddressFrom 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressFrom")
	public String getEmailAddressFrom();

	/**
	 * @return emailAddressTo 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressTo")
	public String getEmailAddressTo();

	/**
	 * @return emailBody 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailBody")
	public String getEmailBody();

	/**
	 * @return emailSubject 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailSubject")
	public String getEmailSubject();

	/**
	 * @param emailAddressFrom 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressFrom")
	public void setEmailAddressFrom(String emailAddressFrom);

	/**
	 * @param emailAddressTo 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressTo")
	public void setEmailAddressTo(String emailAddressTo);

	/**
	 * @param emailBody 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailBody")
	public void setEmailBody(String emailBody);

	/**
	 * @param emailSubject 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailSubject")
	public void setEmailSubject(String emailSubject);
}

