package org.jasper.dta.bmgen;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Generated;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/sendRoomTempUpdate")
public class SendRoomTempUpdate implements Callable {

	private static Logger log = Logger.getLogger(SendRoomTempUpdate.class.getName());
	private static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");
	
	private String parsedRoomID;
	private int    parsedTemperature;
	private String parsedTimestamp;
	private String parsedPayload;
	
	private String errorText;
	
	/**
	 * @param muleEventContext
	 * @return Parameters
	 */
	@Generated("false")
	public Parameters onCall(MuleEventContext muleEventContext) throws Exception {
		
		Parameters parameters = new Parameters();
		MuleMessage message = muleEventContext.getMessage();
		String browserInput = (String) message.getPayload();

		if (parseRoomTempParameters(browserInput))
		{
			parameters.setRoomID(parsedRoomID);
			parameters.setTemperature(parsedTemperature);
			parameters.setTimestamp(parsedTimestamp);

			if (parsedPayload == null)
			{
				if (BmRequest.PAYLOADS.get(parsedRoomID) == null) {
					parameters.setPayload("");
				}
				else {
					parameters.setPayload(BmRequest.PAYLOADS.get(parsedRoomID));				
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

	private boolean parseRoomTempParameters(String browserInput) {

		// RURI : http://0.0.0.0:8083/rbm/roomTempUpdate
		// PARM : http://coralcea.ca/jasper/BuildingMgmt/roomID=010
		// PARM : http://coralcea.ca/jasper/BuildingMgmt/temperature=25
		// PARM : http://coralcea.ca/jasper/timestamp=2014-03-18T12:09:51.841-0400  (optional)

		// EXAMPLE:
		// 0.0.0.0:8083/rbm/roomTempUpdate?http://coralcea.ca/jasper/BuildingMgmt/roomID=010&http://coralcea.ca/jasper/BuildingMgmt/temperature=25&http://coralcea.ca/jasper/timestamp=2014-03-18T12:09:51.841-0400
		
		boolean haveRoomID      = false, 
				haveTemperature = false, 
				haveTimestamp   = false;
		
		parsedRoomID = null;
		parsedTemperature = 0;
		parsedTimestamp = null;
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
		for (String parmPairString: parmPairs)
		{
			String parmPair[] = parmPairString.split("\\=");
			
			if (parmPair.length != 2) {
				errorText = "Invalid parameter (expect key=value) : " + parmPairString;
				log.warn(errorText);
				return false;
			}
			
			// Identify the parameter key and set its value
			if (parmPair[0].matches(BmRequest.ROOM_ID_URI))
			{
				parsedRoomID = parmPair[1];
				haveRoomID = true;
			}
			else if (parmPair[0].matches(BmRequest.TEMPERATURE_URI))
			{
				parsedTemperature = Integer.parseInt(parmPair[1]);
				haveTemperature = true;
			}
			else if (parmPair[0].matches(BmRequest.TIMESTAMP_URI))
			{
				parsedTimestamp = parmPair[1];
				haveTimestamp = true;
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
		
		if (!haveTimestamp)
		{
			// If a timestamp was not passed, create a "current" timestamp
			parsedTimestamp = dt.format(new Date());
			haveTimestamp = true;
		}
		
		if (haveRoomID && haveTemperature && haveTimestamp)
		{
			return true;
		}
		else
		{
			errorText = "Mandatory parameter missing";
			return false;
		}
	}


	/**
	 * The parameters of {@link SendRoomTempUpdate}
	 */
	@Generated("true")
	public static class Parameters {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/temperature")
		private int temperature;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
		private String payload;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/timestamp")
		private String timestamp;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomID")
		private String roomID;

		/**
		 * @return temperature 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/temperature")
		public int getTemperature() {
			return temperature;
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
		 * @return timestamp 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/timestamp")
		public String getTimestamp() {
			return timestamp;
		}

		/**
		 * @return roomID 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomID")
		public String getRoomID() {
			return roomID;
		}

		/**
		 * @param temperature 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/temperature")
		public void setTemperature(int temperature) {
			this.temperature = temperature;
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
		 * @param timestamp 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/timestamp")
		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		/**
		 * @param roomID 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomID")
		public void setRoomID(String roomID) {
			this.roomID = roomID;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + temperature;
			result = prime * result
					+ ((payload == null) ? 0 : payload.hashCode());
			result = prime * result
					+ ((timestamp == null) ? 0 : timestamp.hashCode());
			result = prime * result
					+ ((roomID == null) ? 0 : roomID.hashCode());
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
			if (temperature != other.temperature)
				return false;
			if (payload == null) {
				if (other.payload != null)
					return false;
			} else if (!payload.equals(other.payload))
				return false;
			if (timestamp == null) {
				if (other.timestamp != null)
					return false;
			} else if (!timestamp.equals(other.timestamp))
				return false;
			if (roomID == null) {
				if (other.roomID != null)
					return false;
			} else if (!roomID.equals(other.roomID))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameters [ " + "temperature=" + temperature + ", "
					+ "payload=" + payload + ", " + "timestamp=" + timestamp
					+ ", " + "roomID=" + roomID + " ]";
		}
	}
}
