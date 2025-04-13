package com.example.bigdataprojectuit.data.remote.dto

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class Neo4jIdDeserializer : JsonDeserializer<Neo4jId> {
    override fun deserialize(
        json: JsonElement?,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): Neo4jId {
        return if (json != null && json.isJsonObject) {
            val obj = json.asJsonObject
            Neo4jId(
                low = obj["low"].asLong,
                high = obj["high"].asLong,
                unsigned = obj["unsigned"].asBoolean
            )
        } else {
            val id = json?.asLong ?: 0L
            Neo4jId(low = id, high = 0L, unsigned = false)
        }
    }
}
