package com.demo.demo.service.impl;

import com.demo.demo.dao.EmployeesDao;
import com.demo.demo.service.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoImpl implements Demo {
    @Autowired EmployeesDao employeesDao;

    @Override
    public String hollowWorld() {
        return "Hollow World";
    }

    @Override
    public List<String> getEmail(){
        return employeesDao.getEmail();
    }
}
