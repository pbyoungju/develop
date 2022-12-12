package com.pbyoungju.develop.controller

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class CommonResponse<T>(
    val status: Int,
    val message: String,
    val body: T? = null,
) {
    constructor(status: CommonStatus, body: T?): this(
        status = status.httpStatus.ordinal,
        message = status.message,
        body = body,
    )
}
