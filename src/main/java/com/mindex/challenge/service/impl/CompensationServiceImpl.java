
/**
 * This is our implementation for the interface CompensationService.
 * We have implemented two new Compensation REST endpoints. 
 * One to create and one to read by employeeId.
 */

package com.mindex.challenge.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;

@Service
public class CompensationServiceImpl implements CompensationService{
	
	private static final Logger LOG = LoggerFactory.getLogger(CompensationServiceImpl.class);

    @Autowired
    private CompensationRepository compensationRepo;
    
    @Autowired
    private EmployeeRepository empRepo;

	@Override
	public Compensation createCompensation(Compensation compensation) {
		String emp_id = compensation.getEmployee().getEmployeeId();
		if(empRepo.findByEmployeeId(emp_id) != null)
		{
			LOG.debug("Creating compensation for [{}]", compensation.getEmployee());
			compensationRepo.insert(compensation);
		}
		else
		{
			LOG.debug("No such employee found. Please check employee details");
			throw new RuntimeException("No employees found ");
		}
		return compensation;
	}

	@Override
	public Compensation readCompensation(String id) {
		Compensation comp = compensationRepo.findByEmployee_EmployeeId(id);
		if(comp == null)
		{
			LOG.debug("No compensation found for id - [{}]", id);
		}
		return comp;	
	}
	

	@Override
	public List<Compensation> readCompensation() {
		List<Compensation> comp = compensationRepo.findAll();
		
		if(comp == null)
		{
			 throw new RuntimeException("No employees found ");
		}
		return comp;
	}

}
