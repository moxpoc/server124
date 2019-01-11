package com.moxpoc.server124.repository;

import com.moxpoc.server124.entity.Customer;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface CustomerRepository extends JpaRepositoryImplementation<Customer, Long> {
}
