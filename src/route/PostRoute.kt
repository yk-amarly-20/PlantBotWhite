package com.plantbot.white.route

import io.ktor.application.call
import io.ktor.routing.*
import io.ktor.locations.*
import io.ktor.response.respondText
import io.ktor.http.HttpStatusCode
import twitter4j.TwitterFactory
import twitter4j.StatusUpdate
import com.plantbot.white.locations.*
import com.plantbot.white.model.PlantData

/**
 * ツイートを送信するルーティングを行う
 */
fun Route.postTweetRouting() {
    get<PostTweet> { postTweet ->

        val plant = PlantData(postTweet.id)
        val body = "名前: " + plant.name + "\n学名: " + plant.latinName + "\n見頃の季節: " +
                plant.season + "\n属: " + plant.genus
        val image = plant.image

        // tweet
        val twitter = TwitterFactory().instance
        val status = twitter.updateStatus(
            StatusUpdate(body).media(image)
        )

        call.respondText(text=body, status=HttpStatusCode.OK)
    }
}
