import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by qingao on 17-10-19.
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
@ComponentScan("com.qingao")
public class ConfigurationServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationServerApp.class,args);
    }
}
