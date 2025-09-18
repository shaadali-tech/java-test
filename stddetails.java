public class stddetails {
  int age;
  String name;

  
  public stddetails(int age, String name) {
    this.age = age;
    this.name = name;
  }


  @Override
  public String toString() {
    return "stddetails [age=" + age + ", name=" + name + "]";
  }

  public static void main(String[] args) {
    stddetails action=new stddetails(24, "shaadu");
    System.out.println(action);

}
}