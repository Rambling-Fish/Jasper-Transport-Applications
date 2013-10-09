package org.jasper.jtaDemo.HeartRateMonitorA;

import org.codehaus.jackson.annotate.JsonProperty;

public class SensorData{
	
	private static final String HR_DATA_URI = "http://coralcea.ca/jasper/medicalSensor/heartRate/data";
	
	@JsonProperty(value=HR_DATA_URI)
	private HrData[] hrData;
	
	public SensorData(HrData[] data){
		this.hrData = data;
	}
}
