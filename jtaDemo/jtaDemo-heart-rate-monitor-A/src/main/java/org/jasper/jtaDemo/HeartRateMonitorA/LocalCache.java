package org.jasper.jtaDemo.HeartRateMonitorA;

import org.jasper.jLib.jCommons.message.JasperSyncRequest;

public class LocalCache {
	private static Ward ward = new Ward("Wing-5-Floor-3-Ward-4");
	
	public static void addPatientInfo(Patient p){
		ward.addPatientHeartRateData(p);
	}
	
	public static Ward getWard(JasperSyncRequest req){
		return getWard(req.getUri());
	}

	public static Ward getWard(String str){
		System.out.println("Ward " + str);
		return ward;
	}

}
