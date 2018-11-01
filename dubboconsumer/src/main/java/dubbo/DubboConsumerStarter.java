package dubbo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dubbo.service.TestService;

@SpringBootApplication
public class DubboConsumerStarter 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = SpringApplication.run(DubboConsumerStarter.class, args);
        TestService bean = context.getBean(TestService.class);
        bean.sayHello();
    }
}
