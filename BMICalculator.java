import java.util.Scanner;
public class BMICalculator {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input your height(cm) : ");
    double height = sc.nextDouble();
    System.out.print("Input your weight(kg) : ");
    double weight = sc.nextDouble();
    sc.close();
    height/=100;
    
    double bmi = weight/(height*height); //ต้องใส่วงเล็บเพราะต้องการยกกำลังส่วนสูงก่อน
    System.out.println("Your BMI is "+bmi);
  }
}
