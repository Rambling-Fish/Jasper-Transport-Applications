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

	private static Logger log = Logger.getLogger(SendRoomTempUpdate.class
			.getName());

	private static final SimpleDateFormat dt = new SimpleDateFormat(
			"yyyy-MM-dd'T'hh:mm:ss.SSSZ");

	private String parsedRoomID;

	private int parsedTemperature;

	private String parsedTimestamp;

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

		RoomTempUpdate roomTempUpdate = new RoomTempUpdateImpl();
		
		if (parseRoomTempParameters(browserInput)) {
			roomTempUpdate.setRoomID(parsedRoomID);
			roomTempUpdate.setTemperature(parsedTemperature);
			roomTempUpdate.setTimestamp(parsedTimestamp);

			if (parsedPayload == null) {
				if (BmRequest.PAYLOADS.get(parsedRoomID) == null) {
					roomTempUpdate.setPayload("");
				} else {
					roomTempUpdate.setPayload(BmRequest.PAYLOADS.get(parsedRoomID));
				}
			} else {
				roomTempUpdate.setPayload(parsedPayload);
			}
		} else {
			throw new Exception(errorText);
		}

		parameters.setRoomTempUpdate(roomTempUpdate);

		return parameters;
	}

	private boolean parseRoomTempParameters(String browserInput) {

		// RURI : http://0.0.0.0:8083/rbm/roomTempUpdate
		// PARM : http://coralcea.ca/jasper/BuildingMgmt/roomID=010
		// PARM : http://coralcea.ca/jasper/BuildingMgmt/temperature=25
		// PARM : http://coralcea.ca/jasper/timestamp=2014-03-18T12:09:51.841-0400  (optional)

		// EXAMPLE:
		// 0.0.0.0:8083/rbm/roomTempUpdate?http://coralcea.ca/jasper/BuildingMgmt/roomID=010&http://coralcea.ca/jasper/BuildingMgmt/temperature=25&http://coralcea.ca/jasper/timestamp=2014-03-18T12:09:51.841-0400

		boolean haveRoomID = false, haveTemperature = false, haveTimestamp = false;

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
		for (String parmPairString : parmPairs) {
			String parmPair[] = parmPairString.split("\\=");

			if (parmPair.length != 2) {
				errorText = "Invalid parameter (expect key=value) : "
						+ parmPairString;
				log.warn(errorText);
				return false;
			}

			// Identify the parameter key and set its value
			if (parmPair[0].matches(BmRequest.ROOM_ID_URI)) {
				parsedRoomID = parmPair[1];
				haveRoomID = true;
			} else if (parmPair[0].matches(BmRequest.TEMPERATURE_URI)) {
				parsedTemperature = Integer.parseInt(parmPair[1]);
				haveTemperature = true;
			} else if (parmPair[0].matches(BmRequest.TIMESTAMP_URI)) {
				parsedTimestamp = parmPair[1];
				haveTimestamp = true;
			} else if (parmPair[0].matches(BmRequest.PAYLOAD_URI)) {
				parsedPayload = parmPair[1];
			} else {
				log.info("Unknown parameter : " + parmPair[0] + "="
						+ parmPair[1]);
			}
		}

		if (!haveTimestamp) {
			// If a timestamp was not passed, create a "current" timestamp
			parsedTimestamp = dt.format(new Date());
			haveTimestamp = true;
		}

		if (haveRoomID && haveTemperature && haveTimestamp) {
			return true;
		} else {
			errorText = "Mandatory parameter missing";
			return false;
		}
	}

	/**
	 * The parameter of {@link SendRoomTempUpdate}
	 */
	@Generated("true")
	public static class Parameter {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomTempUpdate")
		private RoomTempUpdate roomTempUpdate;

		/**
		 * @return roomTempUpdate 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomTempUpdate")
		public RoomTempUpdate getRoomTempUpdate() {
			return roomTempUpdate;
		}

		/**
		 * @param roomTempUpdate 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomTempUpdate")
		public void setRoomTempUpdate(RoomTempUpdate roomTempUpdate) {
			this.roomTempUpdate = roomTempUpdate;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime
					* result
					+ ((roomTempUpdate == null) ? 0 : roomTempUpdate.hashCode());
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
			if (roomTempUpdate == null) {
				if (other.roomTempUpdate != null)
					return false;
			} else if (!roomTempUpdate.equals(other.roomTempUpdate))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameter [ " + "roomTempUpdate=" + roomTempUpdate + " ]";
		}
	}
}
