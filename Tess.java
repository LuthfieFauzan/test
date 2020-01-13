

public class Tess {

    static long faktorial(int n){
    long z =1;
    int i = 1;
    while(i <= n){
      z=z*i;
      i++;
    }
    return z;
  }

    public static void main(String[] args) {
        // TODO code application logic here
    int  i, j;
    
    for (i=0; i<20; i++){
      for (j=0; j<20-i-1; j++){
        System.out.print(" ");
      }
      for (j=0; j<=i; j++){
        System.out.print(faktorial(i)/(faktorial(j)*faktorial(i-j))+" ");
      }
      System.out.println();
    }
  }
    
}