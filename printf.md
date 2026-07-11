# Java `printf()` — Complete Theory and Usage

## 1. What is `printf()`?

`printf()` stands for **formatted print**.

In Java, `printf()` is used to display output in a **specific format**. It allows us to control:

* How values are displayed
* Number of decimal places
* Spacing and alignment
* Printing multiple values together

Syntax:

```java
System.out.printf("format string", values);
```

Example:

```java
int age = 20;

System.out.printf("Age is %d", age);
```

Output:

```
Age is 20
```

---

# 2. Difference Between `println()` and `printf()`

### println()

Used for normal output.

Example:

```java
System.out.println("Age is " + age);
```

Output:

```
Age is 20
```

---

### printf()

Used when we need formatting.

Example:

```java
System.out.printf("Age is %d", age);
```

Output:

```
Age is 20
```

The difference is that `printf()` uses **format specifiers**.

---

# 3. Format Specifiers in `printf()`

A format specifier is a special symbol that tells Java what type of data should be printed.

Syntax:

```
%data_type
```

Common format specifiers:

| Specifier | Data Type    | Example |
| --------- | ------------ | ------- |
| `%d`      | int          | 100     |
| `%f`      | float/double | 45.67   |
| `%s`      | String       | Java    |
| `%c`      | char         | A       |
| `%b`      | boolean      | true    |

---

# 4. Printing Integer using `%d`

Used for `int` values.

Example:

```java
public class Main {
    public static void main(String[] args) {

        int rollNumber = 101;

        System.out.printf("Roll Number: %d", rollNumber);

    }
}
```

Output:

```
Roll Number: 101
```

---

# 5. Printing Decimal Values using `%f`

Used for `float` and `double`.

Example:

```java
public class Main {
    public static void main(String[] args) {

        double price = 99.99;

        System.out.printf("Price: %f", price);

    }
}
```

Output:

```
Price: 99.990000
```

### Why six decimal places?

By default, `%f` prints **6 digits after the decimal point**.

---

# 6. Printing String using `%s`

Used for text values.

Example:

```java
public class Main {
    public static void main(String[] args) {

        String name = "Pavan";

        System.out.printf("Name: %s", name);

    }
}
```

Output:

```
Name: Pavan
```

---

# 7. Printing Character using `%c`

Used for a single character.

Example:

```java
public class Main {
    public static void main(String[] args) {

        char grade = 'A';

        System.out.printf("Grade: %c", grade);

    }
}
```

Output:

```
Grade: A
```

---

# 8. Printing Boolean using `%b`

Used for true/false values.

Example:

```java
boolean result = true;

System.out.printf("Result: %b", result);
```

Output:

```
Result: true
```

---

# 9. Printing Multiple Values

We can print multiple variables in one `printf()` statement.

Example:

```java
public class Main {
    public static void main(String[] args) {

        String name = "Pavan";
        int age = 20;
        double marks = 95.5;

        System.out.printf(
            "Name: %s Age: %d Marks: %f",
            name, age, marks
        );

    }
}
```

Output:

```
Name: Pavan Age: 20 Marks: 95.500000
```

### Important Rule:

The order of variables must match the order of format specifiers.

Correct:

```java
System.out.printf("%s %d", name, age);
```

Wrong:

```java
System.out.printf("%s %d", age, name);
```

---

# 10. Precision Formatting (Controlling Decimal Places)

Sometimes we don't want many decimal digits.

Syntax:

```
%.numberf
```

Example:

```java
double percentage = 95.67891;

System.out.printf("%.2f", percentage);
```

Output:

```
95.68
```

Explanation:

```
%.2f

%  → format starts
.2 → show 2 digits after decimal
f  → floating point number
```

---

Examples:

### One decimal place

```java
System.out.printf("%.1f", 45.678);
```

Output:

```
45.7
```

---

### Three decimal places

```java
System.out.printf("%.3f", 45.67891);
```

Output:

```
45.679
```

---

# 11. Adding Text with `printf()`

Example:

```java
String name = "Pavan";

System.out.printf("Student name is %s", name);
```

Output:

```
Student name is Pavan
```

---

# 12. New Line in `printf()`

By default, `printf()` does not move to the next line.

Example:

```java
System.out.printf("Hello");
System.out.printf("Java");
```

Output:

```
HelloJava
```

To move to the next line use:

```
\n
```

Example:

```java
System.out.printf("Hello\n");
System.out.printf("Java");
```

Output:

```
Hello
Java
```

---

# 13. Tab Space Using `printf()`

Use:

```
\t
```

Example:

```java
System.out.printf("Name\tAge\tMarks\n");
System.out.printf("Pavan\t20\t95");
```

Output:

```
Name    Age    Marks
Pavan   20     95
```

---

# 14. Formatting Tables Using `printf()`

We can create aligned tables using width.

Example:

```java
String name = "Pavan";
int roll = 101;
double marks = 95.5;

System.out.printf("%-10s %-10d %-10.2f",
                  name, roll, marks);
```

Output:

```
Pavan      101        95.50
```

Meaning:

```
%-10s

-  → left alignment
10 → width
s  → String
```

---

# 15. Combining Width and Precision

Example:

```java
double price = 99.5678;

System.out.printf("%10.2f", price);
```

Output:

```
     99.57
```

Meaning:

```
10  → total width
.2  → decimal places
f   → floating value
```

---

# 16. Common Mistakes in `printf()`

### Mistake 1: Wrong format specifier

Wrong:

```java
int age = 20;

System.out.printf("%f", age);
```

Correct:

```java
System.out.printf("%d", age);
```

---

### Mistake 2: Forgetting `f` for float

Wrong:

```java
float price = 10.5;
```

Correct:

```java
float price = 10.5f;
```

---

### Mistake 3: Variable order mismatch

Wrong:

```java
System.out.printf("%d %s", name, age);
```

Correct:

```java
System.out.printf("%s %d", name, age);
```

---

# Quick Reference Table

| Need to Print         | Use             |
| --------------------- | --------------- |
| Integer               | `%d`            |
| Decimal               | `%f`            |
| Decimal with 2 places | `%.2f`          |
| String                | `%s`            |
| Character             | `%c`            |
| Boolean               | `%b`            |
| New line              | `\n`            |
| Tab space             | `\t`            |
| Table alignment       | `%10s`, `%-10d` |

---

# Final Concept Summary

`printf()` works using:

```
printf()
    ↓
Format String
    ↓
Format Specifiers
    ↓
Variables
    ↓
Formatted Output
```

Example:

```java
System.out.printf(
"Name: %s Age: %d Percentage: %.2f",
name, age, percentage);
```

Here:

* `%s` → String
* `%d` → Integer
* `%.2f` → Decimal with 2 digits

Master these concepts and you can solve all Java `printf()` formatting problems.
