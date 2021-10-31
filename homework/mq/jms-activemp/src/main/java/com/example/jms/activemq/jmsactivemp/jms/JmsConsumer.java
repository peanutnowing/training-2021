

package com.example.jms.activemq.jmsactivemp.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 消费监听
 * @author peanutnowing
 */
@Component
public class JmsConsumer {

    @JmsListener(destination = "activeTest")
    public void receiveMessage(final Map message) {
        System.out.println(message.toString());
    }
}
