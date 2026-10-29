package com.project.carsalesapplication.service;

import com.project.carsalesapplication.entity.Worker;
import com.project.carsalesapplication.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;
    @Autowired
    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }


    public List<Worker> getWorkers() {
       return workerRepository.findAll();
    }

    public Worker addWorker(Worker worker) {
         return workerRepository.save(worker);
    }
}
