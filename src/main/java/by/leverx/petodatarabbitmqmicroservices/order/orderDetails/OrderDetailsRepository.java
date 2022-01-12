package by.leverx.petodatarabbitmqmicroservices.order.orderDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}
