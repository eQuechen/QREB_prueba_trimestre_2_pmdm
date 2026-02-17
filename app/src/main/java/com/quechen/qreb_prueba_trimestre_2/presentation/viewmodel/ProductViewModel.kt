package com.quechen.qreb_prueba_trimestre_2.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quechen.qreb_prueba_trimestre_2.data.model.Product
import com.quechen.qreb_prueba_trimestre_2.data.repository.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {

    private val repository = ProductRepository()

    var products by mutableStateOf<List<Product>>(emptyList())
        private set

    var isLoading by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    init {
        fetchProducts()
    }

    fun fetchProducts() {
        viewModelScope.launch {
            isLoading = true
            errorMessage = null
            try {
                products = repository.getProducts();
                if (products == null) throw Exception()
            } catch (e: Exception) {
                errorMessage = e.message ?: "Error al cargar los productos"
            } finally {
                isLoading = false
            }
        }
    }
}