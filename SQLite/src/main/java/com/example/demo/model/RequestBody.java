package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestBody {
    private String Name;

    public String getName() {
        return Name;
    }
    @JsonProperty(value="Name")
    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }
    @JsonProperty(value="Email")
    public void setEmail(String email) {
        Email = email;
    }

    private String Email;
}
