package com.EDDApplication.entity;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class HolidayList implements Serializable {
	private static final long serialVersionUID = 1L;
	private String HOLIDAY_DATE;
	private int DELIVERY_HOLIDAY;
	private int PICKUP_HOLIDAY;
	private int PROCESSING_HOLIDAY;

	public HolidayList() {
	}

	@DynamoDBAttribute(attributeName = "HOLIDAY_DATE")
	public String getHOLIDAY_DATE() {
		return HOLIDAY_DATE;
	}

	public void setHOLIDAY_DATE(String HOLIDAY_DATE) {
		this.HOLIDAY_DATE = HOLIDAY_DATE;
	}

	@DynamoDBAttribute(attributeName = "DELIVERY_HOLIDAY")
	public int getDELIVERY_HOLIDAY() {
		return DELIVERY_HOLIDAY;
	}

	public void setDELIVERY_HOLIDAY(int DELIVERY_HOLIDAY) {
		this.DELIVERY_HOLIDAY = DELIVERY_HOLIDAY;
	}

	@DynamoDBAttribute(attributeName = "PICKUP_HOLIDAY")
	public int getPICKUP_HOLIDAY() {
		return PICKUP_HOLIDAY;
	}

	public void setPICKUP_HOLIDAY(int PICKUP_HOLIDAY) {
		this.PICKUP_HOLIDAY = PICKUP_HOLIDAY;
	}

	@DynamoDBAttribute(attributeName = "PROCESSING_HOLIDAY")
	public int getPROCESSING_HOLIDAY() {
		return PROCESSING_HOLIDAY;
	}

	public void setPROCESSING_HOLIDAY(int PROCESSING_HOLIDAY) {
		this.PROCESSING_HOLIDAY = PROCESSING_HOLIDAY;
	}

}
