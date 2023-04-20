// Declare the package of the class
package com.yuhsienjasonwu.StudentAddressRegistrationSystem.repository;

// Import the necessary Spring Framework classes
import com.yuhsienjasonwu.StudentAddressRegistrationSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Declare the Student repository interface, which extends the JpaRepository interface
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
