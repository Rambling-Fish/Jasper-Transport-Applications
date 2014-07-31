package org.jasper.dta.contactinfo;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/ContactInfoUpdateReq")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class ContactInfoUpdateReqImpl implements ContactInfoUpdateReq {

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workTelephone")
	private String workTelephone;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeEmail")
	private String homeEmail;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameMiddle")
	private String nameMiddle;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeCellphone")
	private String homeCellphone;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workEmail")
	private String workEmail;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeTelephone")
	private String homeTelephone;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workCellphone")
	private String workCellphone;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameLast")
	private String nameLast;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/contactName")
	private String contactName;

	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameFirst")
	private String nameFirst;

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workTelephone")
	public String getWorkTelephone() {
		return workTelephone;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeEmail")
	public String getHomeEmail() {
		return homeEmail;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameMiddle")
	public String getNameMiddle() {
		return nameMiddle;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeCellphone")
	public String getHomeCellphone() {
		return homeCellphone;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workEmail")
	public String getWorkEmail() {
		return workEmail;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeTelephone")
	public String getHomeTelephone() {
		return homeTelephone;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workCellphone")
	public String getWorkCellphone() {
		return workCellphone;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameLast")
	public String getNameLast() {
		return nameLast;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/contactName")
	public String getContactName() {
		return contactName;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameFirst")
	public String getNameFirst() {
		return nameFirst;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workTelephone")
	public void setWorkTelephone(String workTelephone) {
		this.workTelephone = workTelephone;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeEmail")
	public void setHomeEmail(String homeEmail) {
		this.homeEmail = homeEmail;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameMiddle")
	public void setNameMiddle(String nameMiddle) {
		this.nameMiddle = nameMiddle;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeCellphone")
	public void setHomeCellphone(String homeCellphone) {
		this.homeCellphone = homeCellphone;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workEmail")
	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeTelephone")
	public void setHomeTelephone(String homeTelephone) {
		this.homeTelephone = homeTelephone;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workCellphone")
	public void setWorkCellphone(String workCellphone) {
		this.workCellphone = workCellphone;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameLast")
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/contactName")
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Override
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameFirst")
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	@Override
	@Generated("true")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((workTelephone == null) ? 0 : workTelephone.hashCode());
		result = prime * result
				+ ((homeEmail == null) ? 0 : homeEmail.hashCode());
		result = prime * result
				+ ((nameMiddle == null) ? 0 : nameMiddle.hashCode());
		result = prime * result
				+ ((homeCellphone == null) ? 0 : homeCellphone.hashCode());
		result = prime * result
				+ ((workEmail == null) ? 0 : workEmail.hashCode());
		result = prime * result
				+ ((homeTelephone == null) ? 0 : homeTelephone.hashCode());
		result = prime * result
				+ ((workCellphone == null) ? 0 : workCellphone.hashCode());
		result = prime * result
				+ ((nameLast == null) ? 0 : nameLast.hashCode());
		result = prime * result
				+ ((contactName == null) ? 0 : contactName.hashCode());
		result = prime * result
				+ ((nameFirst == null) ? 0 : nameFirst.hashCode());
		return result;
	}

	@Override
	@Generated("true")
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactInfoUpdateReqImpl other = (ContactInfoUpdateReqImpl) obj;
		if (workTelephone == null) {
			if (other.workTelephone != null)
				return false;
		} else if (!workTelephone.equals(other.workTelephone))
			return false;
		if (homeEmail == null) {
			if (other.homeEmail != null)
				return false;
		} else if (!homeEmail.equals(other.homeEmail))
			return false;
		if (nameMiddle == null) {
			if (other.nameMiddle != null)
				return false;
		} else if (!nameMiddle.equals(other.nameMiddle))
			return false;
		if (homeCellphone == null) {
			if (other.homeCellphone != null)
				return false;
		} else if (!homeCellphone.equals(other.homeCellphone))
			return false;
		if (workEmail == null) {
			if (other.workEmail != null)
				return false;
		} else if (!workEmail.equals(other.workEmail))
			return false;
		if (homeTelephone == null) {
			if (other.homeTelephone != null)
				return false;
		} else if (!homeTelephone.equals(other.homeTelephone))
			return false;
		if (workCellphone == null) {
			if (other.workCellphone != null)
				return false;
		} else if (!workCellphone.equals(other.workCellphone))
			return false;
		if (nameLast == null) {
			if (other.nameLast != null)
				return false;
		} else if (!nameLast.equals(other.nameLast))
			return false;
		if (contactName == null) {
			if (other.contactName != null)
				return false;
		} else if (!contactName.equals(other.contactName))
			return false;
		if (nameFirst == null) {
			if (other.nameFirst != null)
				return false;
		} else if (!nameFirst.equals(other.nameFirst))
			return false;
		return true;
	}

	@Override
	@Generated("true")
	public String toString() {
		return "ContactInfoUpdateReqImpl [ " + "workTelephone=" + workTelephone
				+ ", " + "homeEmail=" + homeEmail + ", " + "nameMiddle="
				+ nameMiddle + ", " + "homeCellphone=" + homeCellphone + ", "
				+ "workEmail=" + workEmail + ", " + "homeTelephone="
				+ homeTelephone + ", " + "workCellphone=" + workCellphone
				+ ", " + "nameLast=" + nameLast + ", " + "contactName="
				+ contactName + ", " + "nameFirst=" + nameFirst + " ]";
	}
}
