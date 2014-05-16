package org.jasper.dta.bmgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/DoorStateChange")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=DoorStateChangeImpl.class, name="http://coralcea.ca/jasper/BuildingMgmt/DoorStateChange")
})
public interface DoorStateChange {

	/**
	 * @return doorID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorID")
	public String getDoorID();

	/**
	 * @return payload 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
	public String getPayload();

	/**
	 * @return doorState 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorState")
	public String getDoorState();

	/**
	 * @param doorID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorID")
	public void setDoorID(String doorID);

	/**
	 * @param payload 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/payload")
	public void setPayload(String payload);

	/**
	 * @param doorState 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorState")
	public void setDoorState(String doorState);
}

