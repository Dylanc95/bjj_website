package com.cdbjj.demo.service.student;

import com.cdbjj.demo.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();

    Student findStudentById(int id);

    Student saveStudent(Student student);

    void deleteStudentById(int id);
}
