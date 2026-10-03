import  java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
  public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<Integer>();

    // add elements
    list.add(0);
    list.add(2);
    list.add(3);

  //  System.out.println(list);

   //get elements
    // int element = list.get(0);
    // System.out.print(element);

   // add elements in between
   list.add(1,1);
   
   System.out.println(list);  
   
  //  set element
  list.set(0,9);
  System.out.println(list);

  //delete element
  list.remove(2);

  int size = list.size();
  System.out.println(size);

  for(int i = 0;i<list.size();i++){
    System.out.print(list.get(i));

  }
  System.out.println("");


  //Sorting list
 Collections.sort(list);
  System.out.println(list);
  }
  
}
