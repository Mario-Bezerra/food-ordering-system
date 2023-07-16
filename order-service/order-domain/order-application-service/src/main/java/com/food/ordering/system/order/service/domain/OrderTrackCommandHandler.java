package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderResponse;
import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.exception.OrderNotFoundException;
import com.food.ordering.system.order.service.domain.mapper.OrderDataMapper;
import com.food.ordering.system.order.service.domain.ports.output.repository.OrderRepository;
import com.food.ordering.system.order.service.domain.valueObjects.TrackingId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class OrderTrackCommandHandler {

    private final OrderDataMapper orderDataMapper;
    private final OrderRepository orderRepository;

    public OrderTrackCommandHandler(OrderDataMapper orderDataMapper,
                                    OrderRepository orderRepository) {
        this.orderDataMapper = orderDataMapper;
        this.orderRepository = orderRepository;
    }

    public TrackOrderResponse trackOrder(TrackOrderQuery trackOrderQuery){
        Optional<Order> orderOptional = orderRepository.findByTrackingId(
                new TrackingId(trackOrderQuery.getOrderTranckingId()));
        if (orderOptional.isEmpty()){
            log.warn("Could not find order with tracking id : {}", trackOrderQuery.getOrderTranckingId());
            throw new OrderNotFoundException("Could not find order with tracking id : "
                    + trackOrderQuery.getOrderTranckingId());
        }
        return orderDataMapper.orderToTrackOrderResponse(orderOptional.get());
    }
}
