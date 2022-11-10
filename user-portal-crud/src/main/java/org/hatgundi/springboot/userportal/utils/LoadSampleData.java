/**
 * 
 */
package org.hatgundi.springboot.userportal.utils;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.hatgundi.springboot.userportal.entity.EmployeeEntity;
import org.hatgundi.springboot.userportal.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Vishwanath Hatgundi
 *
 */
@Component
public class LoadSampleData {

	@Autowired
	private EmployeeRepository empRepository;

	@PostConstruct
	public void loadData() {
		EmployeeEntity e1 = new EmployeeEntity(1l, "EMP_00011", "Vishwa", "", "", "vishwa@123.gamil.com");
		EmployeeEntity e2 = new EmployeeEntity(2l, "EMP_00012", "Yuvraj", "", "", "vishwa@123.gamil.com");
		EmployeeEntity e3 = new EmployeeEntity(3l, "EMP_00013", "Rakesh", "", "", "vishwa@123.gamil.com");
		empRepository.saveAll(Arrays.asList(e1, e2, e3));
		System.out.println("Inserted");
	}

}
