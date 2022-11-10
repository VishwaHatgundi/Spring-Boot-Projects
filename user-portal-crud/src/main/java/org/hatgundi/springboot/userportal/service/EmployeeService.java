/**
 * 
 */
package org.hatgundi.springboot.userportal.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.hatgundi.springboot.userportal.dto.EmployeeDTO;
import org.hatgundi.springboot.userportal.entity.EmployeeEntity;
import org.hatgundi.springboot.userportal.repository.EmployeeRepository;
import org.hatgundi.springboot.userportal.utils.ValueMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Vishwanath Hatgundi
 *
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	public EmployeeDTO getEmployeeByEmpId(String empId) {
		return ValueMapper.convertToDTO(empRepository.findByEmployeeId(empId));
	}

	public EmployeeDTO getEmpById(Long id) throws Exception {
		EmployeeEntity entity = empRepository.findById(id)
				.orElseThrow(() -> new Exception("Employee not found : " + id));
		return ValueMapper.convertToDTO(entity);
	}

	public List<EmployeeDTO> getAllEmployees() {
		List<EmployeeDTO> employeeDTOS = null;
		List<EmployeeEntity> empList = empRepository.findAll();
		if (!empList.isEmpty()) {
			employeeDTOS = empList.stream().map(ValueMapper::convertToDTO).collect(Collectors.toList());
		} else {
			employeeDTOS = Collections.emptyList();
		}
		return employeeDTOS;
	}

	public EmployeeDTO addEmployee(EmployeeEntity iEntity) {
		return ValueMapper.convertToDTO(empRepository.save(iEntity));
	}

	public EmployeeDTO updateEmployee(String empId, EmployeeDTO iEntity) {
		EmployeeEntity fromDb = empRepository.findByEmployeeId(empId);
		BeanUtils.copyProperties(iEntity, fromDb);
		return ValueMapper.convertToDTO(empRepository.save(fromDb));
	}

}
