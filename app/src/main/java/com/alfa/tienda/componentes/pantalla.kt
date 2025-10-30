package com.alfa.tienda.componentes

import android.R.attr.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun CustomScaffold() {
    Scaffold(
        // Barra superior
        topBar = { CustomTopBar() },

        // Barra inferior
        bottomBar = { CustomBottomBar() },


        // Contenido principal
        content = { padding ->
            CustomContent(padding)
        }
    )
}

@Composable
fun CustomContent(x0: PaddingValues) {
    Column(
        // Modificadores de estilo de la columna
        modifier = Modifier
            // Ocupar todo el espacio disponible
            .fillMaxSize()
            .padding(),

        // Contenido de la aplicación
        content = {
            Text(text = "My app content")
        }
    )
}



@Composable
fun CustomBottomBar() {
    BottomAppBar(content = {
        // Contenido de la barra inferior
        Text(text = "Item One")
    })
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar() {
    TopAppBar(
        // Título de la barra superior
        title = { Text(text = "Tienda de Ocio") },
    )
}

@Preview
@Composable
fun CustomScaffoldPreview() {
    CustomScaffold()
}