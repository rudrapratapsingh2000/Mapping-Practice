package com.MappingPractice.service;

import com.MappingPractice.model.AddressModel;
import com.MappingPractice.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public void addAddress(AddressModel address) {
        addressRepo.save(address);
    }

    public List<AddressModel> getAllAddress() {
        return addressRepo.findAll();
    }

    public void deleteaddress(Long number) {
        addressRepo.deleteById(number);
    }

    public void updateAddress(Long number, AddressModel addressModel) {
        AddressModel addressModel1=addressRepo.findById(number).get();
        addressModel1.setDistrict(addressModel.getDistrict());
        addressModel1.setState(addressModel.getState());
        addressModel1.setZipcode(addressModel.getZipcode());
        addressModel1.setLandmark(addressModel.getLandmark());
        addressModel1.setCountry(addressModel.getCountry());

        addressRepo.save(addressModel1);
    }
}
