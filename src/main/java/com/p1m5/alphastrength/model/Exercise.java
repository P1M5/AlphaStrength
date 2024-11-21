package com.p1m5.alphastrength.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exercise {

    /*
    Representing a type of exercise
    */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Integer repetitions;

    private String animationId;

    private String typeOfWorkout;
    private Integer duration;
    private Integer weightUsed;
    private Integer caloriesBurned;

    public Exercise() {}

    public Exercise(Integer id, String animationId, String typeOfWorkout, Integer duration, Integer weightUsed, Integer caloriesBurned) {
        this.id = id;
        this.animationId = animationId;
        this.typeOfWorkout = typeOfWorkout;
        this.duration = duration;
        this.weightUsed = weightUsed;
        this.caloriesBurned = caloriesBurned;
    }

    public Integer getId() {
        return id;
    }

    public Integer getRepetitions() {
        return repetitions;
    }
    public void setRepetitions(Integer repetitions) {
        this.repetitions = repetitions;
    }

    public String getAnimationId() {
        return animationId;
    }
    public void setAnimationId(String animationId) {
        this.animationId = animationId;
    }

    public String getTypeOfWorkout() {
        return typeOfWorkout;
    }
    public void setTypeOfWorkout(String typeOfWorkout) {
        this.typeOfWorkout = typeOfWorkout;
    }

    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getWeightUsed() {
        return weightUsed;
    }
    public void setWeightUsed(Integer weightUsed) {
        this.weightUsed = weightUsed;
    }

    public Integer getCaloriesBurned() {
        return caloriesBurned;
    }
    public void setCaloriesBurned(Integer caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public String toString() {
        return "Exercise [id=" + id + ", repetitions=" + repetitions
                + ", animationId=" + animationId + ", typeOfWorkout="
                + typeOfWorkout + ", duration=" + duration + ", weightUsed="
                + weightUsed + ", caloriesBurned=" + caloriesBurned + "]";
    }
}
