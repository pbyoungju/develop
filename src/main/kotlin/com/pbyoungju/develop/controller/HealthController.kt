package com.pbyoungju.develop.controller

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class HealthController {

    private val logger = LoggerFactory.getLogger(javaClass)

    @GetMapping("/l7check")
    suspend fun l7check() : ResponseEntity<Any> {
        logger.info("entrnace l7check")
        val response = CommonResponse(CommonStatus.SUCCESS, null)
        return ResponseEntity.ok().body(response)
    }
}