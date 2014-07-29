package org.jasper.dta.notify;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.*;
import org.jasper.dta.notify.jasper.ContactInfoReq;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/dta-J/getContactInfo")
public class GetContactInfo implements Callable {

	/**
	 * @param muleEventContext
	 * @return Parameter
	 */
	@Generated("false")
	public Parameter onCall(MuleEventContext muleEventContext) throws Exception {
		Parameter parameter = new Parameter();

		if (muleEventContext.getMessage().getPayload() instanceof ContactInfoReq) {
			parameter.setContactName(((ContactInfoReq) muleEventContext
					.getMessage().getPayload()).getContactName());
		}

		return parameter;
	}

	/**
	 * The parameter of {@link GetContactInfo}
	 */
	@Generated("true")
	public static class Parameter {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/contactName")
		private String contactName;

		/**
		 * @return contactName 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/contactName")
		public String getContactName() {
			return contactName;
		}

		/**
		 * @param contactName 
		 */
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
			Parameter other = (Parameter) obj;
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
			return "Parameter [ " + "contactName=" + contactName + " ]";
		}
	}
}
