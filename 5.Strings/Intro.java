import java.util.*;

public class Intro {
  public static void main(String[] args) {
    //String Declaration
    Scanner sc = new Scanner(System.in);

    //  String name = "Shristi";
    //  String sentence = "My name is Shristi Jha";
    //  System.err.println(name);
      // String n = sc.next();
      // System.out.println("Your name is: "+ n);
      // String sen = sc.nextLine();
      // System.out.println(sen);
      

      //Concatenation
      // String firstName = "Shristi";
      // String lastName = "Jha";
      // String fulName = firstName + " " + lastName;
      // System.out.println(fulName);
     
      // //Length
      //  System.out.println(fulName.length());

      //  //charAt
      //  for(int i =0;i<fulName.length();i++){
      //   System.out.println(fulName.charAt(i));

        // compare
        // String name1 = "shree";
        // String name2 = "shre";

        // 1 s1 > s2 : +ve value
        // 2 s1 == s2 : 0
        // 3 s1 < s2 : -ve value

        // if(name1.compareTo(name2) == 0){
        //    System.out.println("Strings are equal");
        // }else{
        //   System.out.println("Strings are not equal");
        // }
       String sentence ="My name is shristi";
       String name = sentence.substring(11,sentence.length());
       System.out.println(name);
        

      //  Strings are Imutable.
       }
  }

