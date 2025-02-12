package com.tns.shoppingmall.shopping_mall.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tns.shoppingmall.shopping_mall.Order;
public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findAll();
}