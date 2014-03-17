package org.jasper.dtademo.bloodpressuremonitor;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BpDataReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=BpDataReqImpl.class, name="http://coralcea.ca/jasper/BpDataReq")
})
public interface BpDataReq {

	/**
	 * @return bpSID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSID")
	public String getBpSID();

	/**
	 * @param bpSID 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSID")
	public void setBpSID(String bpSID);
}

