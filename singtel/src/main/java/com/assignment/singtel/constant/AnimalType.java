package com.assignment.singtel.constant;

import com.assignment.singtel.requestDto.Animal;
import com.assignment.singtel.requestDto.*;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AnimalType {
	BIRD("Bird", new Bird()),
	DUCK("Duck", new Duck()),
	CHICKEN("Chicken", new Chicken()),
	ROOSTER("Rooster", new Rooster()),
	PARROT("Parrot", new Parrot()),
	FISH("Fish", new Fish()),
	SHARK("Shark", new Shark()),
	CLOWNFISH("Clownfish", new Clownfish()),
	DOLHPIN("Dolhpin", new Dolhpin()),
	FROG("Frog", new Frog()),
	DOG("Dog", new Dog()),
	BUTTERFLY("Butterfly", new Butterfly()),
	CAT("Cat", new Cat());
	
	private final String type;
	private final Animal criteria;
}
