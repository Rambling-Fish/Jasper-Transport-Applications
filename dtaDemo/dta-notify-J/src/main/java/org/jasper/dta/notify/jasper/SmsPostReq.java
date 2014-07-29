package org.jasper.dta.notify.jasper;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/Sms/SmsPostReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=SmsPostReqImpl.class, name="http://coralcea.ca/jasper/Sms/SmsPostReq")
})
public interface SmsPostReq {

	/**
	 * @return toSms 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/Sms/toSms")
	public String getToSms();

	/**
	 * @return bodySms 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/Sms/bodySms")
	public String getBodySms();

	/**
	 * @return logId 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/Sms/logId")
	public String getLogId();

	/**
	 * @return fromSms 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/Sms/fromSms")
	public String getFromSms();

	/**
	 * @param toSms 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/Sms/toSms")
	public void setToSms(String toSms);

	/**
	 * @param bodySms 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/Sms/bodySms")
	public void setBodySms(String bodySms);

	/**
	 * @param logId 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/Sms/logId")
	public void setLogId(String logId);

	/**
	 * @param fromSms 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/Sms/fromSms")
	public void setFromSms(String fromSms);
}

