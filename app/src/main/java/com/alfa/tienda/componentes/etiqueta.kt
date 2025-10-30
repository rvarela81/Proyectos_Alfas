package com.alfa.tienda.componentes

import android.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Label
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Etiqueta(titulo: String,
             color: Color= Color.Black,
             fontSize: TextUnit = 24.sp){

    Text (  titulo,
        modifier = Modifier.fillMaxWidth(), // necesario para centrar
        textAlign = TextAlign.Center, // centrado horizontal
        style = TextStyle(
            color = color, // color de la letra
            fontSize = fontSize, // tamaño de la letra
            fontWeight = FontWeight.Bold, // grosor
            fontFamily = FontFamily.Serif // tipo de letra
        )
    )
}