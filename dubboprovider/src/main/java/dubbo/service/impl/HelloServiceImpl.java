package dubbo.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import dubbo.service.HelloService;

@Component
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService{

    public String sayHello() {
        return "hello dubbo1";
    }

}
