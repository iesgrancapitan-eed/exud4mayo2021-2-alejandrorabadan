package pgn.exUD4;
/**
 * Clase Gato
 * @author alejandro
 *
 */
public class Gato extends Mamifero {
  /**
   * Miau
   */
  private static final String MIAUUUUUUUUUUUUU = "Miauuuuuuuuuuuuu";
  /**
   * 
   * @param nombre Nombre del gato
   * @param edad Edad del gato
   * @throws EdadErroneaException Si la edad es erronea
   */
  public Gato(String nombre, int edad) throws EdadErroneaException {
    /**
     * Coloca la edad
     */
    setAge(edad);
    /**
     * Nombre del objeto
     */

    this.nombre = nombre;
  }
  /**
   * 
   * @return Stirng miau
   */
  public String maullar() {
    return MIAUUUUUUUUUUUUU;
  }

}
