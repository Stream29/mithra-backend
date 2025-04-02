package com.iskportal.mithra.server

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.callid.*
import io.ktor.server.plugins.calllogging.*

fun Application.configureMonitoring() {
    install(CallId) {
        header(HttpHeaders.XRequestId)
        verify { it.isNotEmpty() }
    }
    install(CallLogging) {
        callIdMdc("call-id")
    }
}
