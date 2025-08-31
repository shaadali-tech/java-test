package newpackage;

public class mains {
  
  private String color;

  private String model;
  

  private double fuellevel;

  private long costofpurchase;




public mains(String color, String model, double fuellevel, long costofpurchase) {
    this.color = color;
    this.model = model;
    this.fuellevel = fuellevel;
    this.costofpurchase = costofpurchase;
  }

public String getcolor(){
  return color;
}

public void setcolor(String color){
  this.color=color;
}

public String getmodel(){
  return model;
}

}