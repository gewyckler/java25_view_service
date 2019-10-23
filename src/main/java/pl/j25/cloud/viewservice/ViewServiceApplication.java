package pl.j25.cloud.viewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ViewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViewServiceApplication.class, args);
    }

}
