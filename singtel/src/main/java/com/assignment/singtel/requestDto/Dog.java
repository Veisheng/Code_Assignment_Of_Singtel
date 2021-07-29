package com.assignment.singtel.requestDto;

import com.assignment.singtel.constant.AnimalAction;
import com.assignment.singtel.constant.AnimalSounds;

/**
 * Bird class
 * 
 * @author Veisheng
 *
 */
public class Dog extends Animal {

	@Override
	public boolean isWalk() {
		System.out.println(AnimalAction.I_AM_WALKING.getActions());
		return true;
	}

	@Override
	public boolean isSing() {
		System.out.println(AnimalSounds.DOG.getSound());
		return true;
	}

}
