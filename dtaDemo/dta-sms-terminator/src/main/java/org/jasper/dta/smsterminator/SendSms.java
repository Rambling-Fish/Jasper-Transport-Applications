package org.jasper.dta.smsterminator;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/sendSms")
public class SendSms implements Callable {

	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("true")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		SmsPostReq input = (SmsPostReq) message.getPayload();
		Object output = execute(input, message);
		message.setPayload(output);
		return message;
	}

	/**
	 * Execute the operation (put your implementation here)
	 * To report error code, call muleMessage.setOutboundProperty("code", <integer>)
	 * To report error description, call muleMessage.setOutboundProperty("description", <string>)
	 * 
	 * @param smsPostReq
	 * @param muleMessage
	 * @return null (or another Object if this processor is not terminal)
	 */
	@Generated("true")
	private Object execute(SmsPostReq smsPostReq, MuleMessage muleMessage) throws Exception {
		return null;
	}
}

