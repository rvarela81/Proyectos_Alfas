package com.alfa.tienda.paginas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alfa.tienda.componentes.Boton
import com.alfa.tienda.componentes.CampoImagen
import com.alfa.tienda.componentes.CampoTexto
import com.alfa.tienda.componentes.Etiqueta
import java.sql.DriverManager.println

@Composable
fun PagBienvenido() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()

        ) {
            Spacer(modifier = Modifier.weight(0.02f))
            Row(modifier = Modifier) {
                Etiqueta("BIENVENIDO", color = Color.Black, fontSize = 35.sp)
            }

            Spacer(modifier = Modifier.weight(0.2f))


            Row(
                modifier = Modifier.fillMaxWidth(),       // ocupa todo el ancho
                horizontalArrangement = Arrangement.Center,
                // centra horizontalmente
            ) {

                CampoImagen(Usuario = "Usuario")
            }
            Spacer(modifier = Modifier.weight(0.2f))


            Row {
                Etiqueta("Nombre Usuario", color = Color.Blue, fontSize = 25.sp)
            }


            Spacer(modifier = Modifier.weight(0.2f))
        }


    }

}

@Preview
@Composable
fun prePagBienvenido() {
    PagBienvenido()
}