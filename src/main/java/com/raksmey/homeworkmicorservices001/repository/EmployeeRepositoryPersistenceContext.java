package com.raksmey.homeworkmicorservices001.repository;

import com.raksmey.homeworkmicorservices001.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EmployeeRepositoryPersistenceContext {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void persists(Employee e) {
        entityManager.persist(e);
    }


    @Transactional
    public void detachMergeAndPersist(Employee detachEmployee) {
//        entityManager.persist(detachEmployee);
        System.out.println(entityManager.contains(detachEmployee));

        entityManager.detach(detachEmployee);
        System.out.println(entityManager.contains(detachEmployee));

        detachEmployee.setFirstName("detachedFirstName");
        detachEmployee.setLastName("detachLastName");

//         Merged the modified entity
        entityManager.merge(detachEmployee);
//        entityManager.remove(detachEmployee);
//        persist the merge entity
//        entityManager.flush();
//        System.out.println("Done on detach, merge, and persist.");
    }


    public Employee findById(Long id) {
        return this.entityManager.find(Employee.class, id);
    }


    @Transactional
    public void remove(Long id) {
        var em = findById(id);
        this.entityManager.remove(em);
    }


}
