public class Calculator{
  //added constructor
  public Calculator(){

  }

  //sum
  public int add(int a, int b){
    return a + b;
  }

  //subtraction
  public int subtract(int a, int b){
    return a - b;
  }

  //multiplication
  public int multiply(int a, int b){
    return a * b;
  }

  //division
  public int divide(int a, int b){
    return a / b;
  }

  //modulo
  public int modulo(int a, int b){
    return a % b;
  }

  //recalling object
  //calling add() and subtract() methods
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));

  }
}
