/**
 * 
 */
package org.hatgundi.springboot.userportal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vishwanath Hatgundi
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class APIResponse<T> {

	private String status;
	private String message;;
	private T results;

}
