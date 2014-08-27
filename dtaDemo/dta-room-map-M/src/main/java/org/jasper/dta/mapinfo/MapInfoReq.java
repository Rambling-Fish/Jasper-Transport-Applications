package org.jasper.dta.mapinfo;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/MapInfoReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=MapInfoReqImpl.class, name="http://coralcea.ca/jasper/MapInfoReq")
})
public interface MapInfoReq {

	/**
	 * @return roomId 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public String getRoomId();

	/**
	 * @param roomId 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/roomId")
	public void setRoomId(String roomId);
}

