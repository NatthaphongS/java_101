import java.util.Scanner;
public class MinmaxLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max=0,min=Integer.MAX_VALUE;
    while(true){
      System.out.print("Input your munber : ");
      int number = sc.nextInt();
      if(number<0)break;
      if(number>max)max=number;
      if(number<min)min=number;
    }
    sc.close();
    System.out.println("Max number is "+max);
    System.out.println("Min number is "+min);
  }
}
