package by.leverx.petodatarabbitmqmicroservices.order;

import by.leverx.petodatarabbitmqmicroservices.rabbitmqProducer.RabbitMQSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final RabbitMQSender rabbitMQSender;


    public Order createOrder(Order order) {
        Order orderCurrent = orderRepository.save(order);
        // sending message to RabbitMQ
        rabbitMQSender.send(orderCurrent);
        return orderCurrent;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getById(Long id) {
        return orderRepository.getById(id);
    }

    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }
}
