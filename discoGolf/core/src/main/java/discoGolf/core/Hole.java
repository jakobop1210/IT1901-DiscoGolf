package discoGolf.core;

/**
 * Hole class storing data information for a hole
 * @author @Jakob Opland
 * @version 1.0
 * @since 2022-10-25
 */
public class Hole {
  private int par;
  private int holeThrows;
  
  /**
   * Constructor validating par input and setting both field to this value.
   * @param par the par value for the hole
   */
  public Hole(int par) {
    validatePar(par);
    this.par = par;
    this.holeThrows = par;
  }

  /**
   * @return the par value for the hole
   */
  public int getPar() {
    return par;
  }
    
  /**
   * @return total throws for this hole
   */
  public int getHoleThrows() {
    return holeThrows;
  }

  /**
   * @return the hole score which is total throws - par
   */
  public int getHoleScore() {
    return getHoleThrows() - getPar();
  }

  /**
     * adds one to the current amount of throws the player 
     * has made on the hole.
  */
  public void addThrow() {
    this.holeThrows += 1;
  }

  /**
  * removes one from the current amount of throws the 
  * has made on the hole.
  */
  public void removeThrow() {
    if (getHoleThrows() == 1) {
      throw new IllegalStateException("Cannot have 0 throws");
    }
    this.holeThrows -= 1;
  }

  /**
     * @param int par value for the hole
     * @throws IllegalStateException Throws if par value is not valid
     */
    private void validatePar(int par) {
      if (par < 2 || par > 7) {
          throw new IllegalArgumentException("Not a valid par value");
      }
  }
  
}
