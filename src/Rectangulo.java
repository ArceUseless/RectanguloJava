/**
 * Clase rectángulo
 * 
 * Atributos:
 *   ancho: Entero que almacena la anchura del rectángulo
 *   alto: Entero que almacena la altura del rectángulo
 * 
 * @author Rafael Jesús Nieto Cardador
 *
 */
public class Rectangulo {
  
  //Atributos
  
  private int ancho;
  private int alto;
  
  //Constructores
  
  public Rectangulo() {}
  
  public Rectangulo(int an, int al) {
    setAncho(an);
    setAlto(al);
  }
  
  //Getters
  
  /**
   * Getter para ancho
   * @return int
   */
  public int getAncho() {
    return this.ancho;
  }
  
  /**
   * Getter para alto
   * @return int
   */
  public int getAlto() {
    return this.alto;
  }
  
  //Setters
  
  /**
   * Setter para ancho
   * @param an
   * @throws ArithmeticException
   */
  public void setAncho(int an) throws ArithmeticException {
    if(validaParametros(an)) {
      this.ancho = an;
    }else {
      throw new ArithmeticException();
    }
  }
  
  /**
   * Setter para alto
   * @param al
   * @throws ArithmeticException
   */
  public void setAlto(int al) throws ArithmeticException {
    if(validaParametros(al)) {
      this.alto = al;
    }else {
      throw new ArithmeticException();
    }
  }
  
  //Metodos
  
  /**
   * Valida el parámetro que se pasa como argumento
   * @param parametro
   * @return boolean
   */
  boolean validaParametros(int parametro) {
    if(parametro <= 0 || parametro >10) {
      return false;
    }else {
      return true;
    }
  }
  
  /**
   * Devuelve el estado del objeto Rectangulo
   * @return String
   */
  @Override
  public String toString() {
    String cadena = "";
    for(int i = 0; i<this.alto; i++) {
      for(int j = 0; j<this.ancho; j++) {
        if(i == 0 || i == this.alto-1) {
          cadena += "##";
        }else if(j == 0 || j == this.ancho-1) {
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
