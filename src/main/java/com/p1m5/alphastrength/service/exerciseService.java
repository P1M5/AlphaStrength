package com.p1m5.alphastrength.service;

import com.p1m5.alphastrength.model.Exercise;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface exerciseService {

    /*
    Deletes an exercise with a given id from the database
     */
    public void deleteExercise(Long id);

    /*
    Deletes all exercises from the database
     */
    public void deleteAllExercises();

    /*
    Fetches an exercise by id from the database
     */
    public Exercise getExercise(Long id);

    /*
    Fetches all exercises from the database
     */
    public List<Exercise> getAllExercises();

    /*
    Create a new exercise record
     */
    public void createExercise(Exercise exercise);

    /*
    Updates a record with new exercise information
     */
    public void updateExercise(Exercise exercise, Long id);
}
