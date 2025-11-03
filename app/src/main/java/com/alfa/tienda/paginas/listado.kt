package com.alfa.tienda.paginas


import android.os.Build
import androidx.annotation.IntRange
import androidx.annotation.RequiresApi
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.util.rangeTo
import com.alfa.tienda.componentes.Productos
import com.alfa.tienda.componentes.Tarjeta
import com.alfa.tienda.componentes.productos
import kotlin.arrayOf


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun pagListado(productos: Array<Productos>) {
    var valor by remember { mutableFloatStateOf(0f) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row (modifier = Modifier.fillMaxSize()){
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp)
                            )
            {
                items(productos) { producto ->
                    Tarjeta(producto)
                }
            }



            Slider(
                value = valor,
                onValueChange = { valor = it },
                valueRange = 0f..1f,
                steps = productos.size - 1,
                onValueChangeFinished = {
                    valor = 0f
                },

                modifier = Modifier
                    .fillMaxHeight()
                    .width(40.dp)
                    .rotate(90f)
                    .padding(vertical = 16.dp)
            )
        }
    }
}


@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun PrepagListado() {
    pagListado(productos)
}

