import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Testable {
    String value() default "No description";
}

class Calculator {
    @Testable("Tests addition logic")
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void notAnnotated() {
        System.out.println("This method is not annotated");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) throws Exception {
        Method[] methods = Calculator.class.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Testable.class)) {
                Testable t = m.getAnnotation(Testable.class);
                System.out.println(m.getName() + " -> " + t.value());
            }
        }
    }
}
