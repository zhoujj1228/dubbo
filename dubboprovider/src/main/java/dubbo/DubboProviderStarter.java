package dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboProviderStarter 
{
    public static void main( String[] args )
    {
        SpringApplication.run(DubboProviderStarter.class, args);
    }
}
