package org.jasper.dtademo.medicalrecord;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/getMedicalRecord")
public class GetMedicalRecord implements Callable {

	// GetMedicalRecord is not invoked as it does not need to perform any task.
	// The payload containing the input parameter is passed unchanged to the subsequent component.
	
	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("true")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		MuleMessage message = muleEventContext.getMessage();
		PatientInfoReq parameter = (PatientInfoReq) message.getPayload();
		Object data = execute(parameter, message);
		message.setPayload(data);
		return message;
	}

	/**
	 * Execute the operation (put your implementation here)
	 * To report error code, call muleMessage.setOutboundProperty("code", <integer>)
	 * To report error description, call muleMessage.setOutboundProperty("description", <string>)
	 * 
	 * @param patientInfoReq
	 * @param muleMessage
	 * @return org.jasper.dtademo.medicalrecord.composite.MedicalRecord (or another Object if this processor is not terminal)
	 */
	@Generated("true")
	private Object execute(PatientInfoReq patientInfoReq, MuleMessage muleMessage) throws Exception {
		return null;
	}
}

