package org.jasper.dtaDemo.HeartRateMonitorD;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class HrData{

	private static final String BPM_URI = "http://coralcea.ca/jasper/medicalSensor/heartRate/data/bpm";
	private static final String TIMESTAMP_URI = "http://coralcea.ca/jasper/timeStamp";
	
	private static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS zzz"); 

	
	@JsonProperty(value=BPM_URI)
	private int bpm;

	@JsonProperty(value=TIMESTAMP_URI)
	private String timestamp;

	public HrData(int bpm) {
		this.bpm = bpm;
		timestamp = dt.format(new Date());
	}
}
