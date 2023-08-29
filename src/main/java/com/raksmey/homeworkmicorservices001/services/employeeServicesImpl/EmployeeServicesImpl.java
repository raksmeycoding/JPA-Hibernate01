package com.raksmey.homeworkmicorservices001.services.employeeServicesImpl;

import com.raksmey.homeworkmicorservices001.entity.Employee;
import com.raksmey.homeworkmicorservices001.repository.EmployeeRepository;
import com.raksmey.homeworkmicorservices001.repository.EmployeeRepositoryPersistenceContext;
import com.raksmey.homeworkmicorservices001.services.IEmployeeService;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class EmployeeServicesImpl  {
    private final EmployeeRepositoryPersistenceContext emPersistContext;


    public void persists(Employee e) {
        this.emPersistContext.persists(e);
    }

    public void detachMergeAndPersist(Employee e) {
        this.emPersistContext.detachMergeAndPersist(e);
    }


    public Employee findById(Long id) {
        return this.emPersistContext.findById(id);
    }


    public void remove(Long id) {
        this.emPersistContext.remove(id);
    }


}
