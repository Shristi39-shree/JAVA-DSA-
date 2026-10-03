abstract class animal{
  abstract void walk();
  animal(){
    System.out.println("You are creating a constructor");
  }
  public void eat(){
    System.out.println("Animal eats grass");
  }
}
class Zebra extends animal{
  Zebra(){
    System.out.println("Zebra is created ");
  }
  public void walk(){
   System.out.println("Zebra Walks using 4 legs");
  }
}
class Hen extends animal{
  public void walk(){
   System.out.println("Hen walks using 2 legs");
  }
}



public class Abstraction {
  public static void main(String args[]){
    Zebra zb = new Zebra();
    zb.walk();

    Hen chicken = new Hen();
    chicken.walk();
    
    zb.eat();
    chicken.eat();
  }
  
}
