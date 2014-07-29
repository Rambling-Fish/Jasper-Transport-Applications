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

	private static Logger log = Logger.getLogger(GetContactInfo.class.getName());
	private static final Map<String, ContactInfoImpl> CONTACTS;
	
	static {
        Map<String, ContactInfoImpl> aMap = new HashMap<String, ContactInfoImpl>();

        // fields: 1) firstName, 2) middleName, 3) lastName, 4) homePhone, 5) homeCell, 6) homeEmail, 7) workPhone, 8) workCell, 9) workEmail 
        aMap.put("BarneyRubble",   new ContactInfoImpl("Barney",  "B", "Rubble",     "1115551111", "", "dta-test@coralcea.ca", "1115551110", "", "dta-test@coralcea.ca"));
        aMap.put("FredFlintstone", new ContactInfoImpl("Fred",    "F", "Flintstone", "1115552222", "", "dta-test@coralcea.ca", "1115552220", "", "dta-test@coralcea.ca"));
        aMap.put("HomerSimpson",   new ContactInfoImpl("Homer",   "H", "Simpson",    "1115553333", "", "dta-test@coralcea.ca", "1115553330", "", "dta-test@coralcea.ca"));
        aMap.put("MargeSimpson",   new ContactInfoImpl("Marge",   "M", "Simpson",    "1115554444", "", "dta-test@coralcea.ca", "1115554440", "", "dta-test@coralcea.ca"));
        aMap.put("BartSimpson",    new ContactInfoImpl("Bart",    "B", "Simpson",    "1115555555", "", "dta-test@coralcea.ca", "1115555550", "", "dta-test@coralcea.ca"));

        CONTACTS = Collections.unmodifiableMap(aMap);
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
			log.info("null parameter : http://coralcea.ca/jasper/patientID");
			muleMessage.setOutboundProperty("statusCode", 400);  // Bad request
			return new ContactInfo[] {null};
		}
		
		muleMessage.setOutboundProperty("statusCode", 200);  // Ok

		if (CONTACTS.containsKey(contactName))
			return CONTACTS.get(contactName);
		else
			return null;
	}
}

