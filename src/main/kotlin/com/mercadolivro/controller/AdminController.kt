package com.mercadolivro.controller

import org.springframework.web.bind.annotation.*
@RestController
@RequestMapping("admin")
class AdminController(
) {

    @GetMapping("/reports")
    fun report(): String {
        return "this is a report only for admin"
    }
}