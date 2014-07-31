package org.jasper.dta.contactinfo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/getContactInfo")
public class GetContactInfo implements Callable {

	private PostContactInfo updateTemp = new PostContactInfo();
	
	private static Logger log = Logger.getLogger(GetContactInfo.class.getName());

	private static final Map<String, ContactInfoImpl> CONTACTS;
	
	static {
        Map<String, ContactInfoImpl> aMap = new HashMap<String, ContactInfoImpl>();

        // fields: 1) firstName, 2) middleName, 3) lastName, 4) homePhone, 5) homeCell, 6) homeEmail, 7) workPhone, 8) workCell, 9) workEmail 
        aMap.put("Barney Rubble",   new ContactInfoImpl("Barney",  "B", "Rubble",     "1115551001", "", "", "1115559001", "", "dta-test@coralcea.ca"));
        aMap.put("Fred Flintstone", new ContactInfoImpl("Fred",    "F", "Flintstone", "1115551002", "", "dta-test@coralcea.ca", "1115559002", "", "dta-test@coralcea.ca"));
        aMap.put("Homer Simpson",   new ContactInfoImpl("Homer",   "H", "Simpson",    "1115551003", "", "dta-test@coralcea.ca", "1115559003", "", "dta-test@coralcea.ca"));
        aMap.put("Marge Simpson",   new ContactInfoImpl("Marge",   "M", "Simpson",    "1115551004", "", "dta-test@coralcea.ca", "1115559004", "", "dta-test@coralcea.ca"));
        aMap.put("Bart Simpson",    new ContactInfoImpl("Bart",    "B", "Simpson",    "1115551005", "", "dta-test@coralcea.ca", "1115559005", "", "dta-test@coralcea.ca"));

        CONTACTS = Collections.unmodifiableMap(aMap);
	}
	
	/**
	 * Execute the operation (put your implementation here)
	 * To report error code, call muleMessage.setOutboundProperty("code", <integer>)
	 * To report error description, call muleMessage.setOutboundProperty("description", <string>)
	 * 
	 * @param contactInfoReq
	 * @param muleMessage
	 * @return ContactInfo (or another Object if this processor is not terminal)
	 */
	@Generated("false")
	private Object execute(ContactInfoReq contactInfoReq, MuleMessage muleMessage) throws Exception {
		String contactName = contactInfoReq.getContactName();

		if ((contactName == null) || (contactName.length() == 0)) 
		{
			log.info("null parameter : http://coralcea.ca/jasper/contactName");
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return null;
		}
		
		muleMessage.setOutboundProperty("statusCode", 200);  // Ok

		// return dynamic data first if found
		if (updateTemp.getContactInfo(contactName) != null)
			return updateTemp.getContactInfo(contactName);
		
		// return static data if dynamic data is not found
		if (CONTACTS.containsKey(contactName))
			return CONTACTS.get(contactName);
	
		return null;
	}

	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("true")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		ContactInfoReq parameter = (ContactInfoReq) message.getPayload();
		Object data = execute(parameter, message);
		message.setPayload(data);
		return message;
	}
}

