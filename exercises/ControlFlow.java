import java.util.Scanner;

public class ControlFlow {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a number: ");
    int n = reader.nextInt(); // Scans the next token of the input as an int.
    //once finished
    reader.close();

    String output;
    if(n % 2 != 0){
      output = String.format("%d is an odd number", n);
    } else {
      output = String.format("%d is an even number", n);
    }

    System.out.println(output);
  }
}
