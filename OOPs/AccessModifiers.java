class Account{
  public String name;
   protected int accNo;
   private String password;


//getters & Setters
public String getpassword(){
  return this.password;
}
public void setpassword(String pass)
{
  this.password = pass;
}
}

public class AccessModifiers {
  public static void main(String args[]){
   Account a = new Account();
   a.name = "Shristi";//Can be accessed in same or other class or packages
   a.accNo =23064758;// in same or other class as well as subclass of other package
   //a.password = "2oi3uhg";// can't be accessed as access modifier used is private,(in same class can be accessesd)can be accessed using getters and setters.
   a.setpassword("hska");
   System.out.println(a.getpassword());
   
  }
}
