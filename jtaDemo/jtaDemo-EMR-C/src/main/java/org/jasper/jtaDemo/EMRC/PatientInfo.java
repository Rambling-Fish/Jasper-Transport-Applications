package org.jasper.jtaDemo.EMRC;

import org.codehaus.jackson.annotate.JsonProperty;

public class PatientInfo{

	public static final String PID_URI = "http://coralcea.ca/jasper/patientID";
	private static final String WARD_URI = "http://coralcea.ca/jasper/ward";
	private static final String BED_URI = "http://coralcea.ca/jasper/bed";
	private static final String HR_SID_URI = "http://coralcea.ca/jasper/hrSID";
	private static final String BP_SID_URI = "http://coralcea.ca/jasper/bpSID";
	
	@JsonProperty(value=PID_URI)
	private String pid;
	
	@JsonProperty(value=WARD_URI)
	private String ward;
	
	@JsonProperty(value=BED_URI)
	private String bed;
	
	@JsonProperty(value=HR_SID_URI)
	private String hrSID;
	
	@JsonProperty(value=BP_SID_URI)
	private String bpSID;

	public PatientInfo(String pid, String ward, String bed, String hrSID,String bpSID) {
		this.pid = pid;
		this.ward = ward;
		this.bed = bed;
		this.hrSID = hrSID;
		this.bpSID = bpSID;
	}
}
