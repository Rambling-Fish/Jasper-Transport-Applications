package org.jasper.dta.smsterminator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class LogSmsRequest 
{
	public static final String PREFIX      = "http://coralcea.ca/jasper/Sms/";
	public static final String LOGID       = "logId";
	public static final String LOGID_URI   = PREFIX + LOGID;

	private static Logger log = Logger.getLogger(LogSmsRequest.class.getName());
	
	private static FileWriter fw = null;
	private static final SimpleDateFormat dt = new SimpleDateFormat("yyyyMMddHHmmss");
	private static String logFile;

	static {
		if (isStandalone())
		{
			// for deployed standalone DTA (ie, via dtaManagement.sh), log to directory <install-dir>/jasper-2.1.0/logs
			logFile = "../../../logs/dtaTS-sms-" + dt.format(new Date()) + ".log";
			log.info("running standalone, logging to " + logFile);
		}
		else
		{
			// for ecclipse launched DTA
			String toLogFile = System.getProperty("logFile");

			if ((toLogFile == null) || (toLogFile.length() <= 0))
			{
				// no log file specified in run arguments, so log to current project directory
				logFile = "./dtaTS-sms-" + dt.format(new Date()) + ".log";
			}
			else
			{
				// log to file specified in run arguments (eg: -DlogFile=/Users/username/logs/sms-logs.log) 
				logFile = toLogFile;
			}
			log.info("running in eclipse IDE, logging to " + logFile);
		}
		
		File file = new File(logFile);
		try {
			fw = new FileWriter(file, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void process(SmsPostReq smsPostReq)
	{
		// {"@type":"http://coralcea.ca/jasper/Sms/SmsPostReq",
		//       "http://coralcea.ca/jasper/Sms/toSms":"you",
		//       "http://coralcea.ca/jasper/Sms/fromSms":"me",
		//       "http://coralcea.ca/jasper/Sms/bodySms":"hello",
		//       "http://coralcea.ca/jasper/Sms/logId":"R000000057"   <--- looking for logId value
		// }
		
		String logId = new String(smsPostReq.getLogId());
		
		if ((logId == null) || (logId.length() == 0)) 
		{
			return;
		}		
				
		long ts = System.nanoTime();

		try {
			fw.write(logId + "." + ts + "\n");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
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
