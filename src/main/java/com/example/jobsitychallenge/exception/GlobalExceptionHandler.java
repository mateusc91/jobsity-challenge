package com.example.jobsitychallenge.exception;

import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Handler para FeignException
    @ExceptionHandler(FeignException.class)
    public ResponseEntity<Map<String, Object>> handleFeignStatusException(FeignException ex) {
        Map<String, Object> errorResponse = new HashMap<>();

        // Extrai informações do FeignException
        int status = ex.status();

        // Monta uma mensagem de erro personalizada
        errorResponse.put("status", status);
        errorResponse.put("error", HttpStatus.valueOf(status).getReasonPhrase());
        errorResponse.put("message", "An issue occurred during the request, please contact support.");
        errorResponse.put("timestamp", LocalDateTime.now());

        // Retorna uma resposta com o código de status correspondente
        return ResponseEntity.status(status).body(errorResponse);
    }
}