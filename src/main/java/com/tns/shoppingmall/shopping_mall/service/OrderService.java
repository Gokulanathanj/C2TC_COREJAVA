package com.tns.shoppingmall.shopping_mall.service;
import com.tns.shoppingmall.shopping_mall.Order;
import com.tns.shoppingmall.shopping_mall.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
public class OrderService {

	 private OrderRepository orderRepository;

	    // Ensure this method exists
	   

	    public Optional<Order> getOrderById(Long id) {
	        return orderRepository.findById(id);
	    }

	    public Order createOrder(Order order) {
	        return orderRepository.save(order);
	    }

	    public void deleteOrder(Long id) {
	        orderRepository.deleteById(id);
	    }

		public List<Order> getAllOrders() {
			return orderRepository.findAll();
		}
}