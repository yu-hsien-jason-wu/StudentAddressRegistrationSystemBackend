// Declare the package of the class
package com.yuhsienjasonwu.StudentAddressRegistrationSystem.model;

// Import the necessary Jakarta Persistence API classes
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Declare the Student entity class
@Entity
public class Student {
    // Declare the id attribute and annotate it as the primary key with auto-generation of values
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Declare the name attribute
    private String name;

    // Declare the address attribute
    private String address;

    // Declare the default constructor
    public Student() {
    }

    // Declare the getter method for the id attribute
    public int getId() {
        return id;
    }

    // Declare the setter method for the id attribute
    public void setId(int id) {
        this.id = id;
    }

    // Declare the getter method for the name attribute
    public String getName() {
        return name;
    }

    // Declare the setter method for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Declare the getter method for the address attribute
    public String getAddress() {
        return address;
    }

    // Declare the setter method for the address attribute
    public void setAddress(String address) {
        this.address = address;
    }
}
