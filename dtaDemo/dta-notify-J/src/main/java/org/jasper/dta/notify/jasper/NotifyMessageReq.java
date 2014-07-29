package org.jasper.dta.notify.jasper;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NotifyMessageReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=NotifyMessageReqImpl.class, name="http://coralcea.ca/jasper/NotifyMessageReq")
})
public interface NotifyMessageReq {

	/**
	 * @return msgSubject 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/msgSubject")
	public String getMsgSubject();

	/**
	 * @return fromName 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/fromName")
	public String getFromName();

	/**
	 * @return toName 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/toName")
	public String getToName();

	/**
	 * @return msgBody 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/msgBody")
	public String getMsgBody();

	/**
	 * @param msgSubject 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/msgSubject")
	public void setMsgSubject(String msgSubject);

	/**
	 * @param fromName 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/fromName")
	public void setFromName(String fromName);

	/**
	 * @param toName 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/toName")
	public void setToName(String toName);

	/**
	 * @param msgBody 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/msgBody")
	public void setMsgBody(String msgBody);
}

