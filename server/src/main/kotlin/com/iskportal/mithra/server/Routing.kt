package com.iskportal.mithra.server

import com.iskportal.mithra.shared.HelloMessage
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/hello") {
            call.respond(
                HelloMessage(
                    person = "iskportal",
                    message = "Hello, world!"
                )
            )
        }
    }
}
