// Declare the package of the class
package com.yuhsienjasonwu.StudentAddressRegistrationSystem.service;

// Import the necessary Spring Framework classes and project-specific classes
import com.yuhsienjasonwu.StudentAddressRegistrationSystem.model.Student;
import com.yuhsienjasonwu.StudentAddressRegistrationSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Declare the StudentServiceImpl class, which implements the StudentService interface
@Service
public class StudentServiceImpl implements StudentService{
    // Inject the StudentRepository dependency
    @Autowired
    private StudentRepository studentRepository;

    // Implement the saveStudent() method, which saves the student to the database using the StudentRepository
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Implement the getAllStudents() method, which retrieves all students from the database using the StudentRepository
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

