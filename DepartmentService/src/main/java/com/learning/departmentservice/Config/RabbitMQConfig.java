package com.learning.departmentservice.Config;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE_NAME = "department.topic.exchange";
    public static final String QUEUE_NAME = "payroll.info.queue";
    public static final String ROUTING_KEY = "department.created"; // Routing key for fanout/topic

    @Bean
    public TopicExchange exchange() {
        // TopicExchange is a flexible exchange type
        System.out.println("test");
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME, true); // durable = true
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        // Binds the queue to the exchange using the routing key
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }

    // Used to send/receive JSON messages
    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}