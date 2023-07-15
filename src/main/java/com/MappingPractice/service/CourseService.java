package com.MappingPractice.service;

import com.MappingPractice.model.CourseModel;
import com.MappingPractice.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;

    public void addCourse(CourseModel course) {
        courseRepo.save(course);
    }

    public List<CourseModel> getAllCourses() {
        return courseRepo.findAll();
    }

    public void deleteCourse(String number) {
courseRepo.deleteById(number);
    }

    public void updateCourse(String number, CourseModel courseModel) {
        CourseModel courseModel1=courseRepo.findById(number).get();
        courseModel1.setDescription(courseModel.getDescription());
        courseModel1.setDuration(courseModel.getDuration());
        courseModel1.setTitle(courseModel.getTitle());
        courseModel1.setStudentList(courseModel.getStudentList());
        courseRepo.save(courseModel1);
    }

    public void updatecourse(String number, CourseModel courseModel) {
        CourseModel courseModel1=courseRepo.findById(number).get();
        courseModel1.setTitle(courseModel.getTitle());
        courseModel1.setDuration(courseModel.getDuration());
        courseModel1.setDescription(courseModel.getDescription());
        courseModel1.setStudentList(courseModel.getStudentList());
        courseRepo.save(courseModel1);
    }
}
