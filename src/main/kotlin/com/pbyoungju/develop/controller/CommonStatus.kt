package com.pbyoungju.develop.controller

import org.springframework.http.HttpStatus

enum class CommonStatus(
    val httpStatus: HttpStatus,
    val message: String,
) {
    SUCCESS(HttpStatus.OK, "SUCCESS"),
}