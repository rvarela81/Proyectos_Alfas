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
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.substring
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.alfa.tienda.R
import com.alfa.tienda.componentes.CampoImagen
import com.alfa.tienda.componentes.Etiqueta
import com.alfa.tienda.componentes.DatosUsuario
import com.alfa.tienda.componentes.datosUsuario


@Composable
fun PagBienvenido(datosUsuario: DatosUsuario) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().
            background(color = MaterialTheme.colorScheme.background)

        ) {
            Spacer(modifier = Modifier.weight(0.02f))
            Row(modifier = Modifier) {
                Etiqueta(
                    titulo = "BIENVENIDO",
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 45.sp)
            }

            Spacer(modifier = Modifier.weight(0.2f))


            Row(
                modifier = Modifier.fillMaxWidth(),       // ocupa todo el ancho
                horizontalArrangement = Arrangement.Center,
                // centra horizontalmente
            ) {

                CampoImagen(Usuario = datosUsuario.sexo)
            }
            Spacer(modifier = Modifier.weight(0.2f))


            Row {

                Etiqueta(
                    titulo = (
                            datosUsuario.nombre + " " +datosUsuario.apellidos.get(0)).toUpperCase(Locale.current),
                    color = MaterialTheme.colorScheme.secondary,
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize
                )
            }


            Spacer(modifier = Modifier.weight(0.2f))
        }


    }

}



@Preview
@Composable
fun prePagBienvenido() {
    PagBienvenido(datosUsuario)
}