package cn.darren.ferrari.ferrari.flux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FerrariFluxApplication {

    public static void main(String[] args) {
        SpringApplication.run(FerrariFluxApplication.class, args);
    }

}
