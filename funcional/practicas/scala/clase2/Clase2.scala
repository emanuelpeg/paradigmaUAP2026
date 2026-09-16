object Clase2 {

  /**
   * Buscar
   * Dada una lista y una función de comparación, devuelve el valor que cumple la condición.
   */
  def buscar(lista: List[Int], com: (Int, Int) => Boolean): Int = ???


  /*
   * Busca el Maximo
   */
  def max(lista: List[Int]): Int = ???

  /*
   * Busca el minimo
   */
  def min(lista: List[Int]): Int = ???

  // filtra la lista de valores mayores que el valor e pasado por parametro
  def maximos(lista: List[Int], e: Int): List[Int] = ???

  // filtra la lista de valores menores que el valor e pasado por parametro
  def minimos(lista: List[Int], e: Int): List[Int] = ???

  // Ordena los valores de una lista utilizando quicksort
  def QuickSort(xs: List[Int]): List[Int] = ???

  /**Obtiene un elemento en la posición n */
  def ObtenerElemento(lista: List[Int], posicion: Int): Int = ???

  /**
   * Busca la mediana
   * En el ámbito de la estadística, la mediana representa el
   * valor de la variable de posición central en un conjunto de datos ordenados.
  */
  def mediana(lista: List[Int]): Int = ???


  /**
   * Cuenta los elementos
   */
  def contar(lista: List[Int]): Int = ???

  // Acumula los elementos
  def acc(lista: List[Int]): Int = ???

  /**
   * Filtra los elementos de la lista xs segun la funcion p
   */
  def filtrar(xs: List[Int], p: Int => Boolean): List[Int] = ???

  /**
   * Filtra los elementos pares usando filtrar utilizando la función Filtrar
   */
  def filtrarPares(xs: List[Int]): List[Int] = ???

  /**
   * Filtra los elementos multiplos de 3 usando filtrar
   */
  def filtrarMultiplosDeTres(xs: List[Int]): List[Int] = ???

  /**
   * Acumula los elementos aplicandoles fx
   */
  def acumular(lista: List[Int])(fx: (Int) => Int): Int = ???


  /**
   * Acumula todos los elementos de una lista usando acumular
   */
  def acumularUnidad(lista: List[Int]): Int = ???

  /**
   * Acumula  el dobles de los elementos de una lista usando acumular
   */
  def acumularDoble(lista: List[Int]): Int = ???

  /**
   * Acumula el cuadrado de los elementos de una lista usando acumular
   */
  def acumularCuadrado(lista: List[Int]): Int = ???

  /**
   * Une 2 listas pasada por parametros
   */
  def unir(lista: List[Int], otraLista: List[Int]): List[Int] = ???

  /**
   * Transforma la lista a un lista de otro tipo
   */
  def transformar[T](lista: List[Int], fx: (Int) => (T)): List[T] = ???

  /**
   * retorna true si un elemento existe en la lista
   */
  def existe(lista: List[Int], nro: Int): Boolean = ???

  /**
   * Une 2 listas pasada por parametros pero ignora los repetidos
   */
  def unirOfSet(lista: List[Int], otraLista: List[Int]): List[Int] = ???

  /*******************************
  * Opcional
   * Dada una lista de enteros retorna una lista con todas las posibles subconjuntos
   * Por ejemplo : (1,2,3) -> ((),(1),(2),(3),(1,2),(1,3), (1,2,3), (2,3))
  ********************************/
  def subSets(lista: List[Int]): List[List[Int]] = ???

  /** *****************************
   * Opcional
   * Dada una lista de enteros y un numoro entero n, retorne subconjuntos con n elementos
   * Ej> (1,2,3,4,5) y 2 -> ((1,2), (3,4), (5))
   * ****************************** */
  def cortar(lista: List[Int], n : Int): List[List[Int]] = ???


}
