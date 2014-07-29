package org.jasper.dta.notify;

import javax.annotation.Generated;

import org.jasper.dta.notify.jasper.ContactInfoReq;
import org.jasper.dta.notify.jasper.ContactInfoReqImpl;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class SetContactNameParm implements Callable {

	@Generated("false")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		
		Object inputPayload = muleEventContext.getMessage().getPayload();
		
		ContactInfoReq outputPayload = new ContactInfoReqImpl();
		
		if(inputPayload instanceof String){
			outputPayload.setContactName(((String) inputPayload).toString());
			muleEventContext.getMessage().setPayload(outputPayload);
		}
						
		return muleEventContext.getMessage();

	}
}
