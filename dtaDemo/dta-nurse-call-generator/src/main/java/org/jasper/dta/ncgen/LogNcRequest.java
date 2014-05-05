package org.jasper.dta.ncgen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class LogNcRequest 
{
	private static Logger log = Logger.getLogger(LogNcRequest.class.getName());
	
	private static FileWriter fw = null;
	private static final SimpleDateFormat dt = new SimpleDateFormat("yyyyMMddHHmmss");
	private static String logFile;

	static {
		if (isStandalone())
		{
			// for deployed standalone DTA (ie, via dtaManagement.sh), log to directory <install-dir>/jasper-2.1.0/logs
			logFile = "../../../logs/dtaTS-ncg-" + dt.format(new Date()) + ".log";
			log.info("running standalone, logging to " + logFile);
		}
		else
		{
			// for ecclipse launched DTA
			String toLogFile = System.getProperty("logFile");

			if ((toLogFile == null) || (toLogFile.length() <= 0))
			{
				// no log file specified in run arguments, so log to current project directory
				logFile = "./dtaTS-ncg-" + dt.format(new Date()) + ".log";
			}
			else
			{
				// log to file specified in run arguments (eg: -DlogFile=/Users/username/logs/ncg-logs.log) 
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
		// http://0.0.0.0:8082/rnc/callNurse?
		// http://coralcea.ca/jasper/NurseCall/location=bed010     <--- looking for location value
			
		String requestId = getNcRequestIdentifier(httpString);
		
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
	
	private String getNcRequestIdentifier(String requestString)
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
			
			if (key.matches(NcRequest.LOCATION_URI))
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
