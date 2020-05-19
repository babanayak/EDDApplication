package com.EDDApplication.entity;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class CPTTimeObj implements Serializable {
	private static final long serialVersionUID = 1L;
	private String CUTOFF_TIME;
	private String PROCESSING_DAY;

	public CPTTimeObj() {
	}

	@DynamoDBAttribute(attributeName = "CUTOFF_TIME")
	public String getCUTOFF_TIME() {
		return CUTOFF_TIME;
	}

	public void setCUTOFF_TIME(String CUTOFF_TIME) {
		this.CUTOFF_TIME = CUTOFF_TIME;
	}

	@DynamoDBAttribute(attributeName = "PROCESSING_DAY")
	public String getPROCESSING_DAY() {
		return PROCESSING_DAY;
	}

	public void setPROCESSING_DAY(String PROCESSING_DAY) {
		this.PROCESSING_DAY = PROCESSING_DAY;
	}

}
