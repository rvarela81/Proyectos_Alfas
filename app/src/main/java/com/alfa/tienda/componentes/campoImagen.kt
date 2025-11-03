package com.alfa.tienda.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
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
fun CampoImagen(Usuario: Sexo) {
    Box(
        modifier = Modifier
            .size(120.dp) // tamaño del círculo
            .background(
                color = MaterialTheme.colorScheme.primaryFixed,
                shape = CircleShape)


    ) {
        var id_imagen: Int

        if(Usuario == Sexo.HOMBRE){
            id_imagen = R.drawable.perfil_hombre
        }else if(Usuario == Sexo.MUJER){
            id_imagen = R.drawable.perfil_mujer


        }else{
            id_imagen = R.drawable.usuario

        }

        var Imagen_Usuario = Entrada_Imagen(
            id = id_imagen,
            Descripcion = "Usuario",

        )
        Cmpnt_Imagen(Imagen_Usuario)
    }
}

@Preview
@Composable
fun CampoImagenPreview() {
    CampoImagen(Usuario = Sexo.MUJER)
}

