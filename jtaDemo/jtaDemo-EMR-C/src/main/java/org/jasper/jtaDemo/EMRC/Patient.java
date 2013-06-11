package org.jasper.jtaDemo.EMRC;

import java.util.ArrayList;

public class Patient {
	
	private String id;
	private ArrayList<HeartRateData> heartRateData;
	private static final int MAX_NUM_OF_RECORDS = 100;
	
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
		if(heartRateData.size() > MAX_NUM_OF_RECORDS) heartRateData.remove(0);
		heartRateData.add(hrData);
	}
	
	public void addHeartRateData(HeartRateData[] hrData){
		for(HeartRateData hrd:hrData){
			addHeartRateData(hrd);
		}
	}
	
}
