import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by qingao on 17-10-19.
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.qingao")
public class HiServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(HiServiceApp.class,args);
    }
}
