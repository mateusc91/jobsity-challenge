package com.example.jobsitychallenge.dto;

import lombok.Data;
import java.util.List;

@Data
public class ExternalContactResponseDTO {
    private List<ExternalContactDTO> contacts;
}