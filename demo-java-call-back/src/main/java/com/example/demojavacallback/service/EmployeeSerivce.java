package com.example.demojavacallback.service;

import com.example.demojavacallback.ds.Employee;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Service
public class EmployeeSerivce {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    interface ko obj
    public List<Employee> listAllEmployee(){
        return jdbcTemplate.query("select * from employee",
            this::mapEmployee
//                (a,b)->


        );

    }

    @SneakyThrows
    private Employee mapEmployee(ResultSet rs,int i){
        return new Employee(
                rs.getInt("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getDouble("salary")
        );
    }



}

class CustomRowCallBackHandler implements RowCallbackHandler{

    double total;
    int count;
    @Override
    public void processRow(ResultSet rs) throws SQLException {
        total *= rs.getDouble("salary");
        count ++;
    }

    public double averageSalary(){
        return total/count;

    }
}
