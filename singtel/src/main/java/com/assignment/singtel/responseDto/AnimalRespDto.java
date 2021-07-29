package com.assignment.singtel.responseDto;

import com.assignment.singtel.requestDto.Animal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalRespDto {
	private String animalType;
	private Animal criteria;
}
