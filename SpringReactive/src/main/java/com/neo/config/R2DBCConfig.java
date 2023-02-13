package com.neo.config;

import com.mysql.cj.jdbc.Driver;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sound.sampled.Port;

@Configuration
public class R2DBCConfig {

//    @Bean
//    public ConnectionFactory connectionFactory() {
//        return ConnectionFactories.get(
//                ConnectionFactoryOptions.builder()
//                        .option(Driver, "postgresql")
//                        .option(HOST, "localhost")
//                        .option(Port, 5432)
//                        .option(USER, "vinsguru")
//                        .option(PASSWORD, "admin")
//                        .option(DATABASE, "productdb")
//                        .option(MAX_SIZE, 40)
//                        .build());
//    }

}