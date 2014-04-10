package org.jasper.dtademo.bloodpressuremonitor;

public class SensorData {
	private BpData[] bpData;
	
	public SensorData(BpData[] data){
		this.bpData = data;
	}
	
	public BpData[] getSensorData()
	{
		return bpData;
	}
}
