class Student{
  String name;
  int age;

  public void info(){
    System.out.println(this.name);
    System.out.println(this.age);
  }
  //Constructer have no return type,same name as class name
  Student(){
   System.out.println("Constructer is called");//Non-parameterized constructer
  }

  Student(String name,int age){ //Parameterized constructer
    this.name = name;
    this.age = age;
  }
  Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
  }
  

}


public class Constructer {
  public static void main(String args[]){
   Student s1 = new Student("Shristi",22);
   Student s2 = new Student(s1);
   s1.info();
   s2.info();
  }
}
//Destructors are not in java because garbage collector is their which collects the objects that are not in use automatically.