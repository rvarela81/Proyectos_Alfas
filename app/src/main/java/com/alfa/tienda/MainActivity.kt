package com.alfa.tienda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.alfa.tienda.paginas.pagLogin
import com.alfa.tienda.ui.theme.TiendaTheme
import androidx.compose.material3.IconButton
import androidx.compose.runtime.remember
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu

import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.alfa.tienda.paginas.PagBienvenido
import com.alfa.tienda.componentes.DatosUsuario
import com.alfa.tienda.componentes.Productos
import com.alfa.tienda.componentes.productos
import com.alfa.tienda.componentes.datosUsuario
import com.alfa.tienda.paginas.pagListado
import com.alfa.tienda.paginas.pagPerfil

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TiendaTheme {
                var paginaActual = remember { mutableIntStateOf(0) }
                Scaffold(
                    topBar = { TopBar(paginaActual = paginaActual) },
                    ) { padding ->
                    Box(modifier = Modifier.padding(padding)) {
                        PaginaActual(paginaActual, datosUsuario, productos)
                    }

                }
            }
        }
    }
}

@Composable
fun PaginaActual(paginaActual: MutableState<Int>, datosUsuario: DatosUsuario, lista: Array<Productos>) {
    when (paginaActual.value) {
        0 -> pagLogin()
        1 -> PagBienvenido(datosUsuario)
        2 -> pagListado(lista)
        3 -> pagPerfil(datosUsuario)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(paginaActual: MutableIntState) {
    var menuAbierto by remember { mutableStateOf(false) }

    TopAppBar(modifier = Modifier.fillMaxWidth(), title = { Text("Tienda") }, navigationIcon = {
        IconButton(onClick = { menuAbierto = true }) {
            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
        }
        DropdownMenu(
            expanded = menuAbierto, onDismissRequest = { menuAbierto = false }) {
            DropdownMenuItem(text = { Text("Login") }, onClick = {
                menuAbierto = false
                paginaActual.value = 0
            })
            DropdownMenuItem(text = { Text("BIenvenido") }, onClick = {
                menuAbierto = false
                paginaActual.value = 1
            })
            DropdownMenuItem(text = { Text("Listado") }, onClick = {

                menuAbierto = false
                paginaActual.value = 2
            })
            DropdownMenuItem(text = { Text("Perfil") }, onClick = {

                menuAbierto = false
                paginaActual.value = 3
            })
        }
    })
}


