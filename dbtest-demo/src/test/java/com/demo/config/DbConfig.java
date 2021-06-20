package com.demo.config;

import ch.vorburger.exec.ManagedProcessException;
import ch.vorburger.mariadb4j.springframework.MariaDB4jSpringService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

//@Configuration
@Profile("unit")
public class DbConfig {
    @Bean
    public MariaDB4jSpringService mariaDB4jSpringService() {
        MariaDB4jSpringService mariaDB4jSpringService = new MariaDB4jSpringService();
        configureMariaDB4jSpringService(mariaDB4jSpringService);
        return mariaDB4jSpringService;
    }

    protected void configureMariaDB4jSpringService(MariaDB4jSpringService mariaDB4jSpringService) {
        mariaDB4jSpringService.setDefaultPort(3307);
    }

    @Bean
    public DataSource getDataSource(DataSource dataSource) throws ManagedProcessException {
        mariaDB4jSpringService().getDB().createDB("testdb");
        return dataSource;
    }
}
