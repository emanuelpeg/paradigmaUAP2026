**Ejercicio 1**  
**Descripción del Ejercicio**  
El restaurante “San Martín” nos contrata para hacer un software que controle los costos de sus platos. Los platos están compuestos por ingredientes los cuales pueden ser platos o ingredientes básicos. Por ejemplo los panqueques con dulce de leche, está compuesto por panqueques (que es un plato) y dulce de leche que es un ingrediente básico.  
   
 El software debe mantener el costo de cada uno de los platos, y el costo está dado por la suma de los costos de los ingredientes (básicos o platos).  
**Ejercicio 2**  
**Descripción del Ejercicio**  
La bicicletería Oro Verde lo contrata para diseñar y desarrollar su sistema de control de precios. Dado que la bicicletería tiene un servicio de armado de bicicletas, donde permite que dado un conjunto de partes armar una bicicleta personalizada, cuyo precio es la suma del precio de las partes. A la vez, la bicicletería vende partes, las cuales tienen un número, una descripción y un precio. Las bicicletas armadas tienen un número y una descripción y el precio está dado por la suma de las partes.  
Por último, la bicicletería tiene ofertas las cuales son un conjunto de partes y/o bicicletas y su precio está dado por la suma de los elementos que lo componen, menos un 20%.  
**Ejercicio 3**  
**Descripción del Ejercicio**  
La empresa Tarjeta Violeta lo contrata para hacer un sistema que mantenga los datos de sus clientes, los clientes pueden ser beneficiarios de la tarjeta, los cuales pueden gastar un monto de dinero por mes, que luego pueden abonar en cuotas. O afiliados, son los negocios en donde el beneficiario realiza una compra y se le debe poder abonar el monto gastado.  
Los datos de los beneficiarios son: cuit, nombre, apellido, dirección y número de cuenta donde se debitarán las cuotas.  
Los datos de los afiliados son: cuit, nombre, apellido, dirección y número de cuenta donde se depositará por mes, lo gastado por los beneficiarios.  
Diseñe un software que permita listar los clientes cargados. Tenga en cuenta que un cliente puede ser beneficiario y afiliado a la vez.  
**Ejercicio 4**  
**Descripción del Ejercicio**  
La embajada de Italia lo contrata para que diseñe un software que permita saber si una persona es apta para recibir la ciudadanía Italiana. Para dicho proceso se cargan los datos de la persona (dni, nombre, apellido y nacionalidad) y los datos de su padre, madre, abuelo, bisabuelo y antepasados que también son personas por lo tanto los datos son los mismos (dni, nombre, apellido y nacionalidad).  
El objetivo es cargar el árbol genealógico de la persona de tal manera de poder analizar si es válido darle la nacionalidad. Los datos del árbol genealógico se cargan hasta encontrarnos con un desconocido, en este caso se detiene la carga de esa rama del árbol.  
Una persona es considerada para el proceso de nacionalidad Italiana, si es Italiana o si al menos el número de sus antepasados Italianos son igual al nivel de antepasados . Por ejemplo si su padre o madre o ambos son italianos (dado que el nivel es 1)  o si tiene 2 o más abuelos italianos o 3 o más bisabuelos, etc.  
Realice un diseño que permita resolver dicho problema y permita saber si una persona es apta para el proceso de ciudadanía.  
**Ejercicio 5**  
**Descripción del Ejercicio**  
La empresa CursoSys lo contrata para desarrollar un software que permita registrar el dictado de su curso. La empresa dicta un curso y tiene diferentes tipos de alumnos:  
1. Alumno invitado: es gratuito y aprueba el curso con una nota mayor a 60 en el examen.  
2. Alumno medio: el cual paga una suscripción y aprueba el curso con 3 exámenes los cuales tienen que tener un promedio mayor a 70.  
3. Alumnos premium: el cual paga una suscripción y aprueba el curso con 5 exámenes los cuales tienen que ser mayores a 70 y tener un promedio mayor a 80%  
El alumno tiene un código, nombre y apellido y las notas dependientes del tipo.  
   
1. Realice un diseño orientado a objetos  
2. Realice una función que liste los alumnos que aprobaron el curso  
3. La empresa necesita una funcionalidad que permita al usuario invitado cambiar a usuario medio o premium.  
**Ejercicio 6**  
**Descripción del Ejercicio**  
El gobierno nacional lo contrata para desarrollar el software que mantiene datos demográficos de la argentina. Los datos son cargados a nivel ciudad, es decir una ciudad tienen un numero de habitantes y se encuentra en un departamento, a la vez el departamento se encuentra en una provincia.  
   
 Argentina no cuenta con más de 23 provincias y la población puede ser calculada como la suma de la población de las provincias.  
   
 La población de las provincias es la suma de la población de los departamentos.  
   
 La población de los departamentos es la suma de la población de las ciudades.  
**Ejercicio 7**  
**Descripción del Ejercicio**  
Es necesario representar una estructura de datos en formato Json. JSON, acrónimo de JavaScript Object Notation, es un formato de texto ligero para el intercambio de datos. JSON es un subconjunto de la notación literal de objetos de JavaScript aunque hoy, debido a su amplia adopción como alternativa a XML, se considera un formato de lenguaje independiente.  
Los elementos en json pueden ser:  
1. Los objetos en notación json comienzan con { y terminan con } y pueden tener atributos y sus valores (los valores pueden ser otro elemento json) puede contener n atributos.  
2. Los arreglos en json comienzan con [ y terminan con ], pueden contener n elementos json separados por coma.  
3. Un valor que es un string.  
Se debe poder modelar una estructura en json e imprimirlo de manera correcta.  
Un ejemplo de una estructura en json:  

```json
   
 {“company” : “Example” ,  
   
 "employees":[  
   
 {"firstName":"John", "lastName":"Doe"},  
   
 {"firstName":"Anna", "lastName":"Smith"},  
   
 {"firstName":"Peter", "lastName":"Jones"}  
   
 ]}  
 ```
 
**Ejercicio 8**  

**Descripción del Ejercicio** 

La empresa vende.sa, con el objetivo de premiar a los buenos vendedores, lo contrata para desarrollar su sistema de puntajes. La empresa otorga un conjunto de puntos a sus vendedores por las ventas realizadas. Estos puntos se van acumulando y se traducen en un premio monetario a fin de mes. Las categorías de vendedores son las siguientes : 

    • Vendedor junior (de 0 a 100 puntos) no tiene beneficios. 
    • Vendedor semisenior  (de 101 a 500 puntos) tiene un premio de 2000 pesos. 
    • Vendedor senior (de 501 puntos en adelante) tiene un premio de 2000 pesos más el 1% de sus ventas realizadas.

La información del vendedor es número, nombre, cantidad de puntos y ventas realizadas en pesos. 

a)  Realice el diseño de la solución e implemente las clases que permitan, dado un número de vendedor, saber cuánto premio tiene. 
b)  Realice una funcionalidad que permita agregar puntos a un vendedor y, si corresponde, cambiar de categoría. 
c) Imprima por pantalla todos los vendedores y su premio.
