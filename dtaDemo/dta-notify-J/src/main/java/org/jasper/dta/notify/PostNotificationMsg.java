package org.jasper.dta.notify;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/dta-J/postNotificationMsg")
public class PostNotificationMsg implements Callable {

	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("true")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		org.jasper.dta.notify.jasper.NotifyMessageReq parameter = (org.jasper.dta.notify.jasper.NotifyMessageReq) message.getPayload();
		Object data = execute(parameter, message);
		message.setPayload(data);
		return message;
	}

	/**
	 * Execute the operation (put your implementation here)
	 * To report error code, call muleMessage.setOutboundProperty("code", <integer>)
	 * To report error description, call muleMessage.setOutboundProperty("description", <string>)
	 * 
	 * @param notifyMessageReq
	 * @param muleMessage
	 * @return null (or another Object if this processor is not terminal)
	 */
	@Generated("true")
	private Object execute(org.jasper.dta.notify.jasper.NotifyMessageReq notifyMessageReq, MuleMessage muleMessage) throws Exception {
		return null;
	}
}

