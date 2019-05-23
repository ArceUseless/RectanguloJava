/**
 * Clase de prueba para demostrar el funcionamiento de la clase "Rectangulo"
 * 
 * @author Rafael Jesús Nieto Cardador
 *
 */
public class PruebaRectangulo {
  public static void main(String[] args) {
    System.out.println("Creamos un rectángulo de prueba con los datos correctos e imprimimos su estado.");
    Rectangulo rectangulo1 = new Rectangulo(6, 7);
    System.out.println(rectangulo1);
    
    System.out.println("Ahora creamos un rectángulo con medidas incorrectas.");
    try {
      Rectangulo rectangulo2 = new Rectangulo(0, 12);
    }catch(ArithmeticException ae) {
      System.out.println("ArithmeticException: Parámetro fuera de rango.");
    }
  }

}
