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
@Table(name="book_table")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=BookModel.class,property="BookId")
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;
    private String title;
    private String author;
    private String description;
    private String price;
    @ManyToOne(cascade = CascadeType.ALL)
    private StudentModel student;
}
