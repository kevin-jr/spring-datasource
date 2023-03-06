package com.solt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {


    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder().addScript("schema.sql").addScript("data.sql").generateUniqueName(true).build();
    }
}
