package com.example.userservice.config;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Data
@Component
@RequestScope
public class CustomContext {

    private final String correlationId;
    private final Long userId;
    private final String username;
}