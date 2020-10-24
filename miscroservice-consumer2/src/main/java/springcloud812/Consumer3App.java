package springcloud812;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import springcloud812.robinConfiguration.RobinConfigure;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient//启用eureka客户端，这样能完成服务发现
//指定这个新的负载算法类给MICROSERVICE-PROVIDER-PRODUCT这个服务用
//这里的name 只服务的名称，如果需要有多个服务提供方，这个时候可以使用@RibbonClients进行配置
//只对服务名为MICROSERVICE-PROVIDER下的服务清单采用RobinConfigure.class中的随机负载均衡方式
@RibbonClient(name ="MICROSERVICE-PROVIDER", configuration = RobinConfigure.class)

//如有多个服务要用不同的策略,则采用...@Ribbonclients

public class Consumer3App {

    public static void main(String[] args) {
        SpringApplication.run(Consumer3App.class, args);
    }

}