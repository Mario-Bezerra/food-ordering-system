package com.food.ordering.system.payment.service.domain.valueObjects;

import com.food.ordering.system.domain.valueObject.BaseId;

import java.util.UUID;

public class CreditEntryId extends BaseId<UUID> {

    public CreditEntryId(UUID value) {
        super(value);
    }
}
