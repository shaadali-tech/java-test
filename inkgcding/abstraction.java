package inkgcding;

public abstract class  abstraction {
  private int nooftires;

  public abstraction(int nooftires) {
    this.nooftires = nooftires;
  }

  public abstract void makestartsound();

  public int getNooftires() {
    return nooftires;
  }

  public void setNooftires(int nooftires) {
    this.nooftires = nooftires;
  }
  
  

}
