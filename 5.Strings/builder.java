public class builder {
 public static void main(String[] args) {
  StringBuilder sb = new StringBuilder("Priya");
  System.out.println(sb);

  // char at index 0
  System.out.println(sb.charAt(0));

  // set char at index 0
  sb.setCharAt(0,'S' );
  System.out.println(sb);

  // Inset
  sb.insert(2,'R');
  System.out.println(sb);
 } 
}
