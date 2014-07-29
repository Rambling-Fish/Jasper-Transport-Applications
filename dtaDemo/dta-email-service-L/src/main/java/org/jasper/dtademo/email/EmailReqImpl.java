package org.jasper.dtademo.email;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/EmailReq")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class EmailReqImpl implements EmailReq {

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

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressFrom")
	public String getEmailAddressFrom() {
		return emailAddressFrom;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressTo")
	public String getEmailAddressTo() {
		return emailAddressTo;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailBody")
	public String getEmailBody() {
		return emailBody;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailSubject")
	public String getEmailSubject() {
		return emailSubject;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressFrom")
	public void setEmailAddressFrom(String emailAddressFrom) {
		this.emailAddressFrom = emailAddressFrom;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailAddressTo")
	public void setEmailAddressTo(String emailAddressTo) {
		this.emailAddressTo = emailAddressTo;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/EmailMsg/emailBody")
	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	@Override
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
				+ ((emailAddressFrom == null) ? 0 : emailAddressFrom.hashCode());
		result = prime * result
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
		EmailReqImpl other = (EmailReqImpl) obj;
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
		return "EmailReqImpl [ " + "emailAddressFrom=" + emailAddressFrom
				+ ", " + "emailAddressTo=" + emailAddressTo + ", "
				+ "emailBody=" + emailBody + ", " + "emailSubject="
				+ emailSubject + " ]";
	}
}
