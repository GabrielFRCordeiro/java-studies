package PRIMEIRO_PROGRAMA;

public class OlaMundo {
    public static void main(String[] args) {
      // aritimeticos
      int a = 10;
      int b = 3;
      System.out.println(a + b); // 13
      System.out.println(a - b); // 7
      System.out.println(a / b); // 3 (pq sao ints)
      System.out.println(a * b); // 30
      System.out.println(a % b); // 1
      double c = 10;
      double d = 3;
      System.out.println(c / d); // 3.333333333335

      //
      int contador = 0;
      contador++;
      System.out.println(contador); // 1
      contador--;
      System.out.println(contador); // 0

      //
      int e = 10;
      e += 5;
      System.out.println(e); // 15
      e -= 5;
      System.out.println(e); // 10
      e *= 5;
      System.out.println(e); // 50
      e /= 5;
      System.out.println(e); // 10
    }
}
