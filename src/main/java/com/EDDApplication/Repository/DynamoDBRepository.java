package com.EDDApplication.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.EDDApplication.entity.CPTObj;
import com.EDDApplication.entity.Holiday;
import com.EDDApplication.entity.TransitObj;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
/*Repository class to load the data from database*/
@Repository
public class DynamoDBRepository {
	@Autowired
	private DynamoDBMapper mapper;
    //Loads the holiday list from database and maps it to Holiday object
	public Holiday GetHolidays(String ServiceId) {
		return mapper.load(Holiday.class, ServiceId);
	}
   //Loads the CPT list from database and maps it to CPTObj object
	public CPTObj GetCPTTime(String ServiceId) {
		return mapper.load(CPTObj.class, ServiceId);
	}
  //Loads the TransitTime list from database and maps it to TransitObj object
	public TransitObj GetTransitTime(String ServiceId) {
		return mapper.load(TransitObj.class, ServiceId);
	}

}
