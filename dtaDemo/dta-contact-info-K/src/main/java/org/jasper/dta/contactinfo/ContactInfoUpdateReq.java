package org.jasper.dta.contactinfo;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.*;

@Generated("true")
@JsonTypeName("http://coralcea.ca/jasper/ContactInfoUpdateReq")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value=ContactInfoUpdateReqImpl.class, name="http://coralcea.ca/jasper/ContactInfoUpdateReq")
})
public interface ContactInfoUpdateReq {

	/**
	 * @return workTelephone 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workTelephone")
	public String getWorkTelephone();

	/**
	 * @return homeEmail 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeEmail")
	public String getHomeEmail();

	/**
	 * @return nameMiddle 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameMiddle")
	public String getNameMiddle();

	/**
	 * @return homeCellphone 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeCellphone")
	public String getHomeCellphone();

	/**
	 * @return workEmail 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workEmail")
	public String getWorkEmail();

	/**
	 * @return homeTelephone 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeTelephone")
	public String getHomeTelephone();

	/**
	 * @return workCellphone 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workCellphone")
	public String getWorkCellphone();

	/**
	 * @return nameLast 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameLast")
	public String getNameLast();

	/**
	 * @return contactName 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/contactName")
	public String getContactName();

	/**
	 * @return nameFirst 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameFirst")
	public String getNameFirst();

	/**
	 * @param workTelephone 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workTelephone")
	public void setWorkTelephone(String workTelephone);

	/**
	 * @param homeEmail 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeEmail")
	public void setHomeEmail(String homeEmail);

	/**
	 * @param nameMiddle 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameMiddle")
	public void setNameMiddle(String nameMiddle);

	/**
	 * @param homeCellphone 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeCellphone")
	public void setHomeCellphone(String homeCellphone);

	/**
	 * @param workEmail 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workEmail")
	public void setWorkEmail(String workEmail);

	/**
	 * @param homeTelephone 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/homeTelephone")
	public void setHomeTelephone(String homeTelephone);

	/**
	 * @param workCellphone 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/workCellphone")
	public void setWorkCellphone(String workCellphone);

	/**
	 * @param nameLast 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameLast")
	public void setNameLast(String nameLast);

	/**
	 * @param contactName 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/contactName")
	public void setContactName(String contactName);

	/**
	 * @param nameFirst 
	 */
	@Generated("true")
	@JsonProperty("http://coralcea.ca/jasper/info/nameFirst")
	public void setNameFirst(String nameFirst);
}

