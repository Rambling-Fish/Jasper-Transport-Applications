package org.jasper.dtademo.medicalrecord;

import java.util.List;

import javax.annotation.Generated;

import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.jasper.dtademo.medicalrecord.BpData;
import org.jasper.dtademo.medicalrecord.HrData;
import org.jasper.dtademo.medicalrecord.PatientInfo;
import org.jasper.dtademo.medicalrecord.composite.MedicalRecord;
import org.jasper.dtademo.medicalrecord.composite.MedicalRecordImpl;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

@Generated("false")
@JsonTypeName("http://coralcea.ca/jasper/getMedicalRecord")
public class AggregateMedicalRecord implements Callable {

	private static Logger log = Logger.getLogger(AggregateMedicalRecord.class.getName());

	/**
	 * @param muleEventContext
	 * @return MuleMessage
	 */
	@Generated("false")
	public MuleMessage onCall(MuleEventContext muleEventContext) throws Exception {
		
		List<Object> list = (List<Object>) muleEventContext.getMessage().getPayload();

		MedicalRecord mRec = new MedicalRecordImpl();

		for(Object obj:list){
			if(obj instanceof HrData[]){
				mRec.setHrData((HrData[]) obj);
			}else if(obj instanceof BpData[]){
				mRec.setBpData((BpData[]) obj);
			}else if(obj instanceof PatientInfo){
				mRec.setPatientInfo((PatientInfo) obj);
			}else{
				log.error("payload list contains object not part of MedicalRecord : " + obj.getClass().getName());
			}
		}
		
		MuleMessage result = new DefaultMuleMessage(mRec, muleEventContext.getMuleContext());
		
		return result;

	}
}

