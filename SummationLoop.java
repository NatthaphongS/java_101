import java.util.Scanner;
public class SummationLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum=0,count=0;
    while(true){
      System.out.print("Input your number : ");
      int number = sc.nextInt();
      if(number<0)break;
      count++;
      sum+=number;
      System.out.println("Your Total Sum is "+sum);
    }
    sc.close();
System.out.println("Your average is "+sum/count);
  }
}
