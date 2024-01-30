public class Variable {
  public static void main(String[] args) {
    // การนิยามตัวแปร Declaration, Initialization, Assign and Reassign
    int number;
    number = 10;
    int number1 = 5;
    // number1 = true; // error because we try to assign boolean value to variable with int type
    number1=10;
    float count = 20.5f; // value of float must be end with f
    final double count2 = 20.5; //constant variable
    boolean status = true;
    char alphabet= 'A';

    // การนิยามหลายบรรทัด ต้องมีชนิดข้อมูลเหมือนกัน
    int a=5,b=10,c=20;

    // how to work with valiable
    System.out.println("ค่าตัวเลขที่1 : "+number1);
    // System.out.println("ค่าตัวเลขที่2 : "+(number+count-count2)); // This line error because string un know - syntax
    System.out.println("ค่าตัวเลขที่2 : "+(number+count-count2));
    if(status){
      System.out.println(alphabet);
    }

    // global vs local variable
    int d =100;
    {
      int e = 200;
      System.out.println(d);
    }
    // System.out.println(e); // error because e is a local vaiable on {}

    // Max - Min of any type
    // System.out.println(Integer.MAX_VALUE); // 2147483647
    // System.out.println(Integer.MIN_VALUE); // -2147483648
    // System.out.println(Long.MAX_VALUE); // 9223372036854775807
    // System.out.println(Long.MIN_VALUE); // -9223372036854775808
    // System.out.println(Float.MAX_VALUE); // 3.4028235E38
    // System.out.println(Float.MIN_VALUE); // 1.4E-45
    // System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
    // System.out.println(Double.MIN_VALUE); // 4.9E-324

    // Type Casting / Type Conversion

    // 1. Windening Casting (Byte เล็กไปใหญ่) (ระบบแปลงอัตโนมัติ)
    int numInt = 10;
    double numDouble = numInt;
    System.out.println(numInt);
    System.out.println(numDouble);

    // 2. Narrowing Casting (Byte ใหญ่ไปเล็ก) (ทำเอง)
    double numDouble2 = 10.0;
    // int numInt2 = numDouble2; // error
    int numInt2 = (int)numDouble2; // ***** กดหนดว่าขะแปลงเป็นชนิดอะไรข้างหน้า
    System.out.println(numInt2);
    System.out.println(numDouble2);
    /*
     String คือชนิดข้อมูลที่เก็บชุดข้อความ symbol=""

     Char เก็บตัวอักษร symbol=''

     Charเรียงกัน => string
     */
    String word1 = "10",word2="20";
    word1=word1+10;
    System.out.println(word1);
    System.out.println(word2);

    // int word3 = word2+10; //error string cannot convert to int

    // convert string => Int
    int num3 = Integer.parseInt(word2);
    num3=num3+10;
    System.out.println(num3);

    // convert string => Double
    double num4 = Double.parseDouble(word2);
    num4=num4+10.50;
    System.out.println(num4);

    // convert Int => string
    int num5 = 100;
    // String age = num1;
    String age = String.valueOf(num5);
    System.out.println(age);
    
    // การเช็คชนิดข้อมูล ส่วนใหญ่ เช็ค string
    // ต้องกำหนด type ผ่าน class เท่านั้น
    Integer j = 10; // can use Integer class
    Double k; // can use Double class
    String l = "Hello Wolrd"; //String เป็นตัวใหญ่เพราะเป็นชื่อ Class
    Boolean m; // can use Boolean class
    Character n; // can use Char class
    Float o; // can use Flaot class

    boolean result = j instanceof Integer;
    // instanceof ให้กับ valiable ที่เกิดจาก Class เท่านั้น
    System.out.println(result);

   ; }
}
