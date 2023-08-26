package com.example.api.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "Health Check API", description = "Swagger Test!")
class HealthCheckController {
    @Operation(description = "health check")
    @GetMapping("/healthCheck")
    fun healthCheck() = "OK"
}
