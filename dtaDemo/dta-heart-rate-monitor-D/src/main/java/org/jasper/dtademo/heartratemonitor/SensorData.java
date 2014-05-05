package org.jasper.dtademo.heartratemonitor;

public class SensorData {
	private HrData[] hrData;
	
	public SensorData(HrData[] data){
		this.hrData = data;
	}
	
	public HrData[] getSensorData()
	{
		return hrData;
	}
}
