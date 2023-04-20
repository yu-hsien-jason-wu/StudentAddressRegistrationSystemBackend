// Declare the package of the class
package com.yuhsienjasonwu.StudentAddressRegistrationSystem.controller;

// Import the necessary Spring Framework classes and project-specific classes
import com.yuhsienjasonwu.StudentAddressRegistrationSystem.model.Student;
import com.yuhsienjasonwu.StudentAddressRegistrationSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Declare the StudentController class, which is a REST controller that handles HTTP requests related to the Student entity
@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    // Inject the StudentService dependency
    @Autowired
    private StudentService studentService;

    // Define the HTTP POST method for adding a new student
    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        // Call the StudentService's saveStudent() method to save the student to the database
        studentService.saveStudent(student);
        // Return a message indicating that the new student has been added successfully
        return "New student is added";
    }

    // Define the HTTP GET method for retrieving all students
    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        // Call the StudentService's getAllStudents() method to retrieve all students from the database
        return studentService.getAllStudents();
    }
}

