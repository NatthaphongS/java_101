import java.util.Scanner;
public class SwitchCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input month number : ");
    int month = sc.nextInt();
    sc.close();

    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("Febuary");
        break;
      case 3:
        System.out.println("March");
        break;
      default:
        break;
    }


  }
}
