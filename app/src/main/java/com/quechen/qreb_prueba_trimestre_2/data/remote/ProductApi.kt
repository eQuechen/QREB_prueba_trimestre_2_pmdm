package com.quechen.qreb_prueba_trimestre_2.data.remote

import com.quechen.qreb_prueba_trimestre_2.data.model.dto.response.ProductResponse
import retrofit2.http.GET

interface ProductApi {

    @GET(value = "api/products")
    suspend fun getProductResponse(): ProductResponse;
}