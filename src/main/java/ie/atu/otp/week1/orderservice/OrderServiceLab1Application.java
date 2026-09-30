package ie.atu.otp.week1.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderServiceLab1Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceLab1Application.class, args);
    }

}
