package com.mindex.challenge.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;

@RestController
public class CompensationController {

	 private static final Logger LOG = LoggerFactory.getLogger(CompensationController.class);

	    @Autowired
	    private CompensationService compensationService;
	    
	    @PostMapping("/compensation")
	    public Compensation createCompensation(@RequestBody Compensation compensation)
	    {
	    	 LOG.debug("Received compensation create request for [{}]", compensation.getEmployee());

	         return compensationService.createCompensation(compensation);
	    }
	    
	    @GetMapping("/compensation/employee/{id}")
	    public Compensation readCompensation(@PathVariable String id)
	    {
	    	LOG.debug("Received compensation create request for id [{}]", id);

	        return compensationService.readCompensation(id);
	    }
	    
	    @GetMapping("/compensation")
	    public List<Compensation> readCompensation()
	    {
	    	LOG.debug("Received compensation create request");

	        return compensationService.readCompensation();
	    }
}
