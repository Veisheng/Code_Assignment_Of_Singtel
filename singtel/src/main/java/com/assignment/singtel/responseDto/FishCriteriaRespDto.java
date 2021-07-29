package com.assignment.singtel.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Fish criteria response data transfer object
 * 
 * @author Veisheng
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FishCriteriaRespDto {
	private String size;
	private String color;
	private String hobbies;
}
