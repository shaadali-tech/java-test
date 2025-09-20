package inkgcding;

public class equalsandhashcodetest {
  public static void main(String[] args) {
    newperson person1=new newperson("001","Shaad" , 043);
    newperson person2=new newperson("001","Shaad" , 043);

    System.out.println(person1.equals(person2));
  }
}
