package com.assignment.singtel.requestDto;

import com.assignment.singtel.constant.AnimalAction;
import com.assignment.singtel.constant.AnimalSounds;

/**
 * Duck class
 * 
 * @author Veisheng
 *
 */
public class Duck extends Bird {
	
	@Override
	public boolean isSwim() {
		System.out.println(AnimalAction.I_AM_SWIMMING.getActions());
		return true;
	}

	@Override
	public boolean isSing() {
		System.out.println(AnimalSounds.DUCK.getSound());
		return true;	
	} 
}
