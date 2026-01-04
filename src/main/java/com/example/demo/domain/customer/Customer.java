package com.example.demo.domain.customer;

import jakarta.persistence.Entity;

@Entity
public class Customer {
    private Long id;
    private String username;
    private String email;

    public Customer() {
    }

    public Customer(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
