public class foreachloop {
  public static void main(String[] args) {
  String[] array=new String[]{
    "shaad","ali","sonu","bhai"
  };
  printarray(array);
  forprintarray(array);

  
  }

  public static void printarray(String[] array){
      for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
      }
  }

  public static void forprintarray(String[] array){
      for(String name:array){
        System.out.println(name);
      }
  }
}
