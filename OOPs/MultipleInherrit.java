interface Animal{
  int eyes = 2;
  void walk();
}
interface Herbivour{
  void eat();
}
class Zebra implements Animal,Herbivour{
  public void walk(){
    System.out.println("The zebra walks using four legs");
  }
  public void eat(){
    System.out.println("Eat grass");
  }
}
public class MultipleInherrit {
  public static void main(String args[]){
    Zebra zb = new Zebra();
    zb.walk();
    zb.eat();

  }
  
}
