package com.assignment.singtel.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Type of fish constant
 * 
 * @author Veisheng
 *
 */
@AllArgsConstructor
@Getter
public enum FishType {
	SHARK("Shark"),
	CLOWNFISH("Clownfish"),
	DOLHPIN("Dolhpin");

	private final String fishType;
}
