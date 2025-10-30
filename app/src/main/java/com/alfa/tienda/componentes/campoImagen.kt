package com.alfa.tienda.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alfa.tienda.R

@Composable
fun CampoImagen(Usuario: String) {
    Box(
        modifier = Modifier
            .size(120.dp) // tamaño del círculo
            .background(color = Color.Cyan, shape = CircleShape)


    ) {
    Image(imageVector = ImageVector.vectorResource(id = R.drawable.usuario),
        contentDescription = Usuario,
        modifier = Modifier.size(90.dp)
            .align(Alignment.Center),
        contentScale = ContentScale.Fit
    )
}}

@Preview
@Composable
fun CampoImagenPreview() {
    CampoImagen(Usuario = "Usuario")
}

