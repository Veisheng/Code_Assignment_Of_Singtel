package com.assignment.singtel.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Constant class for animal actions
 * 
 * @author Veisheng
 *
 */
@AllArgsConstructor
@Getter
public enum AnimalAction {
	I_AM_WALKING("I am walking"),
	I_AM_FLYING("I am flying"),
	I_AM_SINGING("I am singing"),
	I_AM_SWIMMING("I am swimming"),
	I_AM_NOT_WALKING("I am not walking"),
	I_AM_NOT_FLYING("I am not flying"),
	I_AM_NOT_SINGING("I am not singing"),
	I_AM_NOT_SWIMMING("I am not swimming"),
	I_AM_WALKING_CRAWL("I am walking (crawl)");

	private final String actions;
}
