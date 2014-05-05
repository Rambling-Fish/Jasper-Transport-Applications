package org.jasper.dta.bmgen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class LogBmRequest 
{
	private static Logger log = Logger.getLogger(LogBmRequest.class.getName());
	
	private static FileWriter fw = null;
	private static final SimpleDateFormat dt = new SimpleDateFormat("yyyyMMddHHmmss");
	private static String logFile;

	static {
		if (isStandalone())
		{
			// for deployed standalone DTA (ie, via dtaManagement.sh), log to directory <install-dir>/jasper-2.1.0/logs
			logFile = "../../../logs/dtaTS-bmg-" + dt.format(new Date()) + ".log";
			log.info("running standalone, logging to " + logFile);
		}
		else
		{
			// for ecclipse launched DTA
			String toLogFile = System.getProperty("logFile");

			if ((toLogFile == null) || (toLogFile.length() <= 0))
			{
				// no log file specified in run arguments, so log to current project directory
				logFile = "./dtaTS-bmg-" + dt.format(new Date()) + ".log";
			}
			else
			{
				// log to file specified in run arguments (eg: -DlogFile=/Users/username/logs/bmg-logs.log) 
				logFile = toLogFile;
			}
			log.info("running in eclipse IDE, logging to " + logFile);
		}
		
		File file = new File(logFile);
		try {
			fw = new FileWriter(file, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void process(String httpString)
	{
		// http://0.0.0.0:8083/rbm/roomTempUpdate?
		// http://coralcea.ca/jasper/BuildingMgmt/roomID=R011&     <--- looking for roomID value
		// http://coralcea.ca/jasper/BuildingMgmt/temperature=19&
		// http://coralcea.ca/jasper/timestamp=20140318-101100EST
		
		// http://0.0.0.0:8083/rbm/doorStateChange?
		// http://coralcea.ca/jasper/BuildingMgmt/doorID=D004&     <--- looking for doorID value
		// http://coralcea.ca/jasper/BuildingMgmt/doorState=open

		String requestId = getBmRequestIdentifier(httpString);
		
		if (requestId == null)
			return;
			
		long ts = System.nanoTime();

		try {
			fw.write(requestId + "." + ts + "\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
	
	private String getBmRequestIdentifier(String requestString)
	{
		// split the RURI and PARAMETERS.
		// RURI is requestArray[0]
		// PARAMETERS are requestArray[1]
		
		String requestArray[] = requestString.split("\\?");

		if (requestArray.length != 2) {
			return null;
		}

		// split the PARAMETERS into KEY/VALUE pairs
		// parmPairs[0] is first key/value pair
		// parmPairs[1] is second key/value pair (etc)
		String parmPairs[] = requestArray[1].split("\\&");

		// Loop over the passed in parameter key/value pairs
		for (String parmPairString: parmPairs)
		{
			// split the KEY/VALUE pair into KEY and VALUE
			// parmPair[0] is the key
			// parmPair[1] is the value
			String parmPair[] = parmPairString.split("\\=");
			
			if (parmPair.length != 2) {
				return null;
			}
			
			String key   = parmPair[0];
			String value = parmPair[1];

			if ((key == null) || (key.length() <= 0))
				return null;
			
			if ((key.matches(BmRequest.ROOM_ID_URI)) || (key.matches(BmRequest.DOOR_ID_URI)))
			{
				if ((value != null) && (value.length() > 0))
					return value;
			} 
		}
		return null;
	}

	private static boolean isStandalone() {
		boolean standalone = false;
		
	    try {
	    	standalone = new File(".").getCanonicalPath().contains("mule-standalone");
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }

	    return standalone;
	}
}
