package com.p1m5.alphastrength.rest;

import com.p1m5.alphastrength.exception.DataAccessException;
import com.p1m5.alphastrength.model.Exercise;
import com.p1m5.alphastrength.repository.exerciseRepository;

public class ExerciseController {
    exerciseRepository repo;

    public ExerciseController(exerciseRepository repo) {
        this.repo = repo;
    }

    // Implement createExercise,updateExercise
    /* Figure out a better way to ensure we don't send null objects to the controller; aka
    * throw an error instead of null
    * */

    public void deleteExercise(Long id) {
        try {
            repo.deleteById(id);
            System.out.println("Deleted exercise with id " + id); // Has to be replaced with proper logging; Log4j
        } catch (Exception e) {
            System.out.println("Error deleting exercise with id " + id);
            throw new DataAccessException(e.getMessage());
        }
    }

    public void deleteAllExercises() {
        try {
            repo.deleteAll();
            System.out.println("Deleted all exercises");
        } catch (Exception e) {
            System.out.println("Error deleting all exercises");
            throw new DataAccessException(e.getMessage());
        }
    }

    public Exercise getExercise(Long id) {
        try {
            System.out.println("Retrieving exercise with id " + id);
            return repo.findById(id).isPresent() ? repo.findById(id).get() : null;
        } catch (Exception e) {
            System.out.println("Error retrieving exercise with id " + id);
            throw new DataAccessException(e.getMessage());
        }
    }
}
