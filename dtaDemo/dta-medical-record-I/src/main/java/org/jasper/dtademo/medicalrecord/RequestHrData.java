package org.jasper.dtademo.medicalrecord;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/requestHrData")
public class RequestHrData implements Callable {

	/**
	 * @param muleEventContext
	 * @return Parameter
	 */
	@Generated("false")
	public Parameter onCall(MuleEventContext muleEventContext) throws Exception {
		Parameter parameter = new Parameter();

		if (muleEventContext.getMessage().getPayload() instanceof PatientInfo) {
			parameter.setHrSID(((PatientInfo) muleEventContext.getMessage()
					.getPayload()).getHrSID());
		}

		return parameter;
	}

	/**
	 * The parameter of {@link RequestHrData}
	 */
	@Generated("true")
	public static class Parameter {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/hrSID")
		private String hrSID;

		/**
		 * @return hrSID 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/hrSID")
		public String getHrSID() {
			return hrSID;
		}

		/**
		 * @param hrSID 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/hrSID")
		public void setHrSID(String hrSID) {
			this.hrSID = hrSID;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((hrSID == null) ? 0 : hrSID.hashCode());
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
			if (hrSID == null) {
				if (other.hrSID != null)
					return false;
			} else if (!hrSID.equals(other.hrSID))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameter [ " + "hrSID=" + hrSID + " ]";
		}
	}
}
