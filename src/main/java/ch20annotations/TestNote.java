//: annotations/TestNote.java
// The @Unit @TestNote tag.
package ch20annotations;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestNote {
  String value() default "";
} ///:~
