package com.plantbot.white.route

import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.application.call
import io.ktor.response.respondRedirect
import com.plantbot.white.plantNum

fun Route.baseRouting() {
    get("/tweet/post") {
        call.respondRedirect("/tweet/${plantNum}")
        plantNum++
    }
}

