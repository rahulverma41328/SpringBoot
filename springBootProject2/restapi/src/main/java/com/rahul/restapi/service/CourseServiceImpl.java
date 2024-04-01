package com.rahul.restapi.service;

import com.rahul.restapi.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Courses> list;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Courses(145,"Java Core Course","this course contain java tutorial"));
        list.add(new Courses(4342,"spring boot course","creating rest api using spring"));
    }
    @Override
    public List<Courses> getCourses() {
        return list;
    }

    @Override
    public Courses getCourse(long courseId) {
        Courses c = null;
        for (Courses courses:list){
            if (courses.getId()==courseId){
                c=courses;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses addCourse(Courses courses) {
        list.add(courses);
        return courses;
    }


}
