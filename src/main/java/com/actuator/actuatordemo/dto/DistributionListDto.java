package com.actuator.actuatordemo.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DistributionListDto {

	private String name;
	private List<DistributionDto> items = new ArrayList<>();
}
