package com.example.jetpack

import android.os.Bundle
import android.widget.Space
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.ui.theme.JetPackTheme
import com.example.jetpack.ui.theme.Purple200

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {

                HolaMundos()
                Divider(color = Color.Black)
                Text(text = "Prueba 1")
                Divider(color = Color.Black)
                Text(text = "Prueba 2")
                Divider(color = Color.Black)
                Text(text = "Prueba 3")

            }
        }
    }

    @Composable
    fun HolaMundos() {


            Text(text = "hola", fontSize = 25.sp)

    }

    @Composable
    fun MyApp(content: @Composable() () -> Unit) {

        JetPackTheme() {
            Surface(color = Color.Cyan) {

                Column() {
                    content()
                }
            }
        }
    }
}
  