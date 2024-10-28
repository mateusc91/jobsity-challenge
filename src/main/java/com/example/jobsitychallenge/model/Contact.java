package com.example.jobsitychallenge.model;

import com.example.jobsitychallenge.dto.ExternalContactDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private Long id;
    private String name;
    private String email;
    private String source;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public static Contact toContact(ExternalContactDTO externalContact) {
        return Contact.builder()
                .id(externalContact.getId())
                .name(externalContact.getName())
                .email(externalContact.getEmail())
                .source("KENECT_LABS")
                .createdAt(externalContact.getCreatedAt())
                .updatedAt(externalContact.getUpdatedAt())
                .build();
    }
}
