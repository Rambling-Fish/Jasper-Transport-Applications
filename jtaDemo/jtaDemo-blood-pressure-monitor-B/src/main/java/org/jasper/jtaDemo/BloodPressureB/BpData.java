package org.jasper.jtaDemo.BloodPressureB;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class BpData{
	
	private static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS zzz"); 
	
	private static final String BP_SYS_URI = "http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/systolic";
	private static final String BP_DIA_URI = "http://coralcea.ca/jasper/medicalSensor/bloodPressure/data/diastolic";
	private static final String TIMESTAMP_URI = "http://coralcea.ca/jasper/timeStamp";
	
	@JsonProperty(value=BP_SYS_URI)
	private int sys;
	
	@JsonProperty(value=BP_DIA_URI)
	private int dia;

	@JsonProperty(value=TIMESTAMP_URI)
	private String timestamp;

	public BpData(int systolic, int diastolic) {
		super();
		this.sys = systolic;
		this.dia = diastolic;
		timestamp = dt.format(new Date());
	}
}
