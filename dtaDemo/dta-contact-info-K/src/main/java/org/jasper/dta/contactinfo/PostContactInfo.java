package org.jasper.dta.contactinfo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonTypeName;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/postContactInfo")
public class PostContactInfo implements Callable {

	@Generated("false")
	private static Map<String,ContactInfoImpl> contactData = new ConcurrentHashMap<String,ContactInfoImpl>();
	
	@Generated("false")
	public ContactInfoImpl getContactInfo(String contactName){
		return contactData.get(contactName);
	}

	/**
	 * Execute the operation (put your implementation here)
	 * To report error code, call muleMessage.setOutboundProperty("code", <integer>)
	 * To report error description, call muleMessage.setOutboundProperty("description", <string>)
	 * 
	 * @param contactInfoUpdateReq
	 * @param muleMessage
	 * @return null (or another Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object execute(ContactInfoUpdateReq contactInfoUpdateReq, MuleMessage muleMessage) throws Exception {
		
		ContactInfoImpl newContactInfo = new ContactInfoImpl();

		//contact name
		String          contactName    = contactInfoUpdateReq.getContactName();

		// contact details
		String          firstName      = contactInfoUpdateReq.getNameFirst();
		String          middleName     = contactInfoUpdateReq.getNameMiddle();
		String          lastName       = contactInfoUpdateReq.getNameLast();
		String          homeTelephone  = contactInfoUpdateReq.getHomeTelephone();
		String          homeCellphone  = contactInfoUpdateReq.getHomeCellphone();
		String          homeEmail      = contactInfoUpdateReq.getHomeEmail();
		String          workTelephone  = contactInfoUpdateReq.getWorkTelephone();
		String          workCellphone  = contactInfoUpdateReq.getWorkCellphone();
		String          workEmail      = contactInfoUpdateReq.getWorkEmail();
				
		if(contactName == null || contactName.length() == 0){
			return null;
		}

		newContactInfo.setNameFirst(firstName);
		newContactInfo.setNameMiddle(middleName);
		newContactInfo.setNameLast(lastName);
		newContactInfo.setHomeTelephone(homeTelephone);
		newContactInfo.setHomeCellphone(homeCellphone);
		newContactInfo.setHomeEmail(homeEmail);
		newContactInfo.setWorkTelephone(workTelephone);
		newContactInfo.setWorkCellphone(workCellphone);
		newContactInfo.setWorkEmail(workEmail);

		contactData.put(contactName, newContactInfo);
		
		muleMessage.setOutboundProperty("statusCode", 200);
		
		return newContactInfo;
	}

	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("true")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		ContactInfoUpdateReq parameter = (ContactInfoUpdateReq) message.getPayload();
		Object data = execute(parameter, message);
		message.setPayload(data);
		return message;
	}
}

