package org.jasper.dta.bmgen;

import javax.annotation.Generated;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/sendDoorStateChange")
public class SendDoorStateChange implements Callable {

	private static Logger log = Logger.getLogger(SendDoorStateChange.class
			.getName());

	private String parsedDoorID;

	private String parsedDoorState;

	private String parsedPayload;

	private String errorText;

	/**
	 * @param muleEventContext
	 * @return Parameters
	 */
	@Generated("false")
	public Parameter onCall(MuleEventContext muleEventContext) throws Exception {

		Parameter parameters = new Parameter();
		MuleMessage message = muleEventContext.getMessage();
		String browserInput = (String) message.getPayload();

		DoorStateChange doorStateChange = new DoorStateChangeImpl();
		
		if (parseDoorStateParameters(browserInput)) {
			doorStateChange.setDoorID(parsedDoorID);
			doorStateChange.setDoorState(parsedDoorState);

			if (parsedPayload == null) {
				if (BmRequest.PAYLOADS.get(parsedDoorID) == null) {
					doorStateChange.setPayload("");
				} else {
					doorStateChange.setPayload(BmRequest.PAYLOADS.get(parsedDoorID));
				}
			} else {
				doorStateChange.setPayload(parsedPayload);
			}
		} else {
			throw new Exception(errorText);
		}

		parameters.setDoorStateChange(doorStateChange);
		
		return parameters;
	}

	private boolean parseDoorStateParameters(String browserInput) {

		// RURI : http://0.0.0.0:8083/rbm/doorStateChange                ?
		// PARM : http://coralcea.ca/jasper/BuildingMgmt/doorID=010      &
		// PARM : http://coralcea.ca/jasper/BuildingMgmt/doorState=open

		// EXAMPLE:
		// http://0.0.0.0:8083/rbm/doorStateChange?http://coralcea.ca/jasper/BuildingMgmt/doorID=010&http://coralcea.ca/jasper/BuildingMgmt/doorState=open

		boolean haveDoorID = false, haveDoorState = false;

		parsedDoorID = null;
		parsedDoorState = null;
		parsedPayload = null;
		errorText = null;

		String requestArray[] = browserInput.split("\\?");

		if (requestArray.length != 2) {
			errorText = "Invalid request : " + browserInput;
			log.warn(errorText);
			return false;
		}

		String parmPairs[] = requestArray[1].split("\\&");

		// Loop over the passed in parameter key/value pairs
		for (String parmPairString : parmPairs) {
			String parmPair[] = parmPairString.split("\\=");

			if (parmPair.length != 2) {
				errorText = "Invalid parameter (expect key=value) : "
						+ parmPairString;
				log.warn(errorText);
				return false;
			}

			// Identify the parameter key and set its value
			if (parmPair[0].matches(BmRequest.DOOR_ID_URI)) {
				parsedDoorID = parmPair[1];
				haveDoorID = true;
			} else if (parmPair[0].matches(BmRequest.DOOR_STATE_URI)) {
				parsedDoorState = parmPair[1];
				haveDoorState = true;
			} else if (parmPair[0].matches(BmRequest.PAYLOAD_URI)) {
				parsedPayload = parmPair[1];
			} else {
				log.info("Unknown parameter : " + parmPair[0] + "="
						+ parmPair[1]);
			}
		}

		if (haveDoorID && haveDoorState) {
			return true;
		} else {
			errorText = "Mandatory parameter missing";
			return false;
		}
	}

	/**
	 * The parameter of {@link SendDoorStateChange}
	 */
	@Generated("true")
	public static class Parameter {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorStateChange")
		private DoorStateChange doorStateChange;

		/**
		 * @return doorStateChange 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorStateChange")
		public DoorStateChange getDoorStateChange() {
			return doorStateChange;
		}

		/**
		 * @param doorStateChange 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorStateChange")
		public void setDoorStateChange(DoorStateChange doorStateChange) {
			this.doorStateChange = doorStateChange;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime
					* result
					+ ((doorStateChange == null) ? 0 : doorStateChange
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
			if (doorStateChange == null) {
				if (other.doorStateChange != null)
					return false;
			} else if (!doorStateChange.equals(other.doorStateChange))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameter [ " + "doorStateChange=" + doorStateChange + " ]";
		}
	}
}
