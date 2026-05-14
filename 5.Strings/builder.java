public class builder {
  // In Java, String is immutable (cannot be changed after creation). Every modification creates a new object, which is slower.
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

  // delete the extra Ri
  sb.delete(2, 4);
  System.out.println(sb);

  // append
  sb.append("e");
  sb.append("l");
  System.out.println(sb);

  // length of string
  System.out.println(sb.length());
 } 
}
