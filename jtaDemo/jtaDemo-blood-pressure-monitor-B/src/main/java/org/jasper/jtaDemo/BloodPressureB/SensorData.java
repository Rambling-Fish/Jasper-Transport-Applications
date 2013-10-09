package org.jasper.jtaDemo.BloodPressureB;

import org.codehaus.jackson.annotate.JsonProperty;

public class SensorData{
	private static final String BP_DATA_URI = "http://coralcea.ca/jasper/medicalSensor/bloodPressure/data";

	@JsonProperty(value=BP_DATA_URI)
	private BpData[] bpData;
	
	public SensorData(BpData[] data){
		this.bpData = data;
	}
}
