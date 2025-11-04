package com.alfa.tienda.componentes

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.Paths

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Tarjeta(producto: Productos) {
    Box(
        modifier = Modifier
            .height(100.dp)
            .width(300.dp)
            .background(color = MaterialTheme.colorScheme.background)
            .border(
                width = 2.dp,
                color = Color.Black,
                shape = RoundedCornerShape(10.dp)
            )
            .padding(4.dp)

    ) {
        Column(
            modifier = Modifier.width(100.dp)
                .fillMaxHeight()
        ) {
            val contexto = LocalContext.current

            var pathsImagen = remember(producto.imagen) {
                contexto.resources.getIdentifier(
                    producto.imagen,
                    "drawable",
                    contexto.packageName
                )
            }

            Box(modifier = Modifier.width(100.dp)
                .fillMaxHeight(),
                contentAlignment = Alignment.Center

            ) {

                Image(
                    painter = painterResource(id = pathsImagen),
                    contentDescription = producto.nombre
                )
            }
        }


        Column(
            modifier = Modifier.offset(x = 100.dp)
                .width(180.dp)
        ) {
            Etiqueta(
                producto.nombre,
                color = MaterialTheme.colorScheme.secondary,
                fontSize = 18.sp,
                modifier = Modifier
            )

            Text(
                producto.descripcion,
                color = MaterialTheme.colorScheme.secondary,
                fontSize = 10.sp,
                modifier = Modifier.padding(start = 10.dp),
                maxLines = 5,
                overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis

            )
        }

    }

}


@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun TarjetaPreview() {
    Tarjeta(productos.get(0))
}