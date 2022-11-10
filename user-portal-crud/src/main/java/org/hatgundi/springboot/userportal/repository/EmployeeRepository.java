/**
 * 
 */
package org.hatgundi.springboot.userportal.repository;

import org.hatgundi.springboot.userportal.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vishwanath Hatgundi
 *
 */
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	EmployeeEntity findByEmployeeId(String employeeId);

	EmployeeEntity findByEmail(String email);
}
