package com.orderservice.OrderService.Repository;

import com.orderservice.OrderService.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String> {

   @Query("SELECT  o FROM OrderEntity o WHERE o.userId =?1")

    List<OrderEntity> findOrdersByUserId(String id);


}
