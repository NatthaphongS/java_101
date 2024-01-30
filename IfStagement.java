import java.util.Scanner;
public class IfStagement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input your age : ");
    int age =sc.nextInt();
    sc.close();
    if(age>=15 && age<=19){
      System.out.println("Adult");
    }
    else if(age>=20 && age<=39){
      System.out.println("Youth");
    }
    else if(age>=30 && age<=39){
      System.out.println("WorkingAge");
    }
    else if(age>=40 && age<=59){
      System.out.println("Middle");
    }
    else if(age>=60){
      System.out.println("Old");
    }else{
      System.out.println("Invalid age input");
    }
    System.out.println("Close Program");
  }
}
