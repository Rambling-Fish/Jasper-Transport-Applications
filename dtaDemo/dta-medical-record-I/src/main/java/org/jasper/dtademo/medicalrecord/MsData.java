package org.jasper.dtademo.medicalrecord;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/MsData")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=MsDataImpl.class, name="http://coralcea.ca/jasper/MsData"),
	@JsonSubTypes.Type(value=BpDataImpl.class, name="http://coralcea.ca/jasper/BpData"),
	@JsonSubTypes.Type(value=HrDataImpl.class, name="http://coralcea.ca/jasper/HrData")
})
public interface MsData {
}

