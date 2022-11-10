/**
 * 
 */
package org.hatgundi.springboot.userportal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Vishwanath Hatgundi
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class EmployeeDTO {
	
	private String employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;

}
