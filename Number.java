public class Number {
    public static void main(String args[]) {
      System.out.println("Hello World");
        for (int i=0; i<100; i++){
	if(i==2||i==3||i==5||i==7)
	System.out.println(i);
	  if(!(i%2==0)){
	    if(!(i%3==0)){
		if(!(i%5==0)){
			if(!(i%7==0)){
		    System.out.println(i);
		}
	      }
	    }
	  }
        }
    }
}
