package com.quechen.qreb_prueba_trimestre_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.quechen.qreb_prueba_trimestre_2.ui.screen.ProductsScreen
import com.quechen.qreb_prueba_trimestre_2.ui.theme.QREB_prueba_trimestre_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QREB_prueba_trimestre_2Theme {
                ProductsScreen()
            }
        }
    }
}