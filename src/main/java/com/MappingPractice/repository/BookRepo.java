package com.MappingPractice.repository;

import com.MappingPractice.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BookModel,String> {
}
