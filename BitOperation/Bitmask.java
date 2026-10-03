public class Bitmask {
  public static void main(String args[]){
    int n = 5;
    int pos =3;
    int bitmask = 1<<pos;
    if((bitmask & n) == 0){
      System.out.print("The value of bit operation is:0");
    }
    else{
       System.out.print("The value of bit operation is:1");
    }

  }
  
}
