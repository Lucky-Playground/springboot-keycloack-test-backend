package lk.objectone.keycloak.test;


import lk.objectone.keycloak.test.util.LogConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppInitializer {

    public static void main(String[] args) {
        LogConfig.initLogging();
        SpringApplication.run(AppInitializer.class, args);
    }
}
