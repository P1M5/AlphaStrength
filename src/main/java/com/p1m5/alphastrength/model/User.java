package com.p1m5.alphastrength.model;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // OAuth required
    // One-to-one relationship with workout table
    private String username;
    private String password;

    private String pictureId;

    private String workoutTypesStringArray;
    private Integer height;
    private Integer weight;
    private Integer age;
    private String gender;
    private String workoutPurpose;

    public User() {}

    public User(Long id, String username, String password, String pictureId,
                String workoutTypesStringArray, Integer height, Integer weight,
                Integer age, String gender, String workoutPurpose) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.pictureId = pictureId;
        this.workoutTypesStringArray = workoutTypesStringArray;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.workoutPurpose = workoutPurpose;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPictureId() {
        return pictureId;
    }
    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String[] getWorkoutTypesStringArray() {

        return workoutTypesStringArray.split(",");
    }
    public void setWorkoutTypesStringList(String[] workoutTypesStringList) {
        workoutTypesStringArray = String.join(",", workoutTypesStringList);
    }

    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWorkoutPurpose() {
        return workoutPurpose;
    }
    public void setWorkoutPurpose(String workoutPurpose) {
        this.workoutPurpose = workoutPurpose;
    }

    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", pictureId=" + pictureId + ", workoutTypesStringArray="
                + workoutTypesStringArray + ", height=" + height + ", weight=" + weight + ", age=" + age + ", gender=" + gender + ", workoutPurpose="
                + workoutPurpose + "]";
    }
}
