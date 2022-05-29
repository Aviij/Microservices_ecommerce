package com.orderservice.OrderService.Service;

import com.orderservice.OrderService.dtos.OrderDTO;
import com.orderservice.OrderService.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class OrderService {



    /*@Autowired
    private OrderRepository repository;*/

    public List<OrderDTO> getOrdersByUserId(String id ) {


        return Arrays.asList(

                new OrderDTO("1","001","1"),
                new OrderDTO("2","002","2")

        );

       /* List<OrderDTO> orders =null;
try {


             orders = repository.findOrdersByUserId(id)
            .stream()
            .map(order -> new OrderDTO(
                    order.getId(),
                    order.getOrderId(),
                    order.getUserId()
            )).collect(Collectors.toList());

}catch (Exception e ){

}
        return orders;*/
    }
}
