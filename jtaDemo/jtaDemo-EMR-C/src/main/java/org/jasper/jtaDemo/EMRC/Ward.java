package org.jasper.jtaDemo.EMRC;

import java.util.ArrayList;

public class Ward {
	
	private String id;
	private ArrayList<Patient> patient;
	
	public Ward(String id) {
		super();
		this.id = id;
		this.patient = new ArrayList<Patient>();
	}

	public String getId() {
		return id;
	}


	public Patient[] getPatient() {
		return patient.toArray(new Patient[]{});
	}

	public Patient getPatient(String id) {
		for(Patient p:patient){
			if(p.getId().equals(id)) return p;
		}
		return null;
	}
	
	public void addPatientHeartRateData(Patient p) {
		Patient localP = getPatient(p.getId());
		if(localP == null){
			patient.add(p);
		}else{
			localP.addHeartRateData(p.getHeartRateData());
		}
	}
	
}
