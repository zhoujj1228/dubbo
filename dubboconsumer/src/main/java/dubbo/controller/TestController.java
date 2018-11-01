package dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import dubbo.service.HelloService;

@RestController
public class TestController {
    @Reference(version = "1.0.0")
    HelloService helloService;
    
    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String sayHello(){
        return helloService.sayHello();
    }
}
