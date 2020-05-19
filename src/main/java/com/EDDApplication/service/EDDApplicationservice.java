package com.EDDApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EDDApplication.Repository.DynamoDBRepository;
import com.EDDApplication.entity.CPTObj;
import com.EDDApplication.entity.Holiday;
import com.EDDApplication.entity.TransitObj;
/*Service class for business logic*/
@Service
public class EDDApplicationservice {
	@Autowired
	private DynamoDBRepository repository;
	//Returns the holidays list by calling the repository by serviceId
	public Holiday get_holidays() {
		return repository.GetHolidays("ROYAL_MAIL_SHIPMETHOD_1");
	}
	//Returns the CPT list by calling the repository by serviceId
    public CPTObj get_CPTlist() {
    	return repository.GetCPTTime("ROYAL_MAIL_SHIPMETHOD_1");
    }
    //Returns the TransitTime list by calling the repository by serviceId
	public TransitObj get_transit_time() {
		return repository.GetTransitTime("ROYAL_MAIL_SHIPMETHOD_1");
	}
	
}
