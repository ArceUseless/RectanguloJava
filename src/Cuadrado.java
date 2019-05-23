
/**
 * Clase Cuadrado que hereda de "Rectangulo"
 * 
 * @author Rafael Jes�s Nieto Cardador
 *
 */
public class Cuadrado extends Rectangulo{
  
  private int lado;
  
  //Constructor
  public Cuadrado(int lado) {
    setLado(lado);
  }
  
  private void setLado(int lado) {
    if(validaParametros(lado)) {
      this.lado = lado;
    }else {
      throw new ArithmeticException();
    }
  }
  
  public int getLado() {
    return this.lado;
  }
  
  //Metodos
  /**
   * Compara dos cuadrados y devuelve una cadena dependiendo de si uno es mayor, menor o igual que el otro.
   * @param cuadrado
   * @return String
   */
  public String comparaCuadrados(Cuadrado cuadrado) {
    if (this.getLado() > cuadrado.getLado()) {
      return "El primer cuadrado es mayor que el segundo.";
    }else if(this.getLado() < cuadrado.getLado()) {
      return "El segundo cuadrado es mayor que el primero.";
    }else {
      return "Ambos cuadrados son iguales.";
    }
  }
  
  @Override
  public String toString() {
    String cadena = "";
    for(int i = 0; i<this.lado; i++) {
      for(int j = 0; j<this.lado; j++) {
        if(i == 0 || i == this.lado-1) {
          cadena += "##";
        }else if(j == 0 || j == this.lado-1) {
          cadena += "##";
        }else {
          cadena += "  ";
        }
      }
      cadena += "\n";
    }  
    return cadena;
  }

}
