package com.demo.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeesDao {
    public List<String> getEmail();
}
