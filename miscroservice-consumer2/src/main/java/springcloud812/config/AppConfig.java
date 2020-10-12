package springcloud812.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

@Configuration
public class AppConfig {


    @Bean     //少了 @LoadBalance
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    @Bean
    public HttpHeaders getHeaders(){
        HttpHeaders headers=new HttpHeaders();
        String auth="admin:a";   //认证的原始用户名和密码
        byte[] encodeAuth= Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII"))); //加密处理
        String authHeader="Basic "+new String(encodeAuth);
        headers.set("Authorization",authHeader);    //    Http请求头         Authorization: Base xxxxxxxxx
        return headers;
    }
}
