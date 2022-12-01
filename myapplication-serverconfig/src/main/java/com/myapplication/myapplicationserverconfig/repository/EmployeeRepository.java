package com.myapplication.myapplicationserverconfig.repository;

import com.myapplication.myapplicationserverconfig.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
