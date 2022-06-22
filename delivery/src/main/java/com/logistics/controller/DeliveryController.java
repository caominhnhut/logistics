package com.logistics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController{

    @GetMapping("/bill/{bill-id}")
    public String delivery(@PathVariable("bill-id") String billId){
        return "Received the bill with id: "+billId;
    }

}
