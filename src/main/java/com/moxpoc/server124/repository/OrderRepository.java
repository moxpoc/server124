package com.moxpoc.server124.repository;

import com.moxpoc.server124.entity.Order;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long> {
}
