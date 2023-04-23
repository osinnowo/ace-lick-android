package com.osinnowo.app.ace.mapper

interface EntityMapper<T, V> {
    fun mapToEntity(item: T): V
    fun mapFromEntity(item: V): T
}