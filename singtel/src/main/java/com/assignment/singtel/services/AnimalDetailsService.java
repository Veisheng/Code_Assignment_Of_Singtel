package com.assignment.singtel.services;

import java.util.List;

import com.assignment.singtel.responseDto.AnimalRespDto;

public interface AnimalDetailsService {
	public List<AnimalRespDto> getAnimalDetails(String type);
}
