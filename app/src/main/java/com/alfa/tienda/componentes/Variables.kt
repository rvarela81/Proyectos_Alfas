package com.alfa.tienda.componentes

enum class Sexo{
    HOMBRE,
    MUJER,
    INDEFINIDO
}

class DatosUsuario(
    val nombre: String,
    val apellidos: String,
    val sexo: Sexo,
    val email: String,
    val telefono: String,
    val imagen: String = "usuario"
)

class Entrada_Imagen(
    val id: Int,
    val Descripcion: String
)

class Productos(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val imagen: String,
    val precio: Double,
    val stock: Int
)

val productos = arrayOf<Productos>(
    Productos(0, "Bota", "¿Buscas unas botas cómodas y cálidas para tus caminatas en otoño/invierno? Estas botas con forro y suela adherente garantizan tus paseos con tiempo frío: ligeras, resistentes e impermeables.", "bota", 34.99, 10),
    Productos(1, "Tienda", "Tienda de campaña con tejido de protección solar UPF30, que cuenta con estructura domo con autosujeción para desplazar una vez montada y buscar el mejor lugar de descanso. Impermeable.", "tienda", 44.99 , 20),
    Productos(2, "Casco", "Protégete de ramas y golpes. Es fácil de poner gracias a las 2 hebillas debajo de las orejas y a la hebilla debajo de la barbilla. Tiene 15 aireaciones.", "casco", 14.99, stock = 20),
    Productos(3, "Mochila", "Esta mochila es versátil, práctica y elegante para llevar todo lo que necesites.", "mochila", 26.99, stock = 20),
    Productos(4, "Botella", "Cantimplora isoterma 1L para mantener los líquidos calientes o fríos. Más ligera que una botella isoterma clásica. Tapón de rosca, apertura fácil, con filtro integrado.", "botella", 16.99, stock = 20),
    Productos(5, "Saco Impermeable", "Este saco lastrado es muy cómodo y evita que te hagas daño gracias a su material flexible. Es ideal para iniciarse en la musculación y el cross training gracias a su facilidad de agarre.", "sacoimpermeable", 24.99, stock = 20),

)

var datosUsuario = DatosUsuario(
    nombre = "ruben",
    apellidos = "varela",
    sexo = Sexo.HOMBRE,
    email = "ruben@varela.es",
    telefono = "666666666"
)