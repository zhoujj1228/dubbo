package dubbo.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

@Component
public class TestService {
    @Reference(version = "1.0.0")
    HelloService helloService;
    
    public void sayHello(){
        System.out.println(helloService.sayHello());
    }
}
