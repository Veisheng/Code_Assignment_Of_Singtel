package com.assignment.singtel.services;

import org.springframework.stereotype.Service;

import com.assignment.singtel.constant.FishCriteria;
import com.assignment.singtel.constant.FishType;
import com.assignment.singtel.responseDto.FishCriteriaRespDto;

/**
 * Fish criteria service implementation class
 * 
 * @author Veisheng
 *
 */
@Service
public class FishCriteriaServiceImpl implements FishCriteriaService {

	@Override
	public FishCriteriaRespDto getFishCriteria(String fishType) throws NullPointerException {
		FishCriteriaRespDto response = new FishCriteriaRespDto();

		if (!fishType.isBlank()) {
			if (fishType.equalsIgnoreCase(FishType.SHARK.getFishType())) {
				response.setSize(FishCriteria.LARGE.getFishCriteria());
				response.setColor(FishCriteria.GREY.getFishCriteria());
				response.setHobbies(FishCriteria.SHARK_HOBBIES.getFishCriteria());
			} else if (fishType.equalsIgnoreCase(FishType.CLOWNFISH.getFishType())) {
				response.setSize(FishCriteria.SMALL.getFishCriteria());
				response.setColor(FishCriteria.ORANGE.getFishCriteria());
				response.setHobbies(FishCriteria.CLOWNFISH_HOBBIES.getFishCriteria());
			} else if (fishType.equalsIgnoreCase(FishType.DOLHPIN.getFishType())) {
				response.setSize(FishCriteria.MEDIUM.getFishCriteria());
				response.setColor(FishCriteria.GREY.getFishCriteria());
				response.setHobbies(FishCriteria.DOLPHIN_HOBBIES.getFishCriteria());
			}
		} else {
			throw new NullPointerException("Fish type is null");
		}

		System.out.println("Size: " + response.getSize());
		System.out.println("Color: " + response.getColor());
		System.out.println("Criteria: " + response.getHobbies());
		return response;
	}
}
