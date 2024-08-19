package com.siqueyros.Order.services;

import com.siqueyros.Order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServices {


 @Autowired
 private ShippingService shippingService;

    public OrderServices(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total (Order order){
     double discont = order.getBasic() * order.getDiscount() /100;
     double totalValue = order.getBasic() - discont + shippingService.shipment(order);
     return totalValue;
    }
}
