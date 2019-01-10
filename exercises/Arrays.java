import java.util.ArrayList;
import java.util.Iterator;

public class Arrays {

    public static void main(String[] args) {

      // Creates array of strings
      String[] buzzwords = new String[3];
      buzzwords[0] = "fizz";
      buzzwords[1] = "buzz";
      buzzwords[2] = "fizzbuzz";

      // Prints the array object
      System.out.println(buzzwords);

      // Print each buzzword on a new line
      int size = buzzwords.length;
      for(int i=0; i<size; i++)
      {
        System.out.println(buzzwords[i]);
      }
      // Print an array of numbers !
      int[] numbers = {1, 2, 3, 4, 5};
      int num_size = numbers.length;
      for(int i=0; i<num_size; i++)
      {
        System.out.println(numbers[i]);
      }

      // create arraylist
      ArrayList listTest = new ArrayList();

      // add items to list
      listTest.add(1);
      listTest.add(2);
      listTest.add(3);
      listTest.add(4);

      // create new iterator
      Iterator it = listTest.iterator();

      // iterate through iterator 
      while(it.hasNext()){
        System.out.println(it.next());
      }
    }

}
