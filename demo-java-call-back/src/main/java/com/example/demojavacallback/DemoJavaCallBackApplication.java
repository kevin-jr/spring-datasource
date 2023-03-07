package com.example.demojavacallback;

import com.example.demojavacallback.service.EmployeeSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class DemoJavaCallBackApplication implements CommandLineRunner {

    @Autowired
    private EmployeeSerivce employeeSerivce;
    public static void main(String[] args) {

        float num = 0;



        SpringApplication.run(DemoJavaCallBackApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        employeeSerivce.listAllEmployee().forEach(System.out::println);
    }
}
