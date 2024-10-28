package com.example.jobsitychallenge.controller;

import com.example.jobsitychallenge.model.Contact;
import com.example.jobsitychallenge.service.ContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts(@RequestParam(value = "page", required = false) Integer page) {
        return contactService.getAllContacts(page);
    }
}
