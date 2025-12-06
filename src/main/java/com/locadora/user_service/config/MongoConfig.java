package com.locadora.user_service.config;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    @Value("${MONGO_URI}")
    private String connectionString;

    @Value("${MONGO_DB_NAME:locadora_clientes}")
    private String databaseName;

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(connectionString);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), databaseName);
    }
}
