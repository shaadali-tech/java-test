public class Car{
  
  int noofseats;

  float currentfuelinlitres;

  String color;

  float maxspeed;

  Car(String color){
    noofseats=4;
    this.color=color;
    maxspeed=123;
    currentfuelinlitres=6;
  }
  

  Car(){
    this("pink");
  }
    

  public void drive(){

    if (currentfuelinlitres==0) {
      System.out.println("your car is out of fuel");
    }
    else
    System.out.println("car is driving");
    currentfuelinlitres--;
  }


  public void adfuel(float fuel){
    currentfuelinlitres+=fuel;
  }
  

  public float getcurrentfuellitre(){
    return currentfuelinlitres;
  } 

  
}

