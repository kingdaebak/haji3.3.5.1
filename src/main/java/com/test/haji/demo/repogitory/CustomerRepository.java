package com.test.haji.demo.repogitory;

import com.test.haji.demo.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("select x from Customer x ORDER BY x.first_name, x.last_name")
    List<Customer> findAllOrOrderByName();

    @Query("select x from Customer x ORDER BY x.first_name, x.last_name")
    Page<Customer> findAllOrOrderByName(Pageable pageable);
}
