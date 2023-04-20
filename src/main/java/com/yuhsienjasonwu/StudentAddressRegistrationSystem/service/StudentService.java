// Declare the package of the interface
package com.yuhsienjasonwu.StudentAddressRegistrationSystem.service;

// Import the necessary Java classes and project-specific class
import com.yuhsienjasonwu.StudentAddressRegistrationSystem.model.Student;
import java.util.List;

// Declare the StudentService interface, which defines the methods for interacting with Student entities
public interface StudentService {
    // Declare the method for saving a new student
    public Student saveStudent(Student student);

    // Declare the method for retrieving all students
    public List<Student> getAllStudents();
}

