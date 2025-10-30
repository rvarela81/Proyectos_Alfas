package com.alfa.tienda.componentes

import android.R
import android.R.attr.content
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CampoTexto(titulo: String, borde: Dp) {
    var texto by remember { mutableStateOf("") }
    Column {
        Row {
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                shape = RoundedCornerShape(borde), // bordes redondeados
                value = texto,
                textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Center),
                onValueChange = { texto = it },
                label = { Text(titulo)
                }
            )
        }

    }
}

@Preview
@Composable

fun usuario(){
    CampoTexto("Nombre de usuario", 30.dp)
}
