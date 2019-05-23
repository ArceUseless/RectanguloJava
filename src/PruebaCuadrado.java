/**
* Clase de prueba para demostrar el funcionamiento de la clase "Cuadrado"
* 
* @author Rafael Jes�s Nieto Cardador
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
    
    Cuadrado cuadrado4 = new Cuadrado(7);
    Cuadrado cuadrado5 = new Cuadrado(5);
    Cuadrado cuadrado6 = new Cuadrado(6);
    
    System.out.println(cuadrado1.comparaCuadrados(cuadrado4));
    System.out.println(cuadrado1.comparaCuadrados(cuadrado5));
    System.out.println(cuadrado1.comparaCuadrados(cuadrado6));
  }

}
