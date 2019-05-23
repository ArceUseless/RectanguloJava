
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
  
  public void setLado(int lado) {
    setAlto(lado);
    setAncho(getAlto());
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
