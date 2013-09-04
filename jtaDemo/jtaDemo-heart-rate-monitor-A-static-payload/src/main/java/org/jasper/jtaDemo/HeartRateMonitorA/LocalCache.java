package org.jasper.jtaDemo.HeartRateMonitorA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;

public class LocalCache {
	
	private static final String wardInfo;
	static{
		String tmp;
		try{
			String filename = "src/main/resources/hrData.json";
			if(!(new File(filename)).exists()){
				String workingDir = System.getProperty("user.dir");
				workingDir = workingDir.substring(0, workingDir.length()-"bin/".length());
				workingDir += "/apps/jtaDemo-heart-rate-monitor-A-static-payload-2.0/classes/hrData.json";
				filename =  workingDir;
			}
			BufferedReader br = new BufferedReader(new FileReader(filename));
		    StringBuffer str = new StringBuffer();
		    String line = br.readLine();
		    while (line != null)
		    {
		        str.append(line);
		        str.append("\n");
		        line = br.readLine();
		    }
		    tmp = str.toString();
		}catch (Exception e){
			tmp = "{}";
			e.printStackTrace();
		}
		wardInfo = tmp;
	}
	
	public static String getWard(Map req){
		System.out.print("recieved request at " + System.nanoTime());
		return wardInfo;
	}
	
	public static String getWard(String[] req){
		System.out.print("recieved request at " + System.nanoTime());
		return wardInfo;
	}

	public static String getWard(String str){
		System.out.print("-recieved request at " + System.nanoTime());
		return wardInfo;
	}

}
