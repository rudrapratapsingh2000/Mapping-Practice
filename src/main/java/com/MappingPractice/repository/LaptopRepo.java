package com.MappingPractice.repository;

import com.MappingPractice.model.LaptopModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<LaptopModel,String> {
}
