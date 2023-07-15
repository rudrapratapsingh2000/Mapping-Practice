package com.MappingPractice.service;

import com.MappingPractice.model.StudentModel;
import com.MappingPractice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public void addStudent(StudentModel student) {
        studentRepo.save(student);
    }

    public List<StudentModel> getAllStudents() {
        return studentRepo.findAll();
    }

    public void deleteStudent(String number) {
        studentRepo.deleteById(number);
    }

    public void updateStudent(String number, StudentModel studentModel) {
        StudentModel studentModel1=studentRepo.findById(number).get();
        studentModel1.setAddress(studentModel.getAddress());
        studentModel1.setAge(studentModel.getAge());
        studentModel1.setName(studentModel.getName());
        studentModel1.setBranch(studentModel.getBranch());
        studentModel1.setDepartment(studentModel.getDepartment());
        studentModel1.setPhoneNumber(studentModel.getPhoneNumber());
        studentRepo.save(studentModel1);


    }
}
