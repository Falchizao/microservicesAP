package br.edu.utfpr;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
@Slf4j
@EnableRabbit
public class Receiver {

    @RabbitListener(queues = {"test-queue"})
    public void receive(@Payload String fileBody) {
        log.info("Order: " + fileBody);

//        try {
//            throw new Exception("This is a test.");
//        } catch (Exception e) {
//            Sentry.captureException(e);
//        }
    }

}
