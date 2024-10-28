//package com.example.jobsitychallenge;
//
//import com.example.jobsitychallenge.controller.ContactController;
//import com.example.jobsitychallenge.model.Contact;
//import com.example.jobsitychallenge.service.ContactService;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.List;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(ContactController.class)
//public class ContactControllerTests {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private ContactService contactService;
//
//    @Test
//    public void testGetAllContacts_WithPageParameter() throws Exception {
//        when(contactService.getAllContacts(any())).thenReturn(List.of(new Contact("John", "Doe")));
//
//        mockMvc.perform(get("/contacts?page=1"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void testGetAllContacts_NoPageParameter() throws Exception {
//        when(contactService.getAllContacts(null)).thenReturn(List.of(new Contact("Jane", "Smith")));
//
//        mockMvc.perform(get("/contacts"))
//                .andExpect(status().isOk());
//    }
//}}
