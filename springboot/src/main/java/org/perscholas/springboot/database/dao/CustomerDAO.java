package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Customer;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {
    public Customer findById(Integer id);

    //    @Query("SELECT c FROM Customer c WHERE c.firstName = :firstName")
    @Query("SELECT c FROM  Customer c WHERE  c.user.id = :userId")
    List<Customer> findByUserId(Integer userId);

    @Query("SELECT c FROM Customer c WHERE LOWER(c.firstName) LIKE LOWER(concat('%', :name, '%')) OR LOWER(c.lastName) LIKE LOWER(concat('%', :name, '%'))")
    List<Customer> findByFirstNameOrLastName(@Param("name") String name);
    // or we can use this if we use firstName and lastName instead of name
    // then we use findByFirstNameOrLastName(String firstName,String lastName);
}