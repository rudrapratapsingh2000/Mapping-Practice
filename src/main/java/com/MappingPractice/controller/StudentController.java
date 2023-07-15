package com.MappingPractice.controller;

import com.MappingPractice.model.AddressModel;
import com.MappingPractice.model.StudentModel;
import com.MappingPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students-api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add-student")
    public void addStudent(@RequestBody StudentModel student)
    {
        studentService.addStudent(student);
    }

    @GetMapping("/getallstudent")
    List<StudentModel> getAllStudents() {
        return studentService.getAllStudents();
    }
    @PutMapping("/update-api/number/{number}")
    public  void updateStudent(@PathVariable String number, @RequestBody StudentModel studentModel){
        studentService.updateStudent(number,studentModel);
    }

    @DeleteMapping("/deletestudent/number/{number}")
    public void deleteStudent(@PathVariable String number)
    {
        studentService.deleteStudent(number);
    }
    }
