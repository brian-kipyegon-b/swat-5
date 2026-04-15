package com.example.swat5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.swat5.navigation.AppNavHost
import com.example.swat5.ui.theme.Swat5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Swat5Theme {
                AppNavHost()
            }
        }
    }
}
