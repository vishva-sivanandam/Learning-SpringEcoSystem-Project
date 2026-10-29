package com.project.carsalesapplication.controller;

import com.project.carsalesapplication.entity.Worker;
import com.project.carsalesapplication.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }
    @GetMapping("/get")
    public ResponseEntity<List<Worker>> getAllWorker(){
        return ResponseEntity.status(200).body(workerService.getWorkers());
    }
    @PostMapping("/add")
    public ResponseEntity<Worker> addWorker(@RequestBody Worker worker){
        Worker worker1 = workerService.addWorker(worker);
        return ResponseEntity.status(201).body(worker);
    }

}
