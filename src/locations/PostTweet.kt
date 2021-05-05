package com.plantbot.white.locations

import io.ktor.locations.Location

/**
 * Location class of posting automatic tweet
 * If accessing "/tweet/{id}", send tweet automatically
 *
 * @property id the unique id of tweet
 * @constructor Operating routing of /tweet/{id}
 */
@Location("/tweet/{id}")
data class PostTweet(val id: Int)

