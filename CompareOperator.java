public class CompareOperator {
  public static void main(String[] args) {
    // Result of compare will be boolean
    int a=10,b=5;
    boolean c=(a!=b);

    System.out.println(a==b);
    System.out.println(c);
    System.out.println("Is "+a+" equal to "+b+" ? : "+(a==b));
    System.out.println("Is "+a+" not equal to "+b+" ? : "+(a!=b));
    System.out.println("Is "+a+" less than "+b+" ? : "+(a<b));
    System.out.println("Is "+a+" gearter than "+b+" ? : "+(a>b));
    System.out.println("Is "+a+" less than or equal to "+b+" ? : "+(a<=b));
    System.out.println("Is "+a+" gearter than or equal to "+b+" ? : "+(a>=b));

    // Can use with and(&&) or(||) not(!)
  }
}
