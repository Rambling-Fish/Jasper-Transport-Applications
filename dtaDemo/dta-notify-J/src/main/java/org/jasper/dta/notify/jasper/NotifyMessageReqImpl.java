package org.jasper.dta.notify.jasper;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/NotifyMessageReq")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class NotifyMessageReqImpl implements NotifyMessageReq {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/msgSubject")
	private String msgSubject;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/fromName")
	private String fromName;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/toName")
	private String toName;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/msgBody")
	private String msgBody;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/msgSubject")
	public String getMsgSubject() {
		return msgSubject;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/fromName")
	public String getFromName() {
		return fromName;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/toName")
	public String getToName() {
		return toName;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/msgBody")
	public String getMsgBody() {
		return msgBody;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/msgSubject")
	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/fromName")
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/toName")
	public void setToName(String toName) {
		this.toName = toName;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/notify/msgBody")
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((msgSubject == null) ? 0 : msgSubject.hashCode());
		result = prime * result
				+ ((fromName == null) ? 0 : fromName.hashCode());
		result = prime * result + ((toName == null) ? 0 : toName.hashCode());
		result = prime * result + ((msgBody == null) ? 0 : msgBody.hashCode());
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
		NotifyMessageReqImpl other = (NotifyMessageReqImpl) obj;
		if (msgSubject == null) {
			if (other.msgSubject != null)
				return false;
		} else if (!msgSubject.equals(other.msgSubject))
			return false;
		if (fromName == null) {
			if (other.fromName != null)
				return false;
		} else if (!fromName.equals(other.fromName))
			return false;
		if (toName == null) {
			if (other.toName != null)
				return false;
		} else if (!toName.equals(other.toName))
			return false;
		if (msgBody == null) {
			if (other.msgBody != null)
				return false;
		} else if (!msgBody.equals(other.msgBody))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "NotifyMessageReqImpl [ " + "msgSubject=" + msgSubject + ", "
				+ "fromName=" + fromName + ", " + "toName=" + toName + ", "
				+ "msgBody=" + msgBody + " ]";
	}
}
