package com.example.jobsitychallenge.service;

import com.example.jobsitychallenge.dto.ExternalContactResponseDTO;
import com.example.jobsitychallenge.feign.ContactFeignClient;
import com.example.jobsitychallenge.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ContactService {

    private final ContactFeignClient contactFeignClient;

    public ContactService(ContactFeignClient contactFeignClient) {
        this.contactFeignClient = contactFeignClient;
    }

    public List<Contact> getAllContacts(Integer page) {
        log.info("Fetching contacts from external API with total pages: {}", page);
        ExternalContactResponseDTO response = contactFeignClient.getContacts(page);

        log.info("Building response from external API with total of contacts: {}", response.getContacts().size());
        return response.getContacts().stream()
                .map(Contact::toContact)
                .collect(Collectors.toList());

    }
}