package com.neo;

import com.neo.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoDbImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbImplApplication.class, args);
    }

}
