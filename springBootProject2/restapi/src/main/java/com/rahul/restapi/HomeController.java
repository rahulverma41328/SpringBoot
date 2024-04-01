package com.rahul.restapi;

import com.rahul.restapi.entities.Courses;
import com.rahul.restapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private CourseService courseService;
    
    @RequestMapping("/home")
    public String printHello(){
        return "hello";
    }

    // get the courses

    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses courses){
        return this.courseService.addCourse(courses);
    }
}
