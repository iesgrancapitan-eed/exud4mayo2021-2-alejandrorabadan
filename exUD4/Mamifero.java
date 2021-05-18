package pgn.exUD4;

/**
 * Clase mamifero
 * @author alejandro
 *
 */

public class Mamifero {
  /**
   * Entero edad
   */
  private int edad;
  /**
   * String nombre
   */
  protected String nombre;
  /**
   * Constructor mamifero
   */
  public Mamifero() {
    super();
  }
  /**
   * 
   * @param edad Edad del mamifero
   * @throws EdadErroneaException Edad erronea
   */
  public void setAge(int edad) throws EdadErroneaException {
  	if (edad < 0)
  		throw new EdadErroneaException("La edad no puede ser negativa");
  	this.edad = edad;
  }
  /**
   * 
   * @return edad del mamifero
   */
  public int getEdad() {
  	return this.edad;
  }
  /**
   * 
   * @return nombre del mamifero
   */
  public String getNombre() {
  	return nombre;
  }

}
