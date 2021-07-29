package com.assignment.singtel.requestDto;

import com.assignment.singtel.constant.AnimalAction;
import com.assignment.singtel.constant.AnimalSounds;

/**
 * Chicken class
 * 
 * @author Veisheng
 *
 */
public class Chicken extends Bird {
	
	@Override
	public boolean isSing() {
		System.out.println(AnimalSounds.CHICKEN.getSound());
		return true;	
	} 
	
	@Override
	public boolean isFly() {
		System.out.println(AnimalAction.I_AM_NOT_FLYING.getActions());
		return false;
	}
}
