package com.bean;

import java.util.List;

public class StudentBean {
    private String name;
    private String email;
    private String role;
    private List<String> refreshments;

    // Default constructor
    public StudentBean() {
    }

    // Parameterized constructor
    public StudentBean(String name, String email, String role, List<String> refreshments) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.refreshments = refreshments;
    }

    // Getter and setter methods for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter methods for 'role'
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Getter and setter methods for 'refreshments'
    public List<String> getRefreshments() {
        return refreshments;
    }

    public void setRefreshments(List<String> refreshments) {
        this.refreshments = refreshments;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", refreshments=" + refreshments +
                '}';
    }
}
