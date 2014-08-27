package org.jasper.dta.mapinfo;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/MapInfoUpdateReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=MapInfoUpdateReqImpl.class, name="http://coralcea.ca/jasper/MapInfoUpdateReq")
})
public interface MapInfoUpdateReq {

	/**
	 * @return fullName 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/map/fullName")
	public String getFullName();

	/**
	 * @return roomId 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public String getRoomId();

	/**
	 * @param fullName 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/map/fullName")
	public void setFullName(String fullName);

	/**
	 * @param roomId 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public void setRoomId(String roomId);
}

