package com.p1m5.alphastrength.rest;

import com.p1m5.alphastrength.model.Exercise;
import com.p1m5.alphastrength.service.impl.exerciseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ExerciseController {

    exerciseServiceImpl service;

    @Autowired
    public ExerciseController(exerciseServiceImpl service) {
        this.service = service;
    }

    /*
    Implement post,put and delete mappings; Better logging and error handling
     */

    @GetMapping
    public ResponseEntity<List<Exercise>> getAllExercises() {
        try {
            return ResponseEntity.ok(service.getAllExercises());
        } catch (Exception e) {
            System.out.println("An error occured: " + e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping
    public ResponseEntity<Exercise> getExerciseById(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(service.getExercise(id));
        } catch (Exception e) {
            System.out.println("An error occured: " + e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

}
