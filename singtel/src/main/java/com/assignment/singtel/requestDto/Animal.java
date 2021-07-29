package com.assignment.singtel.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Animal class
 * 
 * @author Veisheng
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
	public boolean walk;
	public boolean fly;
	public boolean sing;
	public boolean swim;
}
