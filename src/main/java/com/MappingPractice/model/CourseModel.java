package com.MappingPractice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="course_table")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=CourseModel.class,property="courseId")

public class CourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "course-student-join_table",joinColumns = @JoinColumn(name = "fk_course_id"),
            inverseJoinColumns= @JoinColumn(name = "fk_student_id"))
    List<StudentModel> studentList;

}
