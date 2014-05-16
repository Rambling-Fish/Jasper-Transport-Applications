package org.jasper.dta.ncgen;

import javax.annotation.Generated;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/sendCallNurse")
public class SendCallNurse implements Callable {

	private static Logger log = Logger.getLogger(SendCallNurse.class.getName());

	private String errorText;

	/**
	 * @param muleEventContext
	 * @return Parameter
	 */
	@Generated("false")
	public Parameter onCall(MuleEventContext muleEventContext) throws Exception {
		Parameter parameter = new Parameter();

		MuleMessage message = muleEventContext.getMessage();
		String browserInput = message.getPayloadAsString();
		String location = parseOutLocation(browserInput);

		if (location == null)
			throw new Exception(errorText);

		CallNurse callNurse = new CallNurseImpl();
		callNurse.setLocation(location);

		if (NcRequest.PAYLOADS.get(location) == null) {
			callNurse.setPayload("");
		} else {
			callNurse.setPayload(NcRequest.PAYLOADS.get(location));
		}

		parameter.setCallNurse(callNurse);

		return parameter;
	}

	private String parseOutLocation(String browserInput) {
		errorText = null;

		String requestArray[] = browserInput.split("\\?");
		if (requestArray.length != 2) {
			errorText = "Invalid request : " + browserInput;
			log.warn(errorText);
			return null;
		}

		String parmPair[] = requestArray[1].split("\\=");
		if (parmPair.length != 2) {
			errorText = "Invalid parameter (expect key=value) : "
					+ requestArray[1];
			log.warn(errorText);
			return null;
		}

		if (!parmPair[0].matches(NcRequest.LOCATION_URI)) {
			errorText = "Invalid parameter : " + parmPair[0];
			log.warn(errorText);
			return null;
		}

		return parmPair[1];
	}

	/**
	 * The parameter of {@link SendCallNurse}
	 */
	@Generated("true")
	public static class Parameter {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/callNurse")
		private CallNurse callNurse;

		/**
		 * @return callNurse 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/callNurse")
		public CallNurse getCallNurse() {
			return callNurse;
		}

		/**
		 * @param callNurse 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/callNurse")
		public void setCallNurse(CallNurse callNurse) {
			this.callNurse = callNurse;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((callNurse == null) ? 0 : callNurse.hashCode());
			return result;
		}

		@Override
		@Generated("true")
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Parameter other = (Parameter) obj;
			if (callNurse == null) {
				if (other.callNurse != null)
					return false;
			} else if (!callNurse.equals(other.callNurse))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameter [ " + "callNurse=" + callNurse + " ]";
		}
	}
}
