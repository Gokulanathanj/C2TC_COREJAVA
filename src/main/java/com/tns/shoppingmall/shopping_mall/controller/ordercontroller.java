package com.tns.shoppingmall.shopping_mall.controller;
import com.tns.shoppingmall.shopping_mall.Order;
import com.tns.shoppingmall.shopping_mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
public class ordercontroller {
	 @Autowired
	    private OrderService OrderService;

	    @GetMapping
	    public List<Order> getAllOrders() {
	        return OrderService.getAllOrders();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
	        Optional<Order> order = OrderService.getOrderById(id);
	        return order.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

	    @PostMapping
	    public Order createOrder(@RequestBody Order order) {
	        return OrderService.createOrder(order);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
	        OrderService.deleteOrder(id);
	        return ResponseEntity.noContent().build();
	    }
}
