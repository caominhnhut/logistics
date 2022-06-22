package com.logistics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController{

    @GetMapping
    public String getAddress(String billId){
        return "The shipping address for "+billId+" is: So 2, Nguyen The Loc, P13, Tan Binh.";
    }
}
