package com.example.nslintern.interntraining.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CurrUser implements Serializable {
    private long userId;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
}
