package org.jasper.jtaDemo.RoomTemperatureMonitorA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalCache {
	
	
//	private static final String ROOM_TEMP_URI = "http://coralcea.ca/jasper/roomTemperature";
	private static final String ROOM_TEMP_URI = "http://coralcea.ca/jasper/environmentalSensor/roomTemperature";
	private static final int DEFAULT_TEMP = 25;
	private static RoomTemperatureData rmTempData = new RoomTemperatureData(DEFAULT_TEMP);
	
	private RoomTemperatureData getRoomTemperature() {
		return rmTempData;
	}
		
	private RoomTemperatureData setRoomTemperature(int currentTemp) { 
		rmTempData.setRoomTemp(currentTemp);
		return rmTempData;		
	}
	
	public RoomTemperatureData roomTemperatureDataSetAndGet(String currentTemp){
		int temp;
		try{
			String tmp = currentTemp.substring(currentTemp.lastIndexOf("/")+1);
			temp = Integer.parseInt(tmp);
		} catch(NumberFormatException e){
			return getRoomTemperature();
		}

		return setRoomTemperature(temp);
	}
	
	public RoomTemperatureData roomTemperatureDataSetAndGet(Map<String,Serializable>  map){
		String currentTemp = (String) map.get(ROOM_TEMP_URI);
		if(currentTemp == null){
			return getRoomTemperature();
		}else{
			return setRoomTemperature(Integer.parseInt(currentTemp));
		}
	}
	
}
