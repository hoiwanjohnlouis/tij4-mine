//: net/mindview/util/Deque.java
// Creating a Deque from a LinkedList.
package ch99mindview.net.mindview.util;
import java.util.*;

public class Deque<T> {
  private final LinkedList<T> deque = new LinkedList<>();
  public void addFirst(T e) { deque.addFirst(e); }
  public void addLast(T e) { deque.addLast(e); }
  public T getFirst() { return deque.getFirst(); }
  public T getLast() { return deque.getLast(); }
  public T removeFirst() { return deque.removeFirst(); }
  public T removeLast() { return deque.removeLast(); }
  public int size() { return deque.size(); }
  public String toString() { return deque.toString(); }
  // And other methods as necessary...
} ///:~
