package org.jasper.dtademo.email;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/sendEmail")
public class SendEmail implements Callable {

	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("true")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		EmailReq parameter = (EmailReq) message.getPayload();
		Object data = execute(parameter, message);
		message.setPayload(data);
		return message;
	}

	/**
	 * Execute the operation (put your implementation here)
	 * To report error code, call muleMessage.setOutboundProperty("code", <integer>)
	 * To report error description, call muleMessage.setOutboundProperty("description", <string>)
	 * 
	 * @param emailReq
	 * @param muleMessage
	 * @return null (or another Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object execute(EmailReq emailReq, MuleMessage muleMessage) throws Exception {
		muleMessage.setOutboundProperty("statusCode", 200);

		return null;
	}
}

