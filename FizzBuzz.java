public class FizzBuzz {
  
  public static void main(String[] args) {
   
    
    for(int i = 1; i <= 100; i++) {
      
      //checks if the number is divisible by 3 and 5 and prints FizzBuzz
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
        //checks if the number is divisible by 5 and prints Buzz
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
        //checks if the number is divisible by 3 and prints Fizz
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
        //if the previous conditions are not met, it prints just the number as it is
      } else {
        System.out.println(i);
      }
    }
