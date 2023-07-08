package com.food.ordering.system.order.service.domain.dto.create;

import com.food.ordering.system.domain.valueObject.OrderStatus;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Builder
@AllArgsConstructor
@Getter
public class CreateOrderResponse {

    @NotNull
    private final UUID orderTranckingId;
    @NotNull
    private final OrderStatus orderStatus;
    @NotNull
    private final String message;
}
