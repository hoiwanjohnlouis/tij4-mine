//: access/connection/Connection.java
package ch06accesscontrol.connection;

public class Connection {
  private static int counter = 0;
  private int id = counter++;
  Connection() {}
  public String toString() {
    return "Connection " + id;
  }
  public void doSomething() {}
} ///:~
