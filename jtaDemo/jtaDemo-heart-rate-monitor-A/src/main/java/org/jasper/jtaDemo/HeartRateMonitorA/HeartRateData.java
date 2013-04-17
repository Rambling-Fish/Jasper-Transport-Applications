package org.jasper.jtaDemo.HeartRateMonitorA;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HeartRateData {

	private int bpm;
	private Date timestamp;
	
	public HeartRateData(int bpm, Date timestamp) {
		super();
		this.bpm = bpm;
		this.timestamp = timestamp;
	}
	public int getBpm() {
		return bpm;
	}
	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
	public String getTimestamp() {
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS zzz"); 
		return dt.format(timestamp);
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
