package com.food.ordering.system.payment.service.domain.ports.input.message.listener;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.domain.dto.PaymentRequest;
import com.food.ordering.system.payment.service.domain.event.PaymentFailedEvent;

public interface PaymentRequestMessageListener {

    void completePayment(PaymentRequest paymentRequest);
    void cancelPayment(PaymentRequest paymentRequest, DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);
}
