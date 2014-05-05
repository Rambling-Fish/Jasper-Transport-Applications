package org.jasper.dtademo.heartratemonitor;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/HrDataReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=HrDataReqImpl.class, name="http://coralcea.ca/jasper/HrDataReq")
})
public interface HrDataReq {

	/**
	 * @return hrSID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSID")
	public String getHrSID();

	/**
	 * @param hrSID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSID")
	public void setHrSID(String hrSID);
}

