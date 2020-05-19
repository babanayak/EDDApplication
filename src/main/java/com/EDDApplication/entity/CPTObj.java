package com.EDDApplication.entity;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/*EDD_CPT table item is mapped to this object*/ 

@DynamoDBTable(tableName = "EDD_CPT")
public class CPTObj {
	private String SHIPPING_SERVICE_ID;
	private List<CPTTimeObj> PROCESSING_DAY_CUTOFF_LIST;
	private List<String> DELIVERY_DAYS;

	public CPTObj() {
	}

	@DynamoDBHashKey(attributeName = "SHIPPING_SERVICE_ID")
	public String getSHIPPING_SERVICE_ID() {
		return SHIPPING_SERVICE_ID;
	}

	public void setSHIPPING_SERVICE_ID(String SHIPPING_SERVICE_ID) {
		this.SHIPPING_SERVICE_ID = SHIPPING_SERVICE_ID;
	}

	@DynamoDBAttribute(attributeName = "PROCESSING_DAY_CUTOFF_LIST")
	public List<CPTTimeObj> getPROCESSING_DAY_CUTOFF_LIST() {
		return PROCESSING_DAY_CUTOFF_LIST;
	}

	public void setPROCESSING_DAY_CUTOFF_LIST(List<CPTTimeObj> PROCESSING_DAY_CUTOFF_LIST) {
		this.PROCESSING_DAY_CUTOFF_LIST = PROCESSING_DAY_CUTOFF_LIST;
	}

	@DynamoDBAttribute(attributeName = "DELIVERY_DAYS")
	public List<String> getDELIVERY_DAYS() {
		return DELIVERY_DAYS;
	}

	public void setDELIVERY_DAYS(List<String> DELIVERY_DAYS) {
		this.DELIVERY_DAYS = DELIVERY_DAYS;
	}

}
