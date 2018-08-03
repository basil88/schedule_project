package com.schedule.controller;

import com.schedule.course.Courses;
import com.schedule.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ScheduleController {

    @Autowired
    CourseRepo courseRepo;

    @GetMapping("/all")
    public List<Courses> gellAll() {
        return courseRepo.findAll();
    }

    @GetMapping("/all/{courseNum}")
    public Optional<Courses> getCourse(@PathVariable int courseNum) {
        return courseRepo.findById(courseNum);
    }
}
