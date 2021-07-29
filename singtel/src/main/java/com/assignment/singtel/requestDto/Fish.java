package com.assignment.singtel.requestDto;

import com.assignment.singtel.constant.AnimalAction;

/**
 * Fish class
 * 
 * @author Veisheng
 *
 */
public class Fish extends Animal {
	@Override
	public boolean isSwim() {
		System.out.println(AnimalAction.I_AM_SWIMMING.getActions());
		return true;
	}

	@Override
	public boolean isWalk() {
		System.out.println(AnimalAction.I_AM_NOT_WALKING.getActions());
		return false;
	}

	@Override
	public boolean isSing() {
		System.out.println(AnimalAction.I_AM_NOT_WALKING.getActions());
		return false;
	}

}
