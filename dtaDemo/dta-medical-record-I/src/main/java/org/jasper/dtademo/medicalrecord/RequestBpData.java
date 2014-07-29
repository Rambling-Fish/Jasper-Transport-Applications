package org.jasper.dtademo.medicalrecord;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/requestBpData")
public class RequestBpData implements Callable {

	/**
	 * @param muleEventContext
	 * @return Parameter
	 */
	@Generated("false")
	public Parameter onCall(MuleEventContext muleEventContext) throws Exception {
		Parameter parameter = new Parameter();

		if (muleEventContext.getMessage().getPayload() instanceof PatientInfo) {
			parameter.setBpSID(((PatientInfo) muleEventContext.getMessage()
					.getPayload()).getBpSID());
		}

		return parameter;
	}

	/**
	 * The parameter of {@link RequestBpData}
	 */
	@Generated("true")
	public static class Parameter {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/bpSID")
		private String bpSID;

		/**
		 * @return bpSID 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/bpSID")
		public String getBpSID() {
			return bpSID;
		}

		/**
		 * @param bpSID 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/bpSID")
		public void setBpSID(String bpSID) {
			this.bpSID = bpSID;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((bpSID == null) ? 0 : bpSID.hashCode());
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
			if (bpSID == null) {
				if (other.bpSID != null)
					return false;
			} else if (!bpSID.equals(other.bpSID))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameter [ " + "bpSID=" + bpSID + " ]";
		}
	}
}
