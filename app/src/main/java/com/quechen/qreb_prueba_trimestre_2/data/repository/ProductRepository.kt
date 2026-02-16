package com.quechen.qreb_prueba_trimestre_2.data.repository

import com.quechen.qreb_prueba_trimestre_2.data.model.Product
import com.quechen.qreb_prueba_trimestre_2.data.remote.RetrofitInstance

class ProductRepository {

    suspend fun getProducts(): List<Product> {
        return RetrofitInstance.api.getProductResponse().results;
    }
}