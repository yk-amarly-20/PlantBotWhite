package com.plantbot.white.utils

import java.nio.file.FileSystems
import java.io.File
import java.io.FileNotFoundException

fun loadPlantImage(imagePath: String): File? {
    try {
        val fileSystem = FileSystems.getDefault()
        val path = fileSystem.getPath(imagePath)

        return path.toFile()
    } catch (e: FileNotFoundException) {
        println(e)
        return null
    }
}