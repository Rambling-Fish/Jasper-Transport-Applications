package org.jasper.jtaDemo.RoomTemperatureMonitorA;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class RoomTemperatureData {

private static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS zzz"); 
	
	private static final String ROOM_TEMP_URI = "http://coralcea.ca/jasper/environmentalSensor/temperature/temp";
	private static final String TIMESTAMP_URI = "http://coralcea.ca/jasper/timeStamp";
	
	@JsonProperty(value=ROOM_TEMP_URI)
	private int currentTemp;

	@JsonProperty(value=TIMESTAMP_URI)
	private String timestamp;

	public RoomTemperatureData(int currentTemp) {
		super();
		this.currentTemp = currentTemp;
		timestamp = dt.format(new Date());
	}
	
	public void setRoomTemp(int temp){
		this.currentTemp = temp;
		timestamp = dt.format(new Date());
	}

}
