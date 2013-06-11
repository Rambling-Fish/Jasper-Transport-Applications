package org.jasper.jtaDemo.HeartRateMonitorA;

import java.util.Date;

public class HeartRateMonitorAGenerator {
	
	private static int count = 0;
	private static final int MAX_COUNT = 100;
	private static final int MAX_HR = 145;
	private static final int MIN_HR = 45;
	
	public static Patient generateHRData(String str){
		Patient p = new Patient("" + count);
		count++;
		count %= MAX_COUNT;
		int bpm = MIN_HR + (int)(Math.random() * ((MAX_HR - MIN_HR) + 1));
		HeartRateData hr = new HeartRateData(bpm, new Date());
		p.addHeartRateData(hr);	
		return p;
	}
	

}
