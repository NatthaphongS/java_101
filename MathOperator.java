import java.util.Scanner;
public class MathOperator {
  public static void main(String[] args) {
    // int a=10,b=5;
    Scanner sc = new Scanner(System.in);
    System.out.print("Input x = ");
    int a = sc.nextInt();
    System.out.print("Input y = ");
    int b = sc.nextInt();

    System.out.println("Add Result = "+(a+b));
    System.out.println("Minus Result = "+(a-b));
    System.out.println("Multiple Result = "+(a*b));
    System.out.println("Devide Result = "+(a/b));
    System.out.println("Modulus Result = "+(a%b));
  }
}
