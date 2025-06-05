package com.asoom.donuts

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Scaffold
import com.asoom.donuts.ui.screens.HomeDonutsScreen
import com.asoom.donuts.ui.screens.ItemDetailsScreen
import com.asoom.donuts.ui.theme.DonutsTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        enableEdgeToEdge()
        setContent {
            DonutsTheme {
                Scaffold(contentWindowInsets = WindowInsets.systemBars) {
                   // SplashScreen()
                     HomeDonutsScreen()
                    // ItemDetailsScreen()
                }
            }
        }
    }
}
