package com.MappingPractice.controller;

import com.MappingPractice.model.AddressModel;
import com.MappingPractice.model.LaptopModel;
import com.MappingPractice.model.StudentModel;
import com.MappingPractice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("/add-laptop")
    public void addLaptop(@RequestBody LaptopModel laptop)
    {
        laptopService.addLaptop(laptop);
    }

    @GetMapping("/getall-laptops")
    List<LaptopModel> getAllLaptops() {
        return laptopService.getAllLaptops();
    }
    @PutMapping("/update-api/number/{number}")
    public  void updateLaptop(@PathVariable String number, @RequestBody LaptopModel laptopModel){
        laptopService.updateLaptop(number,laptopModel);
    }
    @DeleteMapping("/deletelaptop/number/{number}")
    public void deleteLaptop(@PathVariable String number)
    {
        laptopService.deletelaptop(number);
    }
    }
