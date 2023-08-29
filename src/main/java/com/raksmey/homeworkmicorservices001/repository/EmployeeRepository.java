package com.raksmey.homeworkmicorservices001.repository;

import com.raksmey.homeworkmicorservices001.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
