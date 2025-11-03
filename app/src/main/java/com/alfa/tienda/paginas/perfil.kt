package com.alfa.tienda.paginas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.alfa.tienda.MainActivity
import com.alfa.tienda.componentes.*
import kotlinx.coroutines.Dispatchers.Main


@Composable
fun pagPerfil(datosUsuario : DatosUsuario) {

    Box(
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)

        ) {
            Spacer(modifier = Modifier.weight(0.02f))
            Row(modifier = Modifier) {
                Etiqueta("Perfil",
                    color = MaterialTheme.colorScheme.primary, fontSize = 40.sp)
            }
            Spacer(modifier = Modifier.weight(0.02f))
            Row(
                modifier = Modifier.fillMaxWidth(),       // ocupa todo el ancho
                horizontalArrangement = Arrangement.Center,
                // centra horizontalmente
            ) {

                CampoImagen(Usuario = datosUsuario.sexo)
            }

            Spacer(modifier = Modifier.weight(0.02f))
            Row(
                modifier = Modifier.fillMaxWidth(),       // ocupa todo el ancho
                horizontalArrangement = Arrangement.Center,
                // centra horizontalmente
            ) {

                Etiqueta(datosUsuario.nombre, color = Color.Black, fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.weight(0.02f))

            Row {

                Etiqueta(datosUsuario.email, color = Color.Black, fontSize = 24.sp)

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
     pagPerfil(datosUsuario)

}