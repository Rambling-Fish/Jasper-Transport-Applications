package org.jasper.dtademo.heartratemonitor;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/HrData")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class HrDataImpl implements HrData {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSensor/bpm")
	private int bpm;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	private String timestamp;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSensor/bpm")
	public int getBpm() {
		return bpm;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/hrSensor/bpm")
	public void setBpm(int bpm) {
		this.bpm = bpm;
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
		result = prime * result + bpm;
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
		HrDataImpl other = (HrDataImpl) obj;
		if (bpm != other.bpm)
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
		return "HrDataImpl [ " + "bpm=" + bpm + ", " + "timestamp=" + timestamp
				+ " ]";
	}
}
