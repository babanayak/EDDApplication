package com.EDDApplication.entity;

import java.util.List;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/*EDD_HOLIDAYS table item is mapped to this object*/

@DynamoDBTable(tableName = "EDD_HOLIDAYS")
public class Holiday {
	private String SHIPPING_SERVICE_ID;
	private List<HolidayList> HOLIDAY_DATES_LIST;

	public Holiday() {
	}

	@DynamoDBHashKey(attributeName = "SHIPPING_SERVICE_ID")
	public String getSHIPPING_SERVICE_ID() {
		return SHIPPING_SERVICE_ID;
	}

	public void setSHIPPING_SERVICE_ID(String SHIPPING_SERVICE_ID) {
		this.SHIPPING_SERVICE_ID = SHIPPING_SERVICE_ID;
	}

	@DynamoDBAttribute(attributeName = "HOLIDAY_DATES_LIST")
	public List<HolidayList> getHOLIDAY_DATES_LIST() {
		return HOLIDAY_DATES_LIST;
	}

	public void setHOLIDAY_DATES_LIST(List<HolidayList> HOLIDAY_DATES_LIST) {
		this.HOLIDAY_DATES_LIST = HOLIDAY_DATES_LIST;
	}

}
