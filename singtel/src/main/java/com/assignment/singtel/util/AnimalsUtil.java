package com.assignment.singtel.util;

import com.assignment.singtel.requestDto.Animal;
import com.assignment.singtel.responseDto.AnimalCounterRespDto;

import lombok.experimental.UtilityClass;

/**
 * Animal count util
 * 
 * @author Veisheng
 *
 */
@UtilityClass
public class AnimalsUtil {
	public AnimalCounterRespDto AnimalCount(Animal[] animals) {
		AnimalCounterRespDto result = new AnimalCounterRespDto();

		int flyCount = 0;
		int walkCount = 0;
		int singCount = 0;
		int swimCount = 0;

		for (Animal animal : animals) {
			System.out.println("-----" + animal.getClass().getName() + "-----");
			if (animal.isFly())
				flyCount++;
			if (animal.isWalk())
				walkCount++;
			if (animal.isSing())
				singCount++;
			if (animal.isSwim())
				swimCount++;
		}
		System.out.println("----------------------------------------");
		System.out.println("Fly: " + flyCount);
		System.out.println("Walk: " + walkCount);
		System.out.println("Sing: " + singCount);
		System.out.println("Swim: " + swimCount);
		result.setFlyCount(flyCount);
		result.setWalkCount(walkCount);
		result.setSingCount(singCount);
		result.setSwimCount(swimCount);

		return result;
	}
}
