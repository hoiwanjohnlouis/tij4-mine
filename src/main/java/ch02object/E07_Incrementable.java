//: object/E07_Incrementable.java
/****************** Exercise 7 ******************
 * Turn the Incrementable code fragments into a
 * working program.
 ************************************************/
package ch02object;

class StaticTest {
  static int i = 47;
}

public class E07_Incrementable {
  static void increment() { StaticTest.i++; }
  public static void main(String[] args) {
    E07_Incrementable sf = new E07_Incrementable();
    System.out.println("StaticTest.i=[" + StaticTest.i + "]");
    sf.increment();
    System.out.println("StaticTest.i=[" + StaticTest.i + "]");
    E07_Incrementable.increment();
    System.out.println("StaticTest.i=[" + StaticTest.i + "]");
    increment();
    System.out.println("StaticTest.i=[" + StaticTest.i + "]");
  }
} ///:~
