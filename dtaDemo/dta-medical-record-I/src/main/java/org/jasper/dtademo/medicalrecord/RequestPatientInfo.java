package org.jasper.dtademo.medicalrecord;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.*;
import org.mule.api.lifecycle.Callable;
import org.mule.api.MuleEventContext;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/requestPatientInfo")
public class RequestPatientInfo implements Callable {

	/**
	 * @param muleEventContext
	 * @return Parameter
	 */
	@Generated("false")
	public Parameter onCall(MuleEventContext muleEventContext) throws Exception {
		Parameter parameter = new Parameter();

		if (muleEventContext.getMessage().getPayload() instanceof PatientInfo) {
			parameter.setPatientID(((PatientInfo) muleEventContext.getMessage()
					.getPayload()).getPatientID());
		} else if (muleEventContext.getMessage().getPayload() instanceof PatientInfoReq) {
			parameter.setPatientID(((PatientInfoReq) muleEventContext
					.getMessage().getPayload()).getPatientID());
		}

		return parameter;
	}

	/**
	 * The parameter of {@link RequestPatientInfo}
	 */
	@Generated("true")
	public static class Parameter {

		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/patientID")
		private String patientID;

		/**
		 * @return patientID 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/patientID")
		public String getPatientID() {
			return patientID;
		}

		/**
		 * @param patientID 
		 */
		@Generated("true")
		@JsonProperty("http://coralcea.ca/jasper/patientID")
		public void setPatientID(String patientID) {
			this.patientID = patientID;
		}

		@Override
		@Generated("true")
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((patientID == null) ? 0 : patientID.hashCode());
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
			if (patientID == null) {
				if (other.patientID != null)
					return false;
			} else if (!patientID.equals(other.patientID))
				return false;
			return true;
		}

		@Override
		@Generated("true")
		public String toString() {
			return "Parameter [ " + "patientID=" + patientID + " ]";
		}
	}
}
