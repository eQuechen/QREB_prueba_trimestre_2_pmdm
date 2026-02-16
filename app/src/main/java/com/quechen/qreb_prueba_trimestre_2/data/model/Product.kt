package com.quechen.qreb_prueba_trimestre_2.data.model

import com.google.gson.annotations.SerializedName

data class Product (
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val category: String,
    @SerializedName("image")
    val image: String,
    val active: Boolean
)