package com.learning.departmentservice.Service;

import com.learning.departmentservice.Config.RabbitMQConfig;
import com.learning.departmentservice.Model.Department;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

//Producer
@Service
public class departmentService {


    private final RabbitTemplate rabbitTemplate;

    // Inject RabbitTemplate
    public departmentService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public Department createdDept(Department dept) {

        System.out.println("Department added. Publishing message to RabbitMQ...");

        // Publish message asynchronously
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE_NAME, // The exchange
                RabbitMQConfig.ROUTING_KEY,   // The routing key
                dept                   // The payload (will be converted to JSON)
        );

        return dept;
    }
}