package com.assignment.singtel.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Criteria of fish constant
 * 
 * @author Veisheng
 *
 */
@AllArgsConstructor
@Getter
public enum FishCriteria {
	LARGE("large"),
	SMALL("small"),
	MEDIUM("medium"),
	GREY("grey"),
	ORANGE("orange"),
	SHARK_HOBBIES("Sharks eat other fish"),
	CLOWNFISH_HOBBIES("Clownfish make jokes"),
	DOLPHIN_HOBBIES("Dolphin is a good swimmers");

	private final String fishCriteria;
}
