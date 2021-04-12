
/**
 * This is our implementation for the interface ReportingStructureService.
 * We will implement REST endpoint named read() that should accept an employeeId and 
 * return the fully filled out ReportingStructure for the specified employeeId.
 *
 */

package com.mindex.challenge.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;


@Service
public class ReportingStructureServiceImpl implements ReportingStructureService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureServiceImpl.class);

    @Autowired
    private EmployeeRepository empRepo;
    
    @Override
    public ReportingStructure read(String id)
    {
    	LOG.debug("Creating reporting structure with id [{}]", id);
    	
    	ReportingStructure repoStructure = new ReportingStructure();

        Employee emp = empRepo.findByEmployeeId(id);

        if (emp == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }
        
        int total_reports = getTotalReports(id);
        
        repoStructure.setEmployee(emp);
        repoStructure.setNumberOfReports(total_reports);
        
        return repoStructure;
    }
    
    
    public int getTotalReports(String id)
    {
    	int count = 0;
    	
    	Employee emp = empRepo.findByEmployeeId(id);
    	
        if(emp.getDirectReports() != null)
        {
        	count = emp.getDirectReports().size();
        	
        	for(int i = 0; i < emp.getDirectReports().size(); i++)
        	{
        		count += getTotalReports(emp.getDirectReports().get(i).getEmployeeId());
        	}
        }
        return count;
    }
    
    

}
