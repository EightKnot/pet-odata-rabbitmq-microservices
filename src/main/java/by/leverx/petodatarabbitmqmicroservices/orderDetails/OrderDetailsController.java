package by.leverx.petodatarabbitmqmicroservices.orderDetails;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order-service/orders/order/order-details")
@RequiredArgsConstructor
public class OrderDetailsController {

    private final OrderDetailsRepository orderDetailsRepository;

    @GetMapping(path = "/")
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsRepository.findAll();
    }
}
