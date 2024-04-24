package org.example.models;


import jakarta.validation.constraints.*;

public class User {
    private int id;
    @NotEmpty(message = "Name field should not be empty")
    @Size(min = 2, max = 15, message = "Name should be between 2 and 15 characters")
    private String name;
    @Min(value = 0, message = "Age must be grater than 0")
    @Max(value = 99, message = "Age must be less than 99")
    private int age;
    @Email(message = "This field must contains email")
    private String email;

    public User(){

    }
    public User(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
