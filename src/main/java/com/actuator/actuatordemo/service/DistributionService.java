package com.actuator.actuatordemo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.actuator.actuatordemo.converter.DistributionListConverter;
import com.actuator.actuatordemo.dto.DistributionListDto;
import com.actuator.actuatordemo.repository.DistributionRepository;

@Service
public class DistributionService {
	
	private DistributionListConverter distributionListConverter;
	private DistributionRepository repository;
	
	@Inject
	public DistributionService(DistributionListConverter distributionListConverter, DistributionRepository repository){
		this.distributionListConverter = distributionListConverter;
		this.repository = repository;
		
	}
	

    public List<DistributionListDto> getDistributionList() {
       return StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(distributionListConverter::convert)
                .collect(Collectors.toList());
    }

}
