package com.cdbjj.demo.service.instructor;

import com.cdbjj.demo.entity.Instructor;

import java.util.List;

public interface InstructorService {

    List<Instructor> findAllInstructors();

    Instructor findInstructorById(int id);

    Instructor saveInstructor(Instructor instructor);

    void deleteInstructorById(int id);
}
