package com.practice.department.service;

import com.practice.department.entity.Department;
import com.practice.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of Department Service");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        log.info("Inside getDepartmentById method of Department Service");
        return departmentRepository.findById(id).get();
    }
}
