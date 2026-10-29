package com.project.carsalesapplication.repository;

import com.project.carsalesapplication.entity.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerDetails,Integer> {


}
