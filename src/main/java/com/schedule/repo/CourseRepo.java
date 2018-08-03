package com.schedule.repo;


import com.schedule.course.Courses;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepo extends JpaRepository<Courses, Integer> {

}
