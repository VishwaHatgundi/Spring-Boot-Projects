/**
 * 
 */
package org.hatgundi.springboot.userportal.utils;

import org.hatgundi.springboot.userportal.dto.EmployeeDTO;
import org.hatgundi.springboot.userportal.entity.EmployeeEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Vishwanath Hatgundi
 *
 */
public class ValueMapper {

	public static EmployeeEntity convertToEntity(EmployeeDTO employeeDTO) {
		EmployeeEntity empEntity = new EmployeeEntity();
		empEntity.setFirstName(employeeDTO.getFirstName());
		empEntity.setMiddleName(employeeDTO.getMiddleName());
		empEntity.setLastName(employeeDTO.getLastName());
		empEntity.setEmployeeId(employeeDTO.getEmployeeId());
		empEntity.setEmail(employeeDTO.getEmail());
		return empEntity;
	}

	public static EmployeeDTO convertToDTO(EmployeeEntity entity) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setFirstName(entity.getFirstName());
		employeeDTO.setMiddleName(entity.getMiddleName());
		employeeDTO.setLastName(entity.getLastName());
		employeeDTO.setEmployeeId(entity.getEmployeeId());
		employeeDTO.setEmail(entity.getEmail());
		return employeeDTO;
	}

	public static String jsonAsString(Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
