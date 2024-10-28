package com.example.jobsitychallenge.feign;

import com.example.jobsitychallenge.dto.ExternalContactDTO;
import com.example.jobsitychallenge.dto.ExternalContactResponseDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "contactFeignClient", url = "${external-api.url}",configuration = FeignClientConfig.class)
public interface ContactFeignClient {

    @GetMapping
    ExternalContactResponseDTO getContacts(@RequestParam(value = "page", required = false) Integer page);
}
