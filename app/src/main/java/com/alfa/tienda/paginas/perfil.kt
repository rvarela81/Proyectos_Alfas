package com.alfa.tienda.paginas

import androidx.annotation.Dimension.Companion.DP
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.alfa.tienda.componentes.*
import java.sql.DriverManager.println


@Composable
fun pagPerfil() {

    Box(
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Green)

        ) {
            Spacer(modifier = Modifier.weight(0.02f))
            Row(modifier = Modifier) {
                Etiqueta("Perfil", color = Color.Red, fontSize = 40.sp)
            }
            Spacer(modifier = Modifier.weight(0.02f))
            Row(
                modifier = Modifier.fillMaxWidth(),       // ocupa todo el ancho
                horizontalArrangement = Arrangement.Center,
                // centra horizontalmente
            ) {

                CampoImagen(Usuario = "Usuario")
            }

            Spacer(modifier = Modifier.weight(0.02f))
            Row(
                modifier = Modifier.fillMaxWidth(),       // ocupa todo el ancho
                horizontalArrangement = Arrangement.Center,
                // centra horizontalmente
            ) {

                Etiqueta("Nombre Usuario", color = Color.Black, fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.weight(0.02f))

            Row {

                Etiqueta("Correo", color = Color.Black, fontSize = 24.sp)

            }
            Spacer(modifier = Modifier.weight(0.02f))

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,

            ){

              Boton("CAMBIO DE CONTRASEÑA") { }
            }
            Spacer(modifier = Modifier.weight(0.02f))

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,

                ){

                Boton("ELIMINAR CUENTA") { }
            }

            Spacer(modifier = Modifier.weight(0.2f))
        }


    }

}


@Preview
@Composable
fun prepagPerfil() {
    pagPerfil()

}