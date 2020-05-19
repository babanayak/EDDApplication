package com.EDDApplication.entity;

import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/*EDD_TRANSIT table item is mapped to this object*/

@DynamoDBTable(tableName = "EDD_TRANSIT")
public class TransitObj {
	private String SHIPPING_SERVICE_ID;
	private int TRANSIT_TIME;
	private List<Map<String, Map<String, Integer>>> TRANSIT_TIME_OVERRIDE_MAP;

	public TransitObj() {
	}

	@DynamoDBHashKey(attributeName = "SHIPPING_SERVICE_ID")
	public String getSHIPPING_SERVICE_ID() {
		return SHIPPING_SERVICE_ID;
	}

	public void setSHIPPING_SERVICE_ID(String SHIPPING_SERVICE_ID) {
		this.SHIPPING_SERVICE_ID = SHIPPING_SERVICE_ID;
	}

	@DynamoDBAttribute(attributeName = "TRANSIT_TIME")
	public int getTRANSIT_TIME() {
		return TRANSIT_TIME;
	}

	public void setTRANSIT_TIME(int TRANSIT_TIME) {
		this.TRANSIT_TIME = TRANSIT_TIME;
	}

	@DynamoDBAttribute(attributeName = "TRANSIT_TIME_OVERRIDE_MAP")
	public List<Map<String, Map<String, Integer>>> getTRANSIT_TIME_OVERRIDE_MAP() {
		return TRANSIT_TIME_OVERRIDE_MAP;
	}

	public void setTRANSIT_TIME_OVERRIDE_MAP(List<Map<String, Map<String, Integer>>> TRANSIT_TIME_OVERRIDE_MAP) {
		this.TRANSIT_TIME_OVERRIDE_MAP = TRANSIT_TIME_OVERRIDE_MAP;
	}

}
