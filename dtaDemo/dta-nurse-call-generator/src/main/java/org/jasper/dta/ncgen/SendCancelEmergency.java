package org.jasper.dta.ncgen;

import javax.annotation.Generated;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NurseCall/sendCancelEmergency")
public class SendCancelEmergency implements Callable {

    private static Logger log = Logger.getLogger(SendCancelEmergency.class.getName());

	private String errorText;

    /**
	 * @param muleEventContext
	 * @return Parameters
	 */
	@Generated("true")
	public Parameters onCall(MuleEventContext muleEventContext) throws Exception {
		
		Parameters parameters = new Parameters();
		MuleMessage message = muleEventContext.getMessage();
		String browserInput = message.getPayloadAsString();
		String location = parseOutLocation(browserInput);
		
		if (location == null) throw new Exception(errorText);

		parameters.setLocation(location);

		if (NcRequest.PAYLOADS.get(location) == null) {
			parameters.setPayload("");
		}
		else {
			parameters.setPayload(NcRequest.PAYLOADS.get(location));
			
		}
		
		return parameters;
	}

	private String parseOutLocation(String browserInput)
	{
		errorText = null;

		String requestArray[] = browserInput.split("\\?");
		if (requestArray.length != 2) {
			errorText = "invalid request : " + browserInput;
			log.warn(errorText);
			return null;
		}
		
		String parmPair[] = requestArray[1].split("\\=");
		if (parmPair.length != 2) {
			errorText = "invalid parameter (expect key=value) : " + requestArray[1];
			log.warn(errorText);
			return null;
		}
		
		if (!parmPair[0].matches(NcRequest.LOCATION_URI))
		{
			errorText = "invalid parameter : " + parmPair[0];
			log.warn(errorText);
			return null;
		}

		return parmPair[1];
	}

	/**
	 * The parameters of {@link SendCancelEmergency}
	 */
	@Generated("true")
	public static class Parameters {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/location")
		private String location;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/payload")
		private String payload;

		/**
		 * @return location 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/location")
		public String getLocation() {
			return location;
		}

		/**
		 * @return payload 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/payload")
		public String getPayload() {
			return payload;
		}

		/**
		 * @param location 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/location")
		public void setLocation(String location) {
			this.location = location;
		}

		/**
		 * @param payload 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/NurseCall/payload")
		public void setPayload(String payload) {
			this.payload = payload;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((location == null) ? 0 : location.hashCode());
			result = prime * result
					+ ((payload == null) ? 0 : payload.hashCode());
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
			Parameters other = (Parameters) obj;
			if (location == null) {
				if (other.location != null)
					return false;
			} else if (!location.equals(other.location))
				return false;
			if (payload == null) {
				if (other.payload != null)
					return false;
			} else if (!payload.equals(other.payload))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameters [ " + "location=" + location + ", " + "payload="
					+ payload + " ]";
		}
	}
}
