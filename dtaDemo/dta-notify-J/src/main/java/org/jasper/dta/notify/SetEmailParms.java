package org.jasper.dta.notify;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.annotation.Generated;

import org.jasper.dta.notify.jasper.ContactInfoReq;
import org.jasper.dta.notify.jasper.ContactInfoReqImpl;
import org.jasper.dta.notify.jasper.EmailReq;
import org.jasper.dta.notify.jasper.EmailReqImpl;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class SetEmailParms implements Callable {

	@Generated("false")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		
		Object inputPayload = muleEventContext.getMessage().getPayload();
		
		EmailReq outputPayload = new EmailReqImpl();
		
		if(inputPayload instanceof HashMap)
		{
			HashMap<String,String> hm = (HashMap<String,String>)inputPayload;
			for (Entry<String, String> entry : hm.entrySet())
			{				
				if (entry.getKey().equalsIgnoreCase("emailAddressFrom")) 
					outputPayload.setEmailAddressFrom(entry.getValue());
				else if (entry.getKey().equalsIgnoreCase("emailAddressTo")) 
					outputPayload.setEmailAddressTo(entry.getValue());
				else if (entry.getKey().equalsIgnoreCase("emailSubject")) 
					outputPayload.setEmailSubject(entry.getValue());
				else if (entry.getKey().equalsIgnoreCase("emailBody")) 
					outputPayload.setEmailBody(entry.getValue());
			}
			muleEventContext.getMessage().setPayload(outputPayload);
		}
						
		return muleEventContext.getMessage();
	}
}
