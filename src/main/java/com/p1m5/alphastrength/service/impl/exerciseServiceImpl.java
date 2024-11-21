package com.p1m5.alphastrength.service.impl;

import com.p1m5.alphastrength.exception.DataAccessException;
import com.p1m5.alphastrength.model.Exercise;
import com.p1m5.alphastrength.repository.exerciseRepository;
import com.p1m5.alphastrength.service.exerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class exerciseServiceImpl implements exerciseService {
    exerciseRepository repo;

    @Autowired
    public exerciseServiceImpl(exerciseRepository repo) {
        this.repo = repo;
    }

    public void deleteExercise(Long id) {
        try {
            repo.findById(id).orElseThrow(ResourceNotFoundException::new);
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
            Exercise ex = repo.findById(id).isPresent() ? repo.findById(id).get() : null;
            if (ex == null) {
                throw new ResourceNotFoundException();
            }
            return ex;
        } catch (Exception e) {
            System.out.println("Error retrieving exercise with id " + id);
            throw new DataAccessException(e.getMessage());
        }
    }

    public List<Exercise> getAllExercises() {
        try {
            List<Exercise> ex = repo.findAll();
            if (ex.isEmpty()) {
                throw new ResourceNotFoundException();
            }
            return ex;
        } catch (Exception e) {
            System.out.println("Error retrieving all exercises");
            throw new DataAccessException(e.getMessage());
        }
    }

    public void createExercise(Exercise exercise) {
        try {
            repo.save(exercise);
            System.out.println("Created exercise with id " + exercise.getId());
        } catch (Exception e) {
            System.out.println("Error creating exercise with id " + exercise.getId());
            throw new DataAccessException(e.getMessage());
        }
    }

    /*
    Update exercise should probably check if the exercise
    we are updating with has non-null fields. Any null fields should not replace non-null
    fields in the new object.
     */

    public void updateExercise(Exercise exercise, Long id) {
        try {
            Exercise ex = new Exercise(id,exercise.getAnimationId(),
                    exercise.getTypeOfWorkout(),exercise.getDuration(),
                    exercise.getWeightUsed(),exercise.getCaloriesBurned());
            repo.save(ex);
            System.out.println("Updated exercise with id " + exercise.getId());
        } catch (Exception e) {
            System.out.println("Error updating exercise with id " + exercise.getId());
            throw new DataAccessException(e.getMessage());
        }
    }
}
