package api.demo.alugai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("api.demo.alugai")
public class AlugaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlugaiApplication.class, args);
    }

}
