package com.example.api.service

import com.example.api.dto.UserRequest
import com.example.domain.entity.User
import com.example.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository
) {
    fun createUser(request: UserRequest): User {
        val user = User(
            name = request.name,
            age = request.age,
            description = request.description,
        )
        return userRepository.save(user)
    }

    fun getAllUser(): List<User> {
        return userRepository.findAll().toList()
    }
}
