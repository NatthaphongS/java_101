import java.util.Scanner;

public class InputTutorial {
  public static void main(String[] args) {
    // รับค่่าข้อมูล แบบไหน int float long double string ?
    // ถ้าเป็นข้อความจะให้ทำอะไร => คำนวนได้ | ไม่ได้

    // ประกาศใช้งาน class | new
    Scanner sc =new Scanner(System.in); //สร้างไว้ สำหรับการรับค่าจากkeyboard
    System.out.print("Input your name = ");
    String name=sc.nextLine(); //รับค่า String จากแป้นพิมพ์

    System.out.println("Hello "+name);

    System.out.print("Input your birth year = ");
    int year = sc.nextInt(); // รับค่า int จากแป้นพิมพ์ => year
    int age=2567-year;
    System.out.println("Your age is "+age);
  }
}