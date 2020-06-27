package com.vignesh.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vignesh.student.Model.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
