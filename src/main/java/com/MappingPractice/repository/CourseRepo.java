package com.MappingPractice.repository;

import com.MappingPractice.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<CourseModel,String> {
}
