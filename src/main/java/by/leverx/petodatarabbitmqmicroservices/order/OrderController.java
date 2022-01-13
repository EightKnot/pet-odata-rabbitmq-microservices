package by.leverx.petodatarabbitmqmicroservices.order;

import by.leverx.petodatarabbitmqmicroservices.rabbitmqProducer.RabbitMQSender;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order-service/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping(path = "/order")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping(path = "/")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping(path = "/{id}")
    public Order getById(@PathVariable(name = "id") Long id) {
        return orderService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable(name = "id") Long id) {
        orderService.deleteById(id);
    }
}
