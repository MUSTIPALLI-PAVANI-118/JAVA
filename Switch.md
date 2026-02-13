# SWITCH CASE STATEMENT IN JAVA

## 1. What is switch case?

`switch` is a **selection (decision-making) statement** in Java.
It executes **one block of code** from multiple options based on the value of an expression.

👉 Best used when you compare **one variable** with **many fixed values**.

---

## 2. Syntax

```java
switch (expression) {
    case value1:
        // code block
        break;

    case value2:
        // code block
        break;

    case value3:
        // code block
        break;

    default:
        // executes if no case matches
}
```

---

## 3. Flow of Execution

1. Expression is evaluated **once**
2. Control jumps to the **matching case**
3. Code runs until `break` is found
4. If no match → `default` executes
---

## 5. Importance of `break`

* `break` stops execution of the switch
* Without `break`, **fall-through** occurs

### Example (Without break)

```java
int num = 2;

switch (num) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    case 3:
        System.out.println("Three");
}
```

### Output:

```
Two
Three
```

---

## 6. Default Case

* Optional
* Executes when **no case matches**
* Can be placed **anywhere**, but usually at the end

```java
default:
    System.out.println("Invalid choice");
```

---

## 7. Data Types Supported

✔ `byte`
✔ `short`
✔ `int`
✔ `char`
✔ `String`
✔ `enum`

❌ `float`, `double`, `long`

## 10. switch vs if–else

| switch                   | if–else           |
| ------------------------ | ----------------- |
| Cleaner for fixed values | Better for ranges |
| Faster execution         | More flexible     |
| Expression based         | Condition based   |

---

## 11. Common Mistakes

❌ Missing `break`
❌ Duplicate case values
❌ Using unsupported data types
❌ Forgetting `default`
