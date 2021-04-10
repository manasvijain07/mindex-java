
/**
 * This is our implementation for the interface CompensationService.
 * We have implemented two new Compensation REST endpoints. 
 * One to create and one to read by employeeId.
 */

package com.mindex.challenge.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.dao.EmployeeRepository;

@Service
public class CompensationServiceImpl {
	
	private static final Logger LOG = LoggerFactory.getLogger(CompensationServiceImpl.class);

    @Autowired
    private CompensationRepository compensationRepo;
    
    
    
    

}
