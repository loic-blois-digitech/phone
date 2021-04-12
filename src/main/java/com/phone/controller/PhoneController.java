package com.phone.controller;

import com.phone.entity.Phone;
import com.phone.repository.PhoneRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PhoneController {

    private PhoneRepository repository;

    public PhoneController(PhoneRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/phones")
    public List<Phone> getPhoneList() {
        return this.repository.findAll();
    }
}