package org.example;

public class Patron {

    private String name;
    private int patronId;

    // Creating the constructor for the Patron class
    public Patron(String name, int patronId) {
        this.name = name;
        this.patronId = patronId;
    }

    // Creating the getters for the fields of the patron class
    public String getName() {
        return name;
    }

    public int getPatronId() {
        return patronId;
    }
}
