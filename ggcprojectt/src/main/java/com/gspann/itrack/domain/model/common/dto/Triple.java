package com.gspann.itrack.domain.model.common.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Triple<T, S, U> {

	private T valueOne;
	
	private S valueTwo;
	
	private U valueThree;
}
