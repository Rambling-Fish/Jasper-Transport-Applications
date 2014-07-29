package org.jasper.dta.notify;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.annotation.Generated;

import org.jasper.dta.notify.jasper.ContactInfoReq;
import org.jasper.dta.notify.jasper.ContactInfoReqImpl;
import org.jasper.dta.notify.jasper.EmailReq;
import org.jasper.dta.notify.jasper.EmailReqImpl;
import org.jasper.dta.notify.jasper.SmsPostReq;
import org.jasper.dta.notify.jasper.SmsPostReqImpl;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class SetSmsParms implements Callable {

	@Generated("false")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		
		Object inputPayload = muleEventContext.getMessage().getPayload();
		
		SmsPostReq outputPayload = new SmsPostReqImpl();
		
		if(inputPayload instanceof HashMap)
		{
			HashMap<String,String> hm = (HashMap<String,String>)inputPayload;
			for (Entry<String, String> entry : hm.entrySet())
			{
				if (entry.getKey().equalsIgnoreCase("fromSms")) 
					outputPayload.setFromSms(entry.getValue());
				else if (entry.getKey().equalsIgnoreCase("toSms")) 
					outputPayload.setToSms(entry.getValue());
				else if (entry.getKey().equalsIgnoreCase("bodySms")) 
					outputPayload.setBodySms(entry.getValue());
				else if (entry.getKey().equalsIgnoreCase("logId")) 
					outputPayload.setLogId(entry.getValue());
			}
			muleEventContext.getMessage().setPayload(outputPayload);
		}
						
		return muleEventContext.getMessage();
	}
}
