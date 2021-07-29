package com.assignment.singtel.requestDto;

import org.springframework.beans.factory.annotation.Autowired;

import com.assignment.singtel.constant.AnimalAction;
import com.assignment.singtel.constant.FishType;
import com.assignment.singtel.responseDto.FishCriteriaRespDto;
import com.assignment.singtel.services.FishCriteriaService;

/**
 * Dolphin class
 * 
 * @author Veisheng
 *
 */
public class Dolhpin extends Fish {
	@Autowired
	private FishCriteriaService fishCriteriaService;

	@Override
	public boolean isSwim() {
		System.out.println(AnimalAction.I_AM_SWIMMING.getActions());
		return true;
	}

	public FishCriteriaRespDto retrieveFishCriteria() {
		return fishCriteriaService.getFishCriteria(FishType.DOLHPIN.getFishType());
	}
}
