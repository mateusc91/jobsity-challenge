package com.example.jobsitychallenge;

import com.example.jobsitychallenge.dto.ExternalContactDTO;
import com.example.jobsitychallenge.feign.ContactFeignClient;
import com.example.jobsitychallenge.dto.ExternalContactResponseDTO;
import com.example.jobsitychallenge.model.Contact;
import com.example.jobsitychallenge.service.ContactService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class ContactServiceTest {

    @Mock
    private ContactFeignClient contactFeignClient;

    @InjectMocks
    private ContactService contactService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllContacts() {
        ExternalContactResponseDTO mockedResponse = new ExternalContactResponseDTO();
        mockedResponse.setContacts(List.of(new ExternalContactDTO()));

        when(contactFeignClient.getContacts(anyInt())).thenReturn(mockedResponse);

        List<Contact> result = contactService.getAllContacts(2);

        assertEquals(1, result.size());
    }
}