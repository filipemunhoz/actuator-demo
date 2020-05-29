package com.actuator.actuatordemo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.actuator.actuatordemo.dto.DistributionDto;
import com.actuator.actuatordemo.model.DistributionItem;

@Component
public class DistributionItemConverter implements Converter<DistributionItem, DistributionDto> {

    @Override
    public DistributionDto convert(DistributionItem item) {
        return new DistributionDto(item.getRanking(), item.getName(), item.getAccessPerDay());
    }
}

