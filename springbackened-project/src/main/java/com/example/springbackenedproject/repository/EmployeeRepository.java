package com.example.springbackenedproject.repository;

import com.example.springbackenedproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
