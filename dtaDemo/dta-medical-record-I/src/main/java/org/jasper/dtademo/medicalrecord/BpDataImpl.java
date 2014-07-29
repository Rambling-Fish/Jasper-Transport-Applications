package org.jasper.dtademo.medicalrecord;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/BpData")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class BpDataImpl implements BpData {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSensor/systolic")
	private int systolic;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSensor/diastolic")
	private int diastolic;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	private String timestamp;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSensor/systolic")
	public int getSystolic() {
		return systolic;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSensor/diastolic")
	public int getDiastolic() {
		return diastolic;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSensor/systolic")
	public void setSystolic(int systolic) {
		this.systolic = systolic;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/bpSensor/diastolic")
	public void setDiastolic(int diastolic) {
		this.diastolic = diastolic;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + systolic;
		result = prime * result + diastolic;
		result = prime * result
				+ ((timestamp == null) ? 0 : timestamp.hashCode());
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
		BpDataImpl other = (BpDataImpl) obj;
		if (systolic != other.systolic)
			return false;
		if (diastolic != other.diastolic)
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "BpDataImpl [ " + "systolic=" + systolic + ", " + "diastolic="
				+ diastolic + ", " + "timestamp=" + timestamp + " ]";
	}
}
