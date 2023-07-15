package com.MappingPractice.controller;

import com.MappingPractice.model.AddressModel;
import com.MappingPractice.model.StudentModel;
import com.MappingPractice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address-api")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("/add-address")
    public void addAddress(@RequestBody AddressModel address)
    {
        addressService.addAddress(address);
    }

    @GetMapping("/getalladdress")
    List<AddressModel> getAllAddress()
    {

        return addressService.getAllAddress();
    }

    @PutMapping("/update-api/number/{number}")
    public  void updateAddress(@PathVariable Long number, @RequestBody AddressModel addressModel){
        addressService.updateAddress(number,addressModel);
    }
    @DeleteMapping("/deleteaddress/number/{number}")
    public void deleteaddress(@PathVariable Long number)
    {

        addressService.deleteaddress(number);
    }
}
