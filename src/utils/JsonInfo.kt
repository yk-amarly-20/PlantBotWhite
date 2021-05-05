package com.plantbot.white.utils

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File
import java.io.FileNotFoundException

/**
 * jaonデータを読み込む
 */
fun getJsonInfo(jsonPath: String): JsonNode? {
    val objectMapper = ObjectMapper()
    try {
        return objectMapper.readTree(File(jsonPath))
    } catch (e: FileNotFoundException) {
        println(e)
        return null
    }
}


