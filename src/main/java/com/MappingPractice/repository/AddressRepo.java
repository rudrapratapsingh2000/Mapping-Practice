package com.MappingPractice.repository;

import com.MappingPractice.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<AddressModel ,Long> {
}
