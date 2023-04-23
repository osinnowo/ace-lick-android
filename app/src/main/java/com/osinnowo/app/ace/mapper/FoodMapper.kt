package com.osinnowo.app.ace.mapper

import com.osinnowo.app.ace.model.entity.FoodEntity
import com.osinnowo.app.ace.model.network.Food
import javax.inject.Inject

class FoodMapper @Inject constructor(): EntityMapper<Food, FoodEntity> {
    override fun mapToEntity(item: Food): FoodEntity {
        return FoodEntity(
            item.content,
            item.id, item.image,
            item.link,
            item.name,
            item.relevance,
            item.type
        )
    }

    override fun mapFromEntity(item: FoodEntity): Food {
        return Food(
            item.content,
            item.id, item.image,
            item.link,
            item.name,
            item.relevance,
            item.type
        )
    }
}