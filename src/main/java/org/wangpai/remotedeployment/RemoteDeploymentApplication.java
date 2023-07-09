package org.wangpai.remotedeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @since 2023-7-10
 */
@SpringBootApplication(scanBasePackages = {"org.wangpai"})
public class RemoteDeploymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemoteDeploymentApplication.class, args);
    }
}
