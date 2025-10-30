package com.alfa.tienda.componentes

import androidx.compose.foundation.background
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import java.sql.DriverManager.println

@Composable
fun Boton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick() }
    ) {
        Text(text = text)
    }
}

@Preview
@Composable
fun BotonPreview() {
    Boton(
        "Pulsame",
        onClick = { println("Boton pulsado") }
    )
}