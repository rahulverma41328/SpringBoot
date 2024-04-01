package com.rahul.restapi.service;

import com.rahul.restapi.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {
    public List<Courses> getCourses();

    public Courses getCourse(long courseId);

    public Courses addCourse(Courses courses);
}
