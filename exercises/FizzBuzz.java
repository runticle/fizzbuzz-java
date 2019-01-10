public class FizzBuzz {

  public static void main(String[] args) {

    for(int i=1;i<101;i++){

      String output;
      if(i % 15 == 0){
        output = "FizzBuzz";
      } else if(i % 5 == 0 ){
        output = "Buzz";
      } else if(i % 3 == 0 ){
        output = "Fizz";
      } else {
        output = String.format("%d", i);
      }

      System.out.println(output);

    }
  }
}
