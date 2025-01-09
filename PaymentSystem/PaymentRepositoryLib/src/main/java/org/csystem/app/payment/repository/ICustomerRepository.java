package org.csystem.app.payment.repository;

import org.csystem.app.payment.repository.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, String> {
    Optional<Customer> findByUsernameAndActive(@Param("username") String username, @Param("active") boolean active);
    Iterable<Customer> findByNameAndActive(@Param("name") String name, @Param("active") boolean active);
    Iterable<Customer> findByNameContainsAndActive(@Param("text") String text, @Param("active") boolean active);
}
