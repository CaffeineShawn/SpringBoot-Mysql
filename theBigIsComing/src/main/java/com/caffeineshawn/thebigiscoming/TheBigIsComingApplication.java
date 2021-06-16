package com.caffeineshawn.thebigiscoming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.caffeineshawn.thebigiscoming.Repository")
@EntityScan("com.caffeineshawn.thebigiscoming.Entity")
public class TheBigIsComingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheBigIsComingApplication.class, args);
    }

}
