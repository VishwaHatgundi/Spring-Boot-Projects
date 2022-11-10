/**
 * 
 */
package org.hatgundi.springboot.userportal.controller;

import java.util.List;

import org.hatgundi.springboot.userportal.dto.APIResponse;
import org.hatgundi.springboot.userportal.dto.EmployeeDTO;
import org.hatgundi.springboot.userportal.entity.EmployeeEntity;
import org.hatgundi.springboot.userportal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vishwanath Hatgundi
 *
 */
@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {

	public static final String SUCCESS = "Success";

	@Autowired
	private EmployeeService service;

	@PostMapping("/add")
	public ResponseEntity<APIResponse> addEmployee(@RequestBody EmployeeEntity emp) {

		APIResponse<EmployeeDTO> responseDTO = APIResponse.<EmployeeDTO>builder().status(SUCCESS)
				.results(service.addEmployee(emp)).build();
		return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<APIResponse> findAllEmployees() {
		APIResponse<List<EmployeeDTO>> responseDTO = APIResponse.<List<EmployeeDTO>>builder().status(SUCCESS)
				.results(service.getAllEmployees()).build();
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}

	@GetMapping("/employeeById/{id}")
	public ResponseEntity<APIResponse> findEmployeeById(@PathVariable Long id) throws Exception {
		APIResponse<EmployeeDTO> responseDTO = APIResponse.<EmployeeDTO>builder().status(SUCCESS)
				.results(service.getEmpById(id)).build();
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}

	@GetMapping("/{empId}")
	public ResponseEntity<APIResponse> findEmployeeByEmpId(@PathVariable String empId) {
		APIResponse<EmployeeDTO> responseDTO = APIResponse.<EmployeeDTO>builder().status(SUCCESS)
				.results(service.getEmployeeByEmpId(empId)).build();
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{empId}")
	public ResponseEntity<APIResponse> updateEmployee(@RequestBody EmployeeDTO emp, @PathVariable String empId) {
		APIResponse<EmployeeDTO> responseDTO = APIResponse.<EmployeeDTO>builder().status(SUCCESS)
				.results(service.updateEmployee(empId, emp)).build();
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}

}
