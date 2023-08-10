package bi.seke.warehouseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by Harvey's on 8/10/2023.
 */
@SpringBootApplication
@EnableConfigurationProperties
@EnableCaching
public class WarehouseServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WarehouseServiceApplication.class, args);
    }
}
