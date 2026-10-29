package com.project.carsalesapplication.repository;

import com.project.carsalesapplication.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Integer> {
}
