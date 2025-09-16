package com.cdbjj.demo.repository;

import com.cdbjj.demo.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

}
