package com.orderservice.OrderService.Controller;

import com.orderservice.OrderService.dtos.OrderDTO;
import com.orderservice.OrderService.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")//class level
public class OrderController {

    @Autowired
    private OrderService orderService;

   @GetMapping("/getOrdersByUserId/{id}")//method level annotation for
    public List<OrderDTO> getOrdersByUserId(@PathVariable final String id){
        return  orderService.getOrdersByUserId(id );
    }




}
