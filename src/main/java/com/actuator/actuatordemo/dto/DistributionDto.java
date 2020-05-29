package com.actuator.actuatordemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DistributionDto {
	
	private int ranking;
	private String name;
	private int accessPerDay;

}
