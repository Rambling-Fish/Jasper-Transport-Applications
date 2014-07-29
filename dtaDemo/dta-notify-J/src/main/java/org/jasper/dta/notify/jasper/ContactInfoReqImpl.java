package org.jasper.dta.notify.jasper;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/ContactInfoReq")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class ContactInfoReqImpl implements ContactInfoReq {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/contactName")
	private String contactName;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/contactName")
	public String getContactName() {
		return contactName;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/contactName")
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contactName == null) ? 0 : contactName.hashCode());
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
		ContactInfoReqImpl other = (ContactInfoReqImpl) obj;
		if (contactName == null) {
			if (other.contactName != null)
				return false;
		} else if (!contactName.equals(other.contactName))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "ContactInfoReqImpl [ " + "contactName=" + contactName + " ]";
	}
}
