
/**
 * Clase Cuadrado que hereda de "Rectangulo"
 * 
 * @author Rafael Jesús Nieto Cardador
 *
 */
public class Cuadrado extends Rectangulo implements Comparable<Cuadrado>{
  
  //Constructor
  public Cuadrado(int lado) {
    setAlto(lado);
    setAncho(getAlto());
  }
  
  //Metodos
  /**
   * Compara dos cuadrados y devuelve una cadena dependiendo de si uno es mayor, menor o igual que el otro.
   * @param cuadrado
   * @return String
   */
  public String comparaCuadrados(Cuadrado cuadrado) {
    if (this.getAlto() > cuadrado.getAlto()) {
      return "El primer cuadrado es mayor que el segundo.";
    }else if(this.getAlto() < cuadrado.getAlto()) {
      return "El segundo cuadrado es mayor que el primero.";
    }else {
      return "Ambos cuadrados son iguales.";
    }
  }
  
  public int compareTo(Cuadrado cuadrado) {
    if (this.getAlto() == cuadrado.getAlto()) {
      return 0;
    } else if (this.getAlto() < cuadrado.getAlto()) {
      return -1;
    } else {
      return 1;
    }
  }
  
  public boolean equals(Cuadrado cuadrado) {
    return (getAlto() == cuadrado.getAlto());   
  }
}
