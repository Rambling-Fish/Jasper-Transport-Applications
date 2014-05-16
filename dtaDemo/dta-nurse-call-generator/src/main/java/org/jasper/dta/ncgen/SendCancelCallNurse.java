package org.jasper.dta.ncgen;

import javax.annotation.Generated;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/sendCancelCallNurse")
public class SendCancelCallNurse implements Callable {

	private static Logger log = Logger.getLogger(SendCancelCallNurse.class
			.getName());

	private String errorText;

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

		CancelCallNurse cancelCallNurse = new CancelCallNurseImpl();
		cancelCallNurse.setLocation(location);

		if (NcRequest.PAYLOADS.get(location) == null) {
			cancelCallNurse.setPayload("");
		} else {
			cancelCallNurse.setPayload(NcRequest.PAYLOADS.get(location));
		}

		parameter.setCancelCallNurse(cancelCallNurse);

		return parameter;
	}

	/**
	 * The parameter of {@link SendCancelCallNurse}
	 */
	@Generated("true")
	public static class Parameter {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelCallNurse")
		private CancelCallNurse cancelCallNurse;

		/**
		 * @return cancelCallNurse 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelCallNurse")
		public CancelCallNurse getCancelCallNurse() {
			return cancelCallNurse;
		}

		/**
		 * @param cancelCallNurse 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/cancelCallNurse")
		public void setCancelCallNurse(CancelCallNurse cancelCallNurse) {
			this.cancelCallNurse = cancelCallNurse;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime
					* result
					+ ((cancelCallNurse == null) ? 0 : cancelCallNurse
							.hashCode());
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
			if (cancelCallNurse == null) {
				if (other.cancelCallNurse != null)
					return false;
			} else if (!cancelCallNurse.equals(other.cancelCallNurse))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameter [ " + "cancelCallNurse=" + cancelCallNurse + " ]";
		}
	}
}
