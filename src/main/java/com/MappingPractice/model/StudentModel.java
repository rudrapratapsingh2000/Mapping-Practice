package com.MappingPractice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_table")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=StudentModel.class,property="studentId")

public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne(cascade = CascadeType.ALL)
    private AddressModel address;
}
