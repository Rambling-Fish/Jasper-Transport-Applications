package org.jasper.dta.bmgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/RoomTempUpdateWrapped")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=RoomTempUpdateWrappedImpl.class, name="http://coralcea.ca/jasper/BuildingMgmt/RoomTempUpdateWrapped")
})
public interface RoomTempUpdateWrapped {

	/**
	 * @return roomTempUpdate 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomTempUpdate")
	public RoomTempUpdate getRoomTempUpdate();

	/**
	 * @param roomTempUpdate 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/roomTempUpdate")
	public void setRoomTempUpdate(RoomTempUpdate roomTempUpdate);
}

