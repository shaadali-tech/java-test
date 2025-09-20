public class person {
  private String name;
  private int rollnumber;
  private String id;

 
  public person(String id,String name,int rollnumber){
    this.id=id;
    this.name=name;
    this.rollnumber=rollnumber;
  
  }


  @Override
  public String toString() {
    return "person [name=" + name + ", rollnumber=" + rollnumber + ", id=" + id + "]";
  }


  public String getName() {
    return name;
  }


  public int getRollnumber() {
    return rollnumber;
  }


  public String getId() {
    return id;
  }


  public void setName(String name) {
    this.name = name;
  }


  public void setRollnumber(int rollnumber) {
    this.rollnumber = rollnumber;
  }


  public void setId(String id) {
    this.id = id;
  }

  


}
