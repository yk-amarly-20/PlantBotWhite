package com.plantbot.white.utils

fun trimming(str: String): String {
    var strDropped = str.drop(1)
    strDropped = strDropped.dropLast(1)

    return strDropped
}
