package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee,Long> {

    public Employee findById(int id);
    @Query("SELECT e FROM Employee e WHERE LOWER(e.firstName) LIKE LOWER(concat('%', :name, '%')) OR LOWER(e.lastName) LIKE LOWER(concat('%', :name, '%'))")
    List<Employee> findByFirstNameOrLastName(@Param("name") String name);
}
