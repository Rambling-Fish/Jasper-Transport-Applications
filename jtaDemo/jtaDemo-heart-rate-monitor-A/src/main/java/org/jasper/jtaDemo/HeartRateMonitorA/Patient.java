package org.jasper.jtaDemo.HeartRateMonitorA;

import java.util.ArrayList;

public class Patient {
	
	private String id;
	private ArrayList<HeartRateData> heartRateData;
	
	public Patient(String id) {
		super();
		this.id = id;
		this.heartRateData = new ArrayList<HeartRateData>();
	}

	public String getId() {
		return id;
	}

	public HeartRateData[] getHeartRateData() {
		return heartRateData.toArray(new HeartRateData[]{});
	}

	public void addHeartRateData(HeartRateData hrData){
		heartRateData.add(hrData);
	}
	
	public void addHeartRateData(HeartRateData[] hrData){
		for(HeartRateData hrd:hrData){
			addHeartRateData(hrd);
		}
	}
	
}
