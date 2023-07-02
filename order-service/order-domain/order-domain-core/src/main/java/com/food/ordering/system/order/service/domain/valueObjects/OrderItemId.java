package com.food.ordering.system.order.service.domain.valueObjects;

import com.food.ordering.system.domain.valueObject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
