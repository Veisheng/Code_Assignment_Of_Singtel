package com.assignment.singtel.requestDto;

import com.assignment.singtel.constant.AnimalAction;

import lombok.Getter;
import lombok.Setter;

/**
 * Butterfly class
 * 
 * @author Veisheng
 *
 */
@Setter
@Getter
public class Butterfly extends Animal {

	boolean isCaterpillar = false;

	@Override
	public boolean isFly() {
		if (isCaterpillar) {
			System.out.println(AnimalAction.I_AM_NOT_FLYING.getActions());
			return false;
		} else {
			System.out.println(AnimalAction.I_AM_FLYING.getActions());
			return true;
		}
	}

	@Override
	public boolean isSing() {
		System.out.println(AnimalAction.I_AM_NOT_SINGING.getActions());
		return false;
	}

	@Override
	public boolean isWalk() {
		if (isCaterpillar) {
			System.out.println(AnimalAction.I_AM_WALKING_CRAWL.getActions());
			return true;
		} else {
			System.out.println(AnimalAction.I_AM_NOT_WALKING.getActions());
			return false;
		}
	}
}
