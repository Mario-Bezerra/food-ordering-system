package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Builder
@AllArgsConstructor
@Getter
public class OrderAddress {

    @NotNull
    @Max(value = 50)
    private final String street;
    @NotNull
    private final String postalCode;
    @NotNull
    @Max(value = 50)
    private final String city;
    @NotNull
    @Max(value = 6)
    private final String number;
}
