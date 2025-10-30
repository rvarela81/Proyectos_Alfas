package com.alfa.tienda.paginas

import android.R
import androidx.annotation.Dimension.Companion.DP
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.alfa.tienda.componentes.*
import java.sql.DriverManager.println


@Composable
fun pagLogin(navController: NavController){

    val scrollState = rememberScrollState()


    Box (modifier = Modifier.fillMaxSize())
        {
        Image(painter = painterResource(id = R.drawable.fondo),
            contentDescription = "fondo",
            modifier = Modifier.fillMaxSize())

        Column( modifier = Modifier.fillMaxSize()

        ){
            Spacer(modifier = Modifier.weight(0.02f))
            Row(modifier = Modifier) {
                Etiqueta("Logueate...", color = Color.Blue, fontSize = 35.sp)
            }

            Spacer(modifier = Modifier.weight(0.15f))


            Row( modifier = Modifier.fillMaxWidth(),       // ocupa todo el ancho
                horizontalArrangement = Arrangement.Center,
                // centra horizontalmente
            ) {

                CampoImagen(Usuario = "Usuario")
            }
            Spacer(modifier = Modifier.weight(0.02f))

            Row{

                CampoTexto("Nombre de usuario", 30.dp)
            }
            Spacer(modifier = Modifier.weight(0.02f))

            Row{
                CampoTexto("Contraseña", 30.dp)
            }
            Spacer(modifier = Modifier.weight(0.02f))

            Row (  modifier = Modifier.fillMaxWidth(),       // ocupa todo el ancho
                horizontalArrangement = Arrangement.Center // centra horizontalmente
            ){
                Boton("Iniciar Sesión", onClick = {println("Logeado")})
            }
            Spacer(modifier = Modifier.weight(0.2f))
        }


    }

}



@Preview
@Composable
fun prepagLogin(){
    pagLogin()
}