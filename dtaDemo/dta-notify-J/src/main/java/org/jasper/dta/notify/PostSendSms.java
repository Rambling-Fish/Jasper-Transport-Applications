package org.jasper.dta.notify;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.*;
import org.jasper.dta.notify.jasper.EmailReq;
import org.jasper.dta.notify.jasper.SmsPostReq;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/dta-J/postSendSms")
public class PostSendSms implements Callable {

	/**
	 * @param muleEventContext
	 * @return Parameter
	 */
	@Generated("true")
	public Parameter onCall(MuleEventContext muleEventContext) throws Exception {
		Parameter parameter = new Parameter();

        if (muleEventContext.getMessage().getPayload() instanceof SmsPostReq) {
            parameter.setToSms(((SmsPostReq) muleEventContext.getMessage().getPayload()).getToSms());
            parameter.setFromSms(((SmsPostReq) muleEventContext.getMessage().getPayload()).getFromSms());
            parameter.setBodySms(((SmsPostReq) muleEventContext.getMessage().getPayload()).getBodySms());
            parameter.setLogId(((SmsPostReq) muleEventContext.getMessage().getPayload()).getLogId());
        }
		return parameter;
	}

	/**
	 * The parameter of {@link PostSendSms}
	 */
	@Generated("true")
	public static class Parameter {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/toSms")
		private String toSms;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/bodySms")
		private String bodySms;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/logId")
		private String logId;

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/fromSms")
		private String fromSms;

		/**
		 * @return toSms 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/toSms")
		public String getToSms() {
			return toSms;
		}

		/**
		 * @return bodySms 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/bodySms")
		public String getBodySms() {
			return bodySms;
		}

		/**
		 * @return logId 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/logId")
		public String getLogId() {
			return logId;
		}

		/**
		 * @return fromSms 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/fromSms")
		public String getFromSms() {
			return fromSms;
		}

		/**
		 * @param toSms 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/toSms")
		public void setToSms(String toSms) {
			this.toSms = toSms;
		}

		/**
		 * @param bodySms 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/bodySms")
		public void setBodySms(String bodySms) {
			this.bodySms = bodySms;
		}

		/**
		 * @param logId 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/logId")
		public void setLogId(String logId) {
			this.logId = logId;
		}

		/**
		 * @param fromSms 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/Sms/fromSms")
		public void setFromSms(String fromSms) {
			this.fromSms = fromSms;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((toSms == null) ? 0 : toSms.hashCode());
			result = prime * result
					+ ((bodySms == null) ? 0 : bodySms.hashCode());
			result = prime * result + ((logId == null) ? 0 : logId.hashCode());
			result = prime * result
					+ ((fromSms == null) ? 0 : fromSms.hashCode());
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
			if (toSms == null) {
				if (other.toSms != null)
					return false;
			} else if (!toSms.equals(other.toSms))
				return false;
			if (bodySms == null) {
				if (other.bodySms != null)
					return false;
			} else if (!bodySms.equals(other.bodySms))
				return false;
			if (logId == null) {
				if (other.logId != null)
					return false;
			} else if (!logId.equals(other.logId))
				return false;
			if (fromSms == null) {
				if (other.fromSms != null)
					return false;
			} else if (!fromSms.equals(other.fromSms))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameter [ " + "toSms=" + toSms + ", " + "bodySms="
					+ bodySms + ", " + "logId=" + logId + ", " + "fromSms="
					+ fromSms + " ]";
		}
	}
}
