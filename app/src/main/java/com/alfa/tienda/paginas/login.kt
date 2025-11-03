package com.alfa.tienda.paginas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alfa.tienda.componentes.*
import java.sql.DriverManager.println


@Composable
fun pagLogin() {

    val scrollState = rememberScrollState()


    Box(modifier = Modifier.fillMaxSize())
    {


        Column(
            modifier = Modifier.fillMaxSize()

        ) {
            Spacer(modifier = Modifier.weight(0.02f))
            Row(modifier = Modifier) {
                Etiqueta("Logueate...", color = Color.Blue, fontSize = 35.sp)
            }

            Spacer(modifier = Modifier.weight(0.15f))


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                // centra horizontalmente
            ) {

                CampoImagen(Usuario = Sexo.INDEFINIDO)
            }
            Spacer(modifier = Modifier.weight(0.02f))

            Row {

                CampoTexto("Nombre de usuario", 30.dp)
            }
            Spacer(modifier = Modifier.weight(0.02f))

            Row {
                CampoTexto("Contraseña", 30.dp)
            }
            Spacer(modifier = Modifier.weight(0.02f))

            Row(
                modifier = Modifier.fillMaxWidth(),       // ocupa todo el ancho
                horizontalArrangement = Arrangement.Center // centra horizontalmente
            ) {
                Boton("Iniciar Sesión", onClick = { println("Logeado") })
            }
            Spacer(modifier = Modifier.weight(0.2f))
        }


    }

}


@Preview
@Composable
fun prepagLogin() {
    pagLogin()
}