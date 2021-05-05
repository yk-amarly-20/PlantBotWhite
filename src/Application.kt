package com.plantbot.white

import com.plantbot.white.route.postTweetRouting
import io.ktor.application.*
import io.ktor.routing.*
import io.ktor.client.*
import io.ktor.client.engine.apache.*
import io.ktor.locations.*

const val baseResourcesPath = "./resources"
const val textPath = baseResourcesPath + "/text"
const val jsonPath = textPath + "/info.json"
const val imagePath = baseResourcesPath + "/image"

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module() {
    val client = HttpClient(Apache) {
    }

    install(Locations)

    routing {
        postTweetRouting()
    }
}

