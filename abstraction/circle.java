package abstraction;

public class circle extends Shape{
  

  
 private  double radius;

 

  public circle(double radius) {
  this.radius = radius;
}

public double getRadius() {
    return radius;
  }


  @Override
  public double calculatearea() {
    return Math.PI*radius*radius;
  }



  



  
}
