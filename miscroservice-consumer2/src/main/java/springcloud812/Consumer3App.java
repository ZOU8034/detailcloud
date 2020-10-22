package springcloud812;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient//启用eureka客户端，这样能完成服务发现
public class Consumer3App {

    public static void main(String[] args) {
        SpringApplication.run(Consumer3App.class, args);
    }

}