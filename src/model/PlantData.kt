package com.plantbot.white.model

import com.plantbot.white.imagePath
import com.plantbot.white.utils.getJsonInfo
import com.plantbot.white.jsonPath
import com.plantbot.white.utils.loadPlantImage
import com.plantbot.white.utils.trimming

// plantのjsonデータ
val jsonInfo = getJsonInfo(jsonPath)

/**
 * plantモデル
 * ツイートの際にidをurlで指定し、そのidに対応するplantのデータをpostする
 */
public class PlantData(id: Int) {
    val plant = jsonInfo!!.get(id)
    val name = trimming(plant.get("name").toString())
    val latinName = trimming(plant.get("latin_name").toString())
    val season = trimming(plant.get("season").toString())
    val genus = trimming(plant.get("genus").toString())

    // 画像
    val whitePath = imagePath + "/white_${id}.jpg"
    val image = loadPlantImage(whitePath)
}