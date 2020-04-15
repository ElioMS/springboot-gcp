package com.ucic.test.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class TestController {

    @GetMapping
    fun index(): ResponseEntity<Any> {
        return ResponseEntity.ok(mapOf("data" to "Hello World"));
    }

}