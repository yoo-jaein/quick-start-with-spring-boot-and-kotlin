package com.example.api.controller

import com.example.api.dto.UserRequest
import com.example.api.service.UserService
import com.example.domain.entity.User
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "User API", description = "I'm User API!")
@CrossOrigin(origins = ["*"])
@RequestMapping("/api/users")
class UserController(
    val userService: UserService,
) {
    @Operation(description = "Create New User")
    @PostMapping
    fun create(@RequestBody request: UserRequest): User {
        return userService.createUser(request)
    }

    @Operation(description = "View All Users")
    @GetMapping
    fun getAllUser(): List<User> {
        return userService.getAllUser()
    }
}
