public class pro26 {
  public static void main(String[] args) {
    int[][] newarray={{1,2,3},{2,3,4},{8,5,6}};

    int i=0;
    while(i<newarray.length){
      int j=0;
      while (j<newarray[i].length) {
        System.out.print(newarray[i][j]+" ");
        j++;
        
      }
      System.out.println();


      i++;
    }

  }
}
