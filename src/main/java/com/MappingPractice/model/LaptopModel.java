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
@Table(name="laptop_table")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=LaptopModel.class,property="laptopId")

public class LaptopModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne(cascade = CascadeType.ALL)
    private StudentModel student;
}
