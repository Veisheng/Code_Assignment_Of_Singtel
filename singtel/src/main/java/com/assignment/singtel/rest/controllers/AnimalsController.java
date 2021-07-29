package com.assignment.singtel.rest.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.singtel.responseDto.AnimalRespDto;
import com.assignment.singtel.services.AnimalDetailsService;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@RestController
@RequestMapping(value = "/animal")
public class AnimalsController {

	@Autowired
	private AnimalDetailsService animalDetailsService;

	@GetMapping("/details")
	public List<AnimalRespDto> getAnimalDetails(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestParam(required = true, name = "type") String type) {
		return animalDetailsService.getAnimalDetails(type);
	}
}
