
/**
 * 
 * This serves as an interface for ReportingStructureService.
 * We will declare REST endpoint named read() that should accept an employeeId and 
 * return the fully filled out ReportingStructure for the specified employeeId.
 *
 */

package com.mindex.challenge.service;

import com.mindex.challenge.data.ReportingStructure;


public interface ReportingStructureService {
	ReportingStructure read(String id);
}
