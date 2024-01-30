public class WhileLoop {
  public static void main(String[] args) {
    int count = 1;
    while(count<=10){
      System.out.println(++count); //+1 ก่อน แล้วค่อยแสดงผล
    }

    // Trick ถ้าไม่รู้จำนวนรอบที่ชัดเจน
    while(true){
      System.out.println(count++);
      if(count>100) break;
    }
  }
}
