package com.MappingPractice.service;

import com.MappingPractice.model.LaptopModel;
import com.MappingPractice.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    LaptopRepo laptopRepo;

    public void addLaptop(LaptopModel laptop) {
        laptopRepo.save(laptop);
    }

    public List<LaptopModel> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public void deletelaptop(String number) {
        laptopRepo.deleteById(number);
    }

    public void updateLaptop(String number, LaptopModel laptopModel) {
        LaptopModel laptopModel1=laptopRepo.findById(number).orElse(null);
        laptopModel1.setBrand(laptopModel.getBrand());
        laptopModel1.setName(laptopModel.getName());
        laptopModel1.setStudent(laptopModel.getStudent());
        laptopModel1.setPrice(laptopModel.getPrice());
        laptopRepo.save(laptopModel1);
    }
}
