package com.pbyoungju.develop.controller

import com.pbyoungju.develop.domain.Member
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/keypad")
class KeypadController {

    private val logger = LoggerFactory.getLogger(javaClass)

    @PostMapping("/registrationNumber")
    suspend fun registrationNumber(@RequestBody request: KeypadPersonalInfo): ResponseEntity<Any> {
        logger.info("entrance registrationNumber")

        val member = Member(
            id = request.id,
            username = request.username,
            personalNum = request.personalInfo.personalNum
        )

        val response = CommonResponse(CommonStatus.SUCCESS, member)
        return ResponseEntity.ok().body(response)
    }
}
