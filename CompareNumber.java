import java.util.Scanner;
public class CompareNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input your first number : ");
    int number1 = sc.nextInt();
    System.out.print("Input your second number : ");
    int number2 = sc.nextInt();
    sc.close();
    if(number1>number2){
      System.out.println(number1+" is greater than "+number2);
    }else if(number1<number2){
      System.out.println(number1+" is less than "+number2);
    }else if(number1 == number2){
      System.out.println(number1+" is equal to "+number2);
    }else {
      System.out.println("Invalid numbers");
    }
    
  }
}
