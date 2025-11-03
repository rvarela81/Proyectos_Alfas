package com.alfa.tienda.componentes

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.alfa.tienda.R



@Composable
fun Cmpnt_Imagen(Entrada_Imagen:Entrada_Imagen){
    Image(
        painter = painterResource(id =Entrada_Imagen.id),
        contentDescription = Entrada_Imagen.Descripcion,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(CircleShape).
        fillMaxSize(),
        alignment = Alignment.Center,



    )
}


@Preview
@Composable
fun Cmpnt_ImagenPreview(){
    var Entrada_Imagen =
        Entrada_Imagen(
            id = R.drawable.usuario,
            Descripcion = "Usuario"
        )

        Cmpnt_Imagen(Entrada_Imagen)

}