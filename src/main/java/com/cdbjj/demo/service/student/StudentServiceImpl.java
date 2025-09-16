package com.cdbjj.demo.service.student;

import com.cdbjj.demo.entity.Student;
import com.cdbjj.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentById(int id) {

        Optional<Student> result = studentRepository.findById(id);

        Student student = null;

        if (result.isPresent()) {
            student = result.get();
        } else {
            throw new RuntimeException("Student not found");
        }

        return student;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }
}
