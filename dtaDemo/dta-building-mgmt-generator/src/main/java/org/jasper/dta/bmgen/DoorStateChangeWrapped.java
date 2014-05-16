package org.jasper.dta.bmgen;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BuildingMgmt/DoorStateChangeWrapped")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=DoorStateChangeWrappedImpl.class, name="http://coralcea.ca/jasper/BuildingMgmt/DoorStateChangeWrapped")
})
public interface DoorStateChangeWrapped {

	/**
	 * @return doorStateChange 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorStateChange")
	public DoorStateChange getDoorStateChange();

	/**
	 * @param doorStateChange 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/BuildingMgmt/doorStateChange")
	public void setDoorStateChange(DoorStateChange doorStateChange);
}

