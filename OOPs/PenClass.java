class Pen{
  String color;
  String type;
  
  public void Write(){
    System.out.println("Pen is used for writing");
  }

  public void printName(){
   System.out.println(this.color);
  }

  public  void printType(){
    System.out.println(this.type);
  }
}

public class PenClass {
  public static void main(String args[]){
  Pen pen1 = new Pen();
  pen1.color = "blue";
  pen1.type = "ballpoint";
  pen1.printName();
  pen1.printType();
  pen1.Write();
  }
  
}
