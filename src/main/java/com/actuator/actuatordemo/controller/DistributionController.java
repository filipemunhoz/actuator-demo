package com.actuator.actuatordemo.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actuator.actuatordemo.dto.DistributionListDto;
import com.actuator.actuatordemo.service.DistributionService;

@RestController
@RequestMapping("/distro")
public class DistributionController {

	private DistributionService distributionService;

	@Inject
	public DistributionController(DistributionService distributionService) {
		this.distributionService = distributionService;
	}

	@GetMapping("/list")
	public List<DistributionListDto> getDistributionLists() {
		return distributionService.getDistributionList();
	}
}
