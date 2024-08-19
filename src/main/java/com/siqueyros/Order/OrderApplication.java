package com.siqueyros.Order;

import com.siqueyros.Order.entities.Order;
import com.siqueyros.Order.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {


	@Autowired
	private OrderServices orderServices;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		System.out.println("----------------------------------------------");
		Order order = new Order(20,90.00,20.00);
		double totalValue = orderServices.total(order);
		System.out.println("O código do pedido é R$ " +order.getCode());
		System.out.println("Valor Total R$ " + totalValue);
	}


}
