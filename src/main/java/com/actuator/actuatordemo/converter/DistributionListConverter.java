package com.actuator.actuatordemo.converter;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;



import com.actuator.actuatordemo.dto.DistributionDto;
import com.actuator.actuatordemo.dto.DistributionListDto;
import com.actuator.actuatordemo.model.DistributionItem;
import com.actuator.actuatordemo.model.DistributionList;

@Component
public class DistributionListConverter implements Converter<DistributionList, DistributionListDto> {

    private DistributionItemConverter itemConverter;

    @Inject
    public DistributionListConverter(DistributionItemConverter itemConverter) {
        this.itemConverter = itemConverter;
    }

    @Override
    public DistributionListDto convert(DistributionList list) {
        List<DistributionItem> items = list.getItems();

        List<DistributionDto> itemDtos = items.stream()
                .map(itemConverter::convert)
                .collect(Collectors.toList());

        return new DistributionListDto(list.getName(), itemDtos);
    }
}
