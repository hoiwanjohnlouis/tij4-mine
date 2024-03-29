//: reusing/E15_ProtectedTest.java
package ch07reusingclasses;
import ch07reusingclasses.protect.*;

class Derived extends E15_Protected {
  public void g() {
    f(); // Accessible in derived class
  }
}

public class E15_ProtectedTest {
  public static void main(String args[]) {
    //! new E15_Protected().f(); // Cannot access
    new Derived().g();
  }
} ///:~
