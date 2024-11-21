package com.p1m5.alphastrength.model;

import jakarta.persistence.*;

@Entity
public class Workout {

    /*
    Representing an algorithm generated user-specific workout plan
    */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Mind the OAuth
    private String username;
    private String typeOfWorkout;
    private Integer duration;

    // Many-to-One relationship with user table
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "username")
    User user;

    public Workout() {}

    public Workout(Long id, String username, String typeOfWorkout, Integer duration) {
        this.id = id;
        this.username = username;
        this.typeOfWorkout = typeOfWorkout;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
