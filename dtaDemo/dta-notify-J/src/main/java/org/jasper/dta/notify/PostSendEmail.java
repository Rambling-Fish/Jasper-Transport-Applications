package org.jasper.dta.notify;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.*;
import org.jasper.dta.notify.jasper.ContactInfoReq;
import org.jasper.dta.notify.jasper.EmailReq;
import org.jasper.dta.notify.jasper.EmailReqImpl;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/dta-J/postSendEmail")
public class PostSendEmail implements Callable {

	/**
	 * @param muleEventContext
	 * @return Parameter
	 */
	@Generated("false")
	public Parameter onCall(MuleEventContext muleEventContext) throws Exception {
		Parameter parameter = new Parameter();

        if (muleEventContext.getMessage().getPayload() instanceof EmailReq) {
            parameter.setEmailAddressFrom(((EmailReq) muleEventContext.getMessage().getPayload()).getEmailAddressFrom());
            parameter.setEmailAddressTo(((EmailReq) muleEventContext.getMessage().getPayload()).getEmailAddressTo());
            parameter.setEmailSubject(((EmailReq) muleEventContext.getMessage().getPayload()).getEmailSubject());
            parameter.setEmailBody(((EmailReq) muleEventContext.getMessage().getPayload()).getEmailBody());
        }
		return parameter;
	}

	/**
	 * The parameter of {@link PostSendEmail}
	 */
	@Generated("true")
	public static class Parameter {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressFrom")
		private String emailAddressFrom;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressTo")
		private String emailAddressTo;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailBody")
		private String emailBody;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailSubject")
		private String emailSubject;

		/**
		 * @return emailAddressFrom 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressFrom")
		public String getEmailAddressFrom() {
			return emailAddressFrom;
		}

		/**
		 * @return emailAddressTo 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressTo")
		public String getEmailAddressTo() {
			return emailAddressTo;
		}

		/**
		 * @return emailBody 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailBody")
		public String getEmailBody() {
			return emailBody;
		}

		/**
		 * @return emailSubject 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailSubject")
		public String getEmailSubject() {
			return emailSubject;
		}

		/**
		 * @param emailAddressFrom 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressFrom")
		public void setEmailAddressFrom(String emailAddressFrom) {
			this.emailAddressFrom = emailAddressFrom;
		}

		/**
		 * @param emailAddressTo 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressTo")
		public void setEmailAddressTo(String emailAddressTo) {
			this.emailAddressTo = emailAddressTo;
		}

		/**
		 * @param emailBody 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailBody")
		public void setEmailBody(String emailBody) {
			this.emailBody = emailBody;
		}

		/**
		 * @param emailSubject 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailSubject")
		public void setEmailSubject(String emailSubject) {
			this.emailSubject = emailSubject;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime
					* result
					+ ((emailAddressFrom == null) ? 0 : emailAddressFrom
							.hashCode());
			result = prime
					* result
					+ ((emailAddressTo == null) ? 0 : emailAddressTo.hashCode());
			result = prime * result
					+ ((emailBody == null) ? 0 : emailBody.hashCode());
			result = prime * result
					+ ((emailSubject == null) ? 0 : emailSubject.hashCode());
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
			if (emailAddressFrom == null) {
				if (other.emailAddressFrom != null)
					return false;
			} else if (!emailAddressFrom.equals(other.emailAddressFrom))
				return false;
			if (emailAddressTo == null) {
				if (other.emailAddressTo != null)
					return false;
			} else if (!emailAddressTo.equals(other.emailAddressTo))
				return false;
			if (emailBody == null) {
				if (other.emailBody != null)
					return false;
			} else if (!emailBody.equals(other.emailBody))
				return false;
			if (emailSubject == null) {
				if (other.emailSubject != null)
					return false;
			} else if (!emailSubject.equals(other.emailSubject))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameter [ " + "emailAddressFrom=" + emailAddressFrom
					+ ", " + "emailAddressTo=" + emailAddressTo + ", "
					+ "emailBody=" + emailBody + ", " + "emailSubject="
					+ emailSubject + " ]";
		}
	}
}
