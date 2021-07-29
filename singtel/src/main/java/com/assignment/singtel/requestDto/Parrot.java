package com.assignment.singtel.requestDto;

import com.assignment.singtel.constant.AnimalSounds;

/**
 * Parrot class
 * 
 * @author Veisheng
 *
 */
public class Parrot extends Bird {

	public String livingWith(String animalType) {
		String animalSound = null;

		switch (animalType.toLowerCase()) {
		case "dog":
			animalSound = AnimalSounds.DOG.getSound();
			break;
		case "cat":
			animalSound = AnimalSounds.CAT.getSound();
			break;
		case "rooster":
			animalSound = AnimalSounds.ROOSTER.getSound();
			break;
		case "duck":
			animalSound = AnimalSounds.DUCK.getSound();
			break;
		default:
			animalSound = AnimalSounds.DEFAULT.getSound();
			break;
		}
		System.out.println(animalSound);
		return animalSound;
	}
}
