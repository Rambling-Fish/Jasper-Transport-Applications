package org.jasper.dta.bmgen;

import javax.annotation.Generated;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/sendDoorStateChange")
public class SendDoorStateChange implements Callable {

	private static Logger log = Logger.getLogger(SendDoorStateChange.class.getName());
	
	private String parsedDoorID;
	private String parsedDoorState;
	private String parsedPayload;

	private String errorText;

	/**
	 * @param muleEventContext
	 * @return Parameters
	 */
	@Generated("true")
	public Parameters onCall(MuleEventContext muleEventContext) throws Exception {
		
		Parameters parameters = new Parameters();
		MuleMessage message = muleEventContext.getMessage();
		String browserInput = (String) message.getPayload();

		if (parseDoorStateParameters(browserInput))
		{	
			parameters.setDoorID(parsedDoorID);
			parameters.setDoorState(parsedDoorState);

			if (parsedPayload == null)
			{
				if (BmRequest.PAYLOADS.get(parsedDoorID) == null) {
					parameters.setPayload("");
				}
				else {
					parameters.setPayload(BmRequest.PAYLOADS.get(parsedDoorID));				
				}
			}
			else
			{
				parameters.setPayload(parsedPayload);
			}
		}
		else 
		{
			throw new Exception(errorText);
		}
		
		return parameters;
	}
	
	private boolean parseDoorStateParameters(String browserInput) {

		// RURI : http://0.0.0.0:8083/rbm/doorStateChange                ?
		// PARM : http://coralcea.ca/jasper/BuildingMgmt/doorID=010      &
		// PARM : http://coralcea.ca/jasper/BuildingMgmt/doorState=open

		// EXAMPLE:
		// http://0.0.0.0:8083/rbm/doorStateChange?http://coralcea.ca/jasper/BuildingMgmt/doorID=010&http://coralcea.ca/jasper/BuildingMgmt/doorState=open
		
		boolean haveDoorID      = false, 
				haveDoorState   = false;
		
		parsedDoorID = null;
		parsedDoorState = null;
		parsedPayload = null;
		errorText = null;

		String requestArray[] = browserInput.split("\\?");

		if (requestArray.length != 2) {
			errorText = "invalid request : " + browserInput;
			log.warn(errorText);
			return false;
		}

		String parmPairs[] = requestArray[1].split("\\&");

		// Loop over the passed in parameter key/value pairs
		for (String parmPairString: parmPairs)
		{
			String parmPair[] = parmPairString.split("\\=");
			
			if (parmPair.length != 2) {
				errorText = "invalid parameter (expect key=value) : " + parmPairString;
				log.warn(errorText);
				return false;
			}
			
			// Identify the parameter key and set its value
			if (parmPair[0].matches(BmRequest.DOOR_ID_URI))
			{
				parsedDoorID = parmPair[1];
				haveDoorID = true;
			}
			else if (parmPair[0].matches(BmRequest.DOOR_STATE_URI))
			{
				parsedDoorState = parmPair[1];
				haveDoorState = true;
			}
			else if (parmPair[0].matches(BmRequest.PAYLOAD_URI))
			{
				parsedPayload = parmPair[1];
			}
			else
			{
				log.info("Unknown parameter : " + parmPair[0] + "=" + parmPair[1]);
			}
		}
		
		if (haveDoorID && haveDoorState)
		{
			return true;
		}
		else
		{
			errorText = "mandatory parameter missing";
			return false;
		}
	}

	/**
	 * The parameters of {@link SendDoorStateChange}
	 */
	@Generated("true")
	public static class Parameters {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorID")
		private String doorID;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
		private String payload;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorState")
		private String doorState;

		/**
		 * @return doorID 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorID")
		public String getDoorID() {
			return doorID;
		}

		/**
		 * @return payload 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
		public String getPayload() {
			return payload;
		}

		/**
		 * @return doorState 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorState")
		public String getDoorState() {
			return doorState;
		}

		/**
		 * @param doorID 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorID")
		public void setDoorID(String doorID) {
			this.doorID = doorID;
		}

		/**
		 * @param payload 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
		public void setPayload(String payload) {
			this.payload = payload;
		}

		/**
		 * @param doorState 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorState")
		public void setDoorState(String doorState) {
			this.doorState = doorState;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((doorID == null) ? 0 : doorID.hashCode());
			result = prime * result
					+ ((payload == null) ? 0 : payload.hashCode());
			result = prime * result
					+ ((doorState == null) ? 0 : doorState.hashCode());
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
			if (doorID == null) {
				if (other.doorID != null)
					return false;
			} else if (!doorID.equals(other.doorID))
				return false;
			if (payload == null) {
				if (other.payload != null)
					return false;
			} else if (!payload.equals(other.payload))
				return false;
			if (doorState == null) {
				if (other.doorState != null)
					return false;
			} else if (!doorState.equals(other.doorState))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameters [ " + "doorID=" + doorID + ", " + "payload="
					+ payload + ", " + "doorState=" + doorState + " ]";
		}
	}
}
