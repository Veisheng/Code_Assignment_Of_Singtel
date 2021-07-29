package com.assignment.singtel.requestDto;

import com.assignment.singtel.constant.AnimalAction;

/**
 * Bird class
 * 
 * @author Veisheng
 *
 */
public class Bird extends Animal {

	@Override
	public boolean isWalk() {
		System.out.println(AnimalAction.I_AM_WALKING.getActions());
		return true;
	}

	@Override
	public boolean isFly() {
		System.out.println(AnimalAction.I_AM_FLYING.getActions());
		return true;
	}

	@Override
	public boolean isSing() {
		System.out.println(AnimalAction.I_AM_SINGING.getActions());
		return true;
	}
}
