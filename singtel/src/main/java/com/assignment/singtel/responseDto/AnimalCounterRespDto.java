package com.assignment.singtel.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalCounterRespDto {
	private int flyCount;
	private int walkCount;
	private int singCount;
	private int swimCount;
}
