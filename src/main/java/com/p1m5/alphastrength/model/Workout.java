package com.p1m5.alphastrength.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Workout {

    /*
    Representing an algorithm generated user-specific workout plan
    */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //Mind the OAuth
    // One-to-many relationship with user table
    private String username;
    // One-to-many relationship with exercise table
    private String typeOfWorkout;
    private Integer duration;

    public Workout() {}

    public Workout(String username, String typeOfWorkout, Integer duration) {
        this.username = username;
        this.typeOfWorkout = typeOfWorkout;
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
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

    public String toString() {
        return "Workout [id=" + id + ", username=" + username + ", typeOfWorkout="
                + typeOfWorkout + ", duration=" + duration + "]";
    }
}
