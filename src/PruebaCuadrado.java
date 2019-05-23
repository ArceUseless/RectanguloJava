/**
* Clase de prueba para demostrar el funcionamiento de la clase "Cuadrado"
* 
* @author Rafael Jesús Nieto Cardador
*
*/
public class PruebaCuadrado {
  public static void main(String[] args) {
    System.out.println("Creamos un cuadrado de prueba con los datos correctos e imprimimos su estado.");
    Cuadrado cuadrado1 = new Cuadrado(6);
    System.out.println(cuadrado1);
    
    System.out.println("\nAhora creamos un cuadrado con medidas incorrectas.");
    try {
      Cuadrado cuadrado3 = new Cuadrado(12);
    }catch(ArithmeticException ae) {
      System.out.println("ArithmeticException: Parámetro fuera de rango.");
    }
    
    System.out.println("\nVamos a crear tres cuadrados:"
        + "\n'cuadrado4' será mayor que 'cuadrado1'."
        + "\n'cuadrado5' será menor que 'cuadrado1'."
        + "\n'cuadrado6' será igual que 'cuadrado1'.\n");
    System.out.println("El método 'compareTo' devuelve:"
        + "\n1 si el primer cuadrado es mayor que el segundo."
        + "\n0 si los dos cuadrados son iguales."
        + "\n-1 si el primer cuadrado es menor que el segundo."
        + "\n\nEl método 'equals' devuelve:"
        + "\ntrue si los dos cuadrados son iguales."
        + "\nfalse si los cuadrados son diferentes.\n");
    
    Cuadrado cuadrado4 = new Cuadrado(7);
    Cuadrado cuadrado5 = new Cuadrado(5);
    Cuadrado cuadrado6 = new Cuadrado(6);
    
    System.out.println("El cuadrado 4 es mayor que el cuadrado 1: "+cuadrado4.compareTo(cuadrado1));
    System.out.println("El cuadrado 5 es menor que el cuadrado 1: "+cuadrado5.compareTo(cuadrado1));
    System.out.println("El cuadrado 6 es igual que el cuadrado 1: "+cuadrado6.equals(cuadrado1));
    
  }

}
