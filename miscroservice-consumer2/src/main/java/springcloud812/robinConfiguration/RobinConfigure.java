package springcloud812.robinConfiguration;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

public class RobinConfigure {
    @Bean//这个会由spring托管，则这个消费端的微服务都会采用这种负载均衡
    public IRule ribbonRule(){ //其中IRule就是所有规则的标准
        return new com.netflix.loadbalancer.RandomRule();//随机的访问策略
    }
}
