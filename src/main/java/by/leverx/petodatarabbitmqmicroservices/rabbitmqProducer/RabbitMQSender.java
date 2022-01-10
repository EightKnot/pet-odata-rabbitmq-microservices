package by.leverx.petodatarabbitmqmicroservices.rabbitmqProducer;

import by.leverx.petodatarabbitmqmicroservices.order.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMQSender {

    private final RabbitTemplate rabbitTemplate;

    private final Queue queue;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingKey}")
    private String routingKey;

    @Scheduled
    public void send(Order order) {
        rabbitTemplate.convertAndSend(this.queue.getName(), order);
    }
}
