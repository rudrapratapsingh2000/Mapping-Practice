package com.MappingPractice.controller;

import com.MappingPractice.model.AddressModel;
import com.MappingPractice.model.BookModel;
import com.MappingPractice.model.CourseModel;
import com.MappingPractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("/add-course")
    public void addCourse(@RequestBody CourseModel course)
    {
        courseService.addCourse(course);
    }

    @GetMapping("/getallcourses")
    List<CourseModel> getAllCourses() {
        return courseService.getAllCourses();
    }
    @PutMapping("/update-api/number/{number}")
    public  void updatecourse(@PathVariable String number, @RequestBody CourseModel courseModel){
        courseService.updatecourse(number,courseModel);
    }
    @DeleteMapping("/deletecourse/number/{number}")
    public void deleteCourse(@PathVariable String number)
    {
        courseService.deleteCourse(number);
    }
    }
