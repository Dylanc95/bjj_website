package com.cdbjj.demo.service.instructor;

import com.cdbjj.demo.entity.Instructor;
import com.cdbjj.demo.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorServiceImpl implements InstructorService {

    private InstructorRepository  instructorRepository;

    @Autowired
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<Instructor> findAllInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor findInstructorById(int id) {

        Optional<Instructor> result = instructorRepository.findById(id);

        Instructor instructor = null;

        if (result.isPresent()) {
            instructor = result.get();
        } else {
            throw new RuntimeException("No Instructor found");
        }

        return instructor;
    }

    @Override
    public Instructor saveInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public void deleteInstructorById(int id) {
        instructorRepository.deleteById(id);
    }
}
