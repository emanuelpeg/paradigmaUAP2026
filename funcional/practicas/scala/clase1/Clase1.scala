object Clase1 {

  /**
   * Ejercicio -2
   *
   * Defina una función que calcule el cuadrado de un número
   */
  def cuadrado(n: Long): Long = ???

  /**
   * Ejercicio -1
   *
   * Defina una función que calcule la enésima potencia positiva de un número
   */
  def potencia(n: Long, v: Int): Long = ???

  /**
   * Ejercicio 0
   *
   * Realice una función que calcule el enesimo numero de fibonacci
   */
  def factorial(n: Long): Long = ???


  def fibonacci(n: Int): Long = ???

  /**
   * Ejercicio 2
   * Realice una funcion que dado el numero de fila y columna,
   * calcule el valor del numero que se encuentre el la piramide de Pascal
   */
  def pascal(c: Int, r: Int): Int = ???

  /**
   * Ejercicio 3
   * Realice una función que permita saber si un texto tiene los parentesis balanceados, por ejemplo:
   * () => OK
   * ((()))() => OK
   * (()()) => OK
   * (()())) => no OK
   * (()(()) => no OK
   * )( => no OK
   */
  def balance(chars: List[Char]): Boolean = ???

  /**
   * Ejercicio 4
   * Realice una función que cuente cuantas combinaciones pueden existir con monedas para un valor determinado, por ejemplo:
   * monedas (1,2) y valor es 4 , podemos llegar con las siguientes convinaciones (1,1,1,1) (1,1,2) (2,2)
   * por lo que la función debería retornar 3.
   */
  def countChange(money: Int, coins: List[Int]): Int = ???

  /**
   * Ejercicio 5
   * Realice una función que indique si una lista de letras es palindromo
   * () -> true
   * ('a','l','a') -> true
   * ('a','l','l','a') -> true
   * ('h','a','l','l','a') -> false
   */
  def isPalindrome(word: List[Char]): Boolean = ???
  

/**
 * Ejercicio 6
 * Realice una función que permita determinar si todos los elementos de una lista
 * son números pares, por ejemplo:
 *
 * List(2,4,6,8) => true
 * List(2,4,5,8) => false
 * List() => true
 */
def allEven(numbers: List[Int]): Boolean = ???


/**
 * Ejercicio 7
 * Realice una función que permita calcular la suma de todos los elementos de una lista,
 * por ejemplo:
 *
 * List(1,2,3,4) => 10
 * List(5,5,5) => 15
 * List() => 0
 */
def sum(numbers: List[Int]): Int = ???

/**
 * Ejercicio 8
 * Realice una función que permita determinar cuantos elementos tiene una lista
 */
def count[A](list: List[A]): Int = ???

/**
 * Ejercicio 9
 * Realice una función que permita determinar cuántas veces aparece un elemento
 * determinado dentro de una lista, por ejemplo:
 *
 * lista: List(1,2,3,2,4,2)
 * elemento: 2
 * resultado: 3
 *
 * lista: List('a','b','a','c')
 * elemento: 'a'
 * resultado: 2
 */
def count[A](element: A, list: List[A]): Int = ???


/**
 * Ejercicio 10
 * Realice una función que permita obtener el elemento máximo de una lista de números,
 * por ejemplo:
 *
 * List(1,5,3,2) => 5
 * List(10,2,8,20,4) => 20
 */
def max(numbers: List[Int]): Int = ???


/**
 * Ejercicio 11
 * Realice una función que permita determinar si un elemento pertenece a una lista,
 * por ejemplo:
 *
 * List(1,2,3,4), buscar 3 => true
 * List(1,2,3,4), buscar 8 => false
 * List('a','b','c'), buscar 'b' => true
 */
def contains[A](element: A, list: List[A]): Boolean = ???


/**
 * Ejercicio 12
 * Realice una función que permita obtener los números mayores que un determinado valor,
 * por ejemplo:
 *
 * List(1,5,8,2,10), mayores que 5 => List(8,10)
 * List(10,20,3,4), mayores que 15 => List(20)
 */
def greaterThan(numbers: List[Int], value: Int): List[Int] = ???


}
