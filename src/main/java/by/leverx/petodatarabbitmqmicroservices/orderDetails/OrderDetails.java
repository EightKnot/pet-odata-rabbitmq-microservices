package by.leverx.petodatarabbitmqmicroservices.orderDetails;

import by.leverx.petodatarabbitmqmicroservices.order.Order;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(schema = "public")
@Setter
@Getter
@RequiredArgsConstructor
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String deliveryAddress;
    private String comment;
}
