package com.raksmey.homeworkmicorservices001;


import com.raksmey.homeworkmicorservices001.entity.Employee;
import com.raksmey.homeworkmicorservices001.services.employeeServicesImpl.EmployeeServicesImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Calendar;

@Component
@RequiredArgsConstructor
public class AppInitialize implements CommandLineRunner {

    private final EmployeeServicesImpl employeeServices;

    @Override
    public void run(String... args) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(calendar.DAY_OF_MONTH, 8);

        var employee = Employee.builder().firstName("ethan").lastName("vi").email("ethanvi@gmail.com").birthDate(new Date(calendar.getTimeInMillis())).build();
        var employee1 = Employee.builder().firstName("billy").lastName("tom").email("ethanvi@gmail.com").birthDate(new Date(calendar.getTimeInMillis())).build();
        Employee employee2 = new Employee(null, "memey", "lyly", "email@gmail.com", new Date(calendar.getTimeInMillis()), null);
//        employeeServices.persists(employee);

        employeeServices.detachMergeAndPersist(employee2);

//        employeeServices.remove(1L);





//        find the object by id
        var toFindEmployee = this.employeeServices.findById(1L);
        System.out.println(toFindEmployee);
    }




}
