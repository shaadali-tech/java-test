public class cars {
  
  int maxspeed;

  int noofwheels;

  String color;

  int noofdoors;




public cars(int maxspeed,int noofwheels,int noofdoors,String color){
  this.maxspeed=maxspeed;
  this.noofdoors=noofdoors;
  this.color=color;
  this.noofwheels=noofwheels;
}
@Override
public String toString(){
  return "my car color is"+color;
}


public static void main(String[] args) {
cars swift=new cars(250, 4, 5, "blue");
System.out.println(swift.toString());
 }

} 