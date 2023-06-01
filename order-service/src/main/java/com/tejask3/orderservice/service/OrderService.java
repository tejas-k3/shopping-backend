package com.tejask3.orderservice.service;

import com.tejask3.orderservice.dto.OrderItemsDto;
import com.tejask3.orderservice.dto.OrderRequest;
import com.tejask3.orderservice.model.Order;
import com.tejask3.orderservice.model.OrderItems;
import com.tejask3.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;


    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderItems> orderItems = orderRequest.getOrderItemsDtoList()
                .stream()
                .map(this::mapToDto)
                .toList();
        order.setOrderItemsList(orderItems);
        orderRepository.save(order);
    }

    private OrderItems mapToDto(OrderItemsDto orderItemsDto) {
        OrderItems orderItems = new OrderItems();
        orderItems.setPrice(orderItemsDto.getPrice());
        orderItems.setQuantity(orderItemsDto.getQuantity());
        orderItems.setSkuCode(orderItemsDto.getSkuCode());
        return orderItems;
    }
}
