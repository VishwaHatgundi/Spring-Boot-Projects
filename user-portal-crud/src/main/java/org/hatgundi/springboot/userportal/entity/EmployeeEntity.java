/**
 * 
 */
package org.hatgundi.springboot.userportal.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vishwanath Hatgundi
 *
 */
@Entity
@Table(name = "employee_t")
public class EmployeeEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "employee_id", unique = true, updatable = false, nullable = false)
	private String employeeId;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email", nullable = false)
	private String email;

	public EmployeeEntity() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(Long id, String employeeId, String firstName, String middleName, String lastName,
			String email) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, employeeId, firstName, id, lastName, middleName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEntity other = (EmployeeEntity) obj;
		return Objects.equals(email, other.email) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(middleName, other.middleName);
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", employeeId=" + employeeId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
