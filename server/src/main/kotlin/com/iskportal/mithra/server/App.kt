package com.iskportal.mithra.server

import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8081) {
        configureMonitoring()
        configureFrameworks()
        configureRouting()
    }.start(wait = true)
}