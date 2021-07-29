package com.assignment.singtel.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Animal sounds constant
 * 
 * @author Veisheng
 *
 */
@AllArgsConstructor
@Getter
public enum AnimalSounds {
	DUCK("Quack , quack"), 
	CHICKEN("Cluck, cluck"),
	ROOSTER("Cock-a-doodle-doo"),
	DOG("Woof, woof"),
	CAT("Me ow"),
	DEFAULT("");
	
	private String sound;
}
