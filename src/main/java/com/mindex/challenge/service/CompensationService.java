
/**
 * This serves as an interface for CompensationService.
 * We need to create two new Compensation REST endpoints. 
 * One to create and one to read by employeeId.
 */

package com.mindex.challenge.service;

import java.util.List;

import com.mindex.challenge.data.Compensation;

public interface CompensationService {
	Compensation createCompensation(Compensation compensation);
	Compensation readCompensation(String id);
	List<Compensation> readCompensation();
}
