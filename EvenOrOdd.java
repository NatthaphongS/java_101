import java.util.Scanner;
public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Input your number : ");
    int number = sc.nextInt();
    sc.close();

    // if(number%2==0){
    //   System.out.println(number + " is a even number");
    // }else{
    //   System.out.println(number + " is a odd number");
    // }

    String result = (number%2 == 0) ? number+" is a even number": number+" is a odd number";
    System.out.println(result);
  }
}
