public class RecursionExample{

  public static void main(String...args){

    RecursionExample recursion = new RecursionExample();

    System.out.println(recursion.doFactorial(5));
    System.out.println(recursion.doSums(10));
    System.out.println(sumRange(1,10));
  }

  public int doFactorial(int n) {
    //doFactorial -> Goal -no for/while/do-while loops

    if (n == 1) return 1;
    return n * doFactorial (n-1);
  }

  public int doSums(int n) {

    if(n == 1) return 1;
    return n + doSums (n-1);
  }

  public int sumRange(int a, int b){
    return doSums(b)-doSums(a);
  }
}
