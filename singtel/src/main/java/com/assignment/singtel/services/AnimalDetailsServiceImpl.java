package com.assignment.singtel.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.singtel.constant.AnimalType;
import com.assignment.singtel.responseDto.AnimalRespDto;

@Service
public class AnimalDetailsServiceImpl implements AnimalDetailsService {

	@Override
	public List<AnimalRespDto> getAnimalDetails(String type) {
		List<AnimalRespDto> responseList = new ArrayList<>();
		
		for(AnimalType animalType: AnimalType.values()) {
			AnimalRespDto resp = new AnimalRespDto();
			if(type.equalsIgnoreCase(animalType.getType()) || type.equalsIgnoreCase("ALL")) {
				resp.setAnimalType(animalType.getType());
				resp.setCriteria(animalType.getCriteria());
				responseList.add(resp);
			}
		}
		return responseList;
	}

}
