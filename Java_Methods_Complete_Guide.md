# 🚀 Java Methods — Complete Beginner to Intermediate Guide

> A full self-study guide for **Surya**.
> Covers all 18 topics in order, each with **Theory → Syntax → Example → Common Mistakes → Quick Check**.
>
> 💡 **How to use this file:** Read one topic, type out the example yourself, run it, then try the Quick Check *before* opening the answer. Each Quick Check answer is hidden inside a collapsible `▶ Answer` box (works on GitHub, VS Code, and most Markdown viewers).

---

## 📑 Table of Contents

1. [Why Methods Exist](#topic-1--why-methods-exist-code-reuse-avoid-repetition)
2. [Method Syntax & Structure](#topic-2--method-syntax--structure)
3. [Method Declaration](#topic-3--method-declaration)
4. [Method Calling](#topic-4--method-calling)
5. [Parameters & Arguments](#topic-5--parameters--arguments)
6. [Return Types](#topic-6--return-types-int-string-boolean-etc)
7. [void Methods](#topic-7--void-methods)
8. [The return Statement](#topic-8--the-return-statement)
9. [Pass-By-Value](#topic-9--pass-by-value)
10. [Scope of Variables](#topic-10--scope-of-variables-local-method-class)
11. [Method Overloading](#topic-11--method-overloading)
12. [Static Methods](#topic-12--static-methods)
13. [What is Recursion](#topic-13--what-is-recursion)
14. [Writing a Simple Recursive Method](#topic-14--writing-a-simple-recursive-method)
15. [Base Condition](#topic-15--base-condition)
16. [Stack Behavior in Recursion](#topic-16--stack-behavior-in-recursion)
17. [Tracing Recursive Calls (Dry Run)](#topic-17--tracing-recursive-calls-dry-run)
18. [Practice — Factorial, Fibonacci, Sum of N](#topic-18--practice--factorial-fibonacci-sum-of-n)
- [📌 Final Cheat Sheet](#-final-cheat-sheet)

---

# Topic 1 — Why Methods Exist (code reuse, avoid repetition)

## THEORY

A **method** is just a named block of code that does one specific job. You write the steps once, give them a name, and then whenever you want that job done, you simply *call the name* instead of rewriting all the steps.

Think of a **coffee machine**. Making coffee involves many steps: heat the water, grind the beans, pour, mix. But you don't do those steps manually every morning — you just press the **"Coffee" button**. The machine remembers the steps. You press one button, the work happens. A method is that button. You "press" it (call it) whenever you need the work done.

Another example: a **light switch**. You don't rewire the bulb every time you enter a room. You flip the switch. The wiring (the actual work) was set up once; the switch just triggers it.

Why does this matter for code?

- **Code reuse** — write the steps once, use them as many times as you want.
- **No repetition** — you avoid copy-pasting the same lines over and over.
- **Easy to fix** — if something's wrong, you fix it in *one* place, not in 50 places.
- **Readable** — `makeCoffee()` is instantly clear; ten lines of brewing steps repeated everywhere is not.

> Programmers have a nickname for this idea: **DRY** — *Don't Repeat Yourself*. That's the whole point of methods.

## SYNTAX

For now, just learn to *recognize the shape* of a method. Every keyword is broken down in Topic 2.

```java
static void greet() {        // a method named "greet" — this is the "button"
    // the steps the method performs go inside these braces
    System.out.println("Hello!");
}
```

The shape: a name (`greet`), a pair of `()`, and a pair of `{ }` holding the work.

## EXAMPLE

The **same program written two ways** so you can feel the difference.

**The repetitive way (no method)** — the same 3 lines typed three times:

```java
public class Main {
    public static void main(String[] args) {
        // Greeting user 1
        System.out.println("Hello!");
        System.out.println("Welcome to our app.");
        System.out.println("Have a great day!");

        // Greeting user 2 — copy-pasted
        System.out.println("Hello!");
        System.out.println("Welcome to our app.");
        System.out.println("Have a great day!");

        // Greeting user 3 — copy-pasted AGAIN
        System.out.println("Hello!");
        System.out.println("Welcome to our app.");
        System.out.println("Have a great day!");
    }
}
```

**The clean way (using a method)** — write it *once*, then just call it:

```java
public class Main {

    // Define the greeting ONE time inside a method
    static void greet() {
        System.out.println("Hello!");
        System.out.println("Welcome to our app.");
        System.out.println("Have a great day!");
    }

    public static void main(String[] args) {
        greet();   // greet user 1
        greet();   // greet user 2
        greet();   // greet user 3
    }
}
```

**Output (identical for both programs):**

```
Hello!
Welcome to our app.
Have a great day!
Hello!
Welcome to our app.
Have a great day!
Hello!
Welcome to our app.
Have a great day!
```

Same result — but the second version is shorter, and changing the greeting means editing **one** place instead of three.

## COMMON MISTAKES

1. **Copy-pasting code instead of making a method.** When a bug needs fixing, you must fix every copy — and almost always miss one. A method means one fix, everywhere.
2. **Thinking methods are "extra work" or only for big programs.** They make even small programs cleaner. Reaching for a method early is a good habit, not over-engineering.
3. **Cramming everything into `main()`.** Breaking work into small, well-named methods makes the program far easier to read and reuse.

## QUICK CHECK

Your program needs to print a welcome message (3 lines) in **5 different places**.
(a) **Without** a method, how many times would you type those 3 lines?
(b) **With** a method, how many times would you *write* the lines, and how many times would you *call* the method?

<details><summary>▶ Answer</summary>

**(a)** 5 times (15 lines total of repeated code).
**(b)** You **write** the lines **once** (inside the method) and **call** the method **5 times**. One definition, five calls.
</details>

---

# Topic 2 — Method Syntax & Structure

## THEORY

Every Java method follows the **same skeleton**. Once you learn the skeleton, you can read *any* method.

Think of a method like a **recipe card**:
- a **title** (the method name),
- a list of **ingredients you must hand it** (parameters),
- what it **gives back** when done (return type),
- and the **steps** (the body inside `{ }`).

A method has two parts:
1. **Header** — the first line. It announces the method's name, what it needs, and what it returns.
2. **Body** — the `{ }` block. The actual instructions.

## SYNTAX

```java
modifier returnType methodName(parameterList) {   // ← HEADER
    // ← BODY: statements that do the work
    return value;   // (only if returnType is not void)
}
```

Breaking down each piece:

```java
public  static  int   add(int a, int b)  {
//  │       │     │     │      │           
//  │       │     │     │      └── parameters: inputs the method needs
//  │       │     │     └── method name: what you call it by
//  │       │     └── return type: the kind of value it gives back (int)
//  │       └── static: belongs to the class itself (more in Topic 12)
//  └── access modifier: who can use it (public = everyone)
    return a + b;   // the body: do the work and hand back a result
}
```

| Part | Meaning | Example |
|------|---------|---------|
| Access modifier | Who can call it | `public`, `private` |
| `static` | Belongs to class, not an object | `static` |
| Return type | What it gives back | `int`, `String`, `void` |
| Method name | The label you call | `add`, `greet` |
| Parameters | Inputs inside `()` | `(int a, int b)` |
| Body | The work inside `{ }` | `return a + b;` |

## EXAMPLE

```java
public class Main {

    // HEADER: public static, returns int, named "square", takes one int "n"
    public static int square(int n) {
        // BODY
        int result = n * n;   // do the work
        return result;        // hand the answer back
    }

    public static void main(String[] args) {
        int answer = square(5);          // call it, store what comes back
        System.out.println(answer);      // print the result
    }
}
```

**Output:**

```
25
```

## COMMON MISTAKES

1. **Forgetting the `{ }` body or the `( )` parentheses.** Every method needs both, even if `()` is empty: `void greet()`.
2. **Putting a `;` right after the header.** Writing `void greet();` followed by `{ }` is wrong here — that semicolon ends the line too early. A method *definition* never has a `;` before its body.
3. **Mismatched braces.** Every opening `{` needs a closing `}`. A missing brace is the #1 beginner compile error. Indent your code so braces line up.

## QUICK CHECK

Look at this header:

```java
public static String getName(int id)
```

Name **four** things it tells you: the access modifier, the return type, the method name, and the parameter(s).

<details><summary>▶ Answer</summary>

- **Access modifier:** `public`
- **Return type:** `String` (it hands back text)
- **Method name:** `getName`
- **Parameter:** one `int` called `id`

(Bonus: it's also `static`.)
</details>

---

# Topic 3 — Method Declaration

## THEORY

**Declaring** a method means *writing it down* — creating the method so it exists. It's like **writing a recipe into your cookbook**. Just writing it doesn't cook anything; it just means the recipe now *exists* and is ready to be used later.

Declaration ≠ running. When you declare a method, the code inside it does **not** run yet. It only runs when someone **calls** it (Topic 4). Declaration is "here is how to do the job"; calling is "do the job now."

Where do you declare methods? **Inside a class, but outside other methods.** You cannot put one method's declaration inside another method's body.

## SYNTAX

```java
public class Main {

    // ✅ A method declaration lives directly inside the class
    static void sayHi() {
        System.out.println("Hi!");
    }

    // ✅ Another declaration, side by side — this is fine
    static void sayBye() {
        System.out.println("Bye!");
    }

    public static void main(String[] args) {
        // method declarations do NOT go inside here
    }
}
```

## EXAMPLE

```java
public class Main {

    // Declaration 1: prints a line of stars
    static void printLine() {
        System.out.println("**********");
    }

    // Declaration 2: prints a title
    static void printTitle() {
        System.out.println("  MENU");
    }

    public static void main(String[] args) {
        printLine();    // now we actually use them
        printTitle();
        printLine();
    }
}
```

**Output:**

```
**********
  MENU
**********
```

Notice: the methods were *declared* at the top, but nothing printed until they were *called* inside `main`.

## COMMON MISTAKES

1. **Declaring a method inside another method.** This is illegal in Java:
   ```java
   public static void main(String[] args) {
       static void greet() { }   // ❌ ERROR: methods can't be nested
   }
   ```
   Declare `greet()` *outside* `main`, as its own method in the class.
2. **Expecting a declared method to run on its own.** Declaring it is not enough — if you never call it, its code never executes.
3. **Two methods with the exact same name AND same parameters.** Java won't allow two identical signatures (this is different from *overloading*, which we cover in Topic 11).

## QUICK CHECK

True or False: *Simply declaring a method causes its code to run automatically.* Explain your answer in one sentence.

<details><summary>▶ Answer</summary>

**False.** Declaring a method only creates it (writes the recipe down); the code inside runs **only when the method is called**.
</details>

---

# Topic 4 — Method Calling

## THEORY

**Calling** a method means *telling it to run now*. The declaration was writing the recipe; **calling is actually cooking the dish**.

You call a method by writing its **name followed by `()`**. If the method needs inputs, you put them inside the parentheses. When you call it, the program **jumps** into the method, runs every line inside, and then **comes back** to exactly where it left off — like pressing pause on your own task, going to do the method's work, then resuming.

Real-life analogy: you're reading a book and hit a footnote. You jump to the footnote, read it, then return to the exact sentence you were on. A method call is that footnote jump.

## SYNTAX

```java
methodName();              // call a method that takes no inputs

methodName(value);         // call a method, passing one input

int x = methodName();      // call it AND catch the value it returns
```

## EXAMPLE

```java
public class Main {

    static void step1() {
        System.out.println("Step 1 done");
    }

    static void step2() {
        System.out.println("Step 2 done");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        step1();    // jump into step1, run it, come back
        step2();    // jump into step2, run it, come back
        System.out.println("End");
    }
}
```

**Output:**

```
Start
Step 1 done
Step 2 done
End
```

Trace the jump: `main` prints `Start`, **jumps** to `step1` (prints its line), **returns**, **jumps** to `step2` (prints its line), **returns**, then prints `End`.

## COMMON MISTAKES

1. **Forgetting the parentheses.** Writing `step1;` does nothing useful — you must write `step1();` to actually call it.
2. **Calling a method that needs inputs without giving them.** If a method is `void greet(String name)`, then `greet();` fails — you must pass a value: `greet("Surya");`.
3. **Ignoring the returned value.** If a method *returns* something useful, calling it and not storing/using the result wastes it: `add(2, 3);` computes 5 but throws it away. Use `int sum = add(2, 3);`.

## QUICK CHECK

What is the **one symbol** you must always write after a method's name to actually call (run) it?

<details><summary>▶ Answer</summary>

The **parentheses `()`**. For example: `greet();`. Without them, the method is not called.
</details>

---

# Topic 5 — Parameters & Arguments

## THEORY

This is the topic where two words get mixed up the most, so let's nail it.

- A **parameter** is the **placeholder** written in the method's declaration. It's the *empty labelled box* the method promises to fill.
- An **argument** is the **actual value** you hand over when you *call* the method. It's what you *put into* the box.

Analogy — an **online form**:
- The form has a blank field labelled "Name: ____". That blank labelled field is the **parameter**.
- When you type **"Surya"** into it, "Surya" is the **argument**.

One-line memory trick:
> **P**arameter = **P**laceholder (in the declaration). **A**rgument = **A**ctual value (in the call).

## SYNTAX

```java
// "name" is a PARAMETER — a placeholder defined in the method header
static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

// "Surya" is an ARGUMENT — the actual value passed during the call
greet("Surya");
```

You can have multiple parameters, separated by commas. The arguments must match in **order, number, and type**:

```java
static void show(String item, int qty) { ... }   // 2 parameters
show("Apples", 5);                                // 2 arguments, matching order/type
```

## EXAMPLE

```java
public class Main {

    // 'a' and 'b' are PARAMETERS (placeholders)
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    public static void main(String[] args) {
        add(10, 5);    // 10 and 5 are ARGUMENTS
        add(3, 8);     // 3 and 8 are ARGUMENTS
    }
}
```

**Output:**

```
10 + 5 = 15
3 + 8 = 11
```

The same method runs twice, but with different arguments, giving different results. That's the power of parameters — one method, many inputs.

## COMMON MISTAKES

1. **Mixing up the terms.** Remember: parameter = in the *declaration*; argument = in the *call*. Interviewers and teachers love this distinction.
2. **Wrong number of arguments.** If the method has 2 parameters, you must pass exactly 2 arguments. `add(10);` fails.
3. **Wrong order or type.** `void show(String item, int qty)` called as `show(5, "Apples")` fails — the types don't line up. Order and type matter.

## QUICK CHECK

In this code, **which word is the parameter and which is the argument?**

```java
static void printAge(int age) {     // <-- here
    System.out.println(age);
}

printAge(21);                        // <-- here
```

<details><summary>▶ Answer</summary>

- `age` (in the method header) is the **parameter** — the placeholder.
- `21` (in the call) is the **argument** — the actual value passed in.
</details>

---

# Topic 6 — Return Types (int, String, boolean, etc.)

## THEORY

A **return type** declares **what kind of value a method gives back** when it finishes. It's written right before the method's name.

Think of a **vending machine**. You press a button (call the method), and it **gives back** a product. The *kind* of thing it gives back is fixed — a snack machine gives snacks, not drinks. The return type is that promise: "this method will hand back an `int`" or "this method will hand back a `String`."

Common return types:

| Return type | Gives back | Example value |
|-------------|-----------|---------------|
| `int` | a whole number | `42` |
| `double` | a decimal number | `3.14` |
| `String` | text | `"Hello"` |
| `boolean` | true/false | `true` |
| `char` | a single character | `'A'` |
| `void` | **nothing** (covered in Topic 7) | — |

If a method declares a return type (anything other than `void`), it **must** use a `return` statement to actually hand back a value of that type.

## SYNTAX

```java
// returns an int
static int getNumber() {
    return 7;          // the value handed back must be an int
}

// returns a String
static String getGreeting() {
    return "Welcome";  // handed-back value must be a String
}

// returns a boolean
static boolean isAdult(int age) {
    return age >= 18;  // this expression is true or false → a boolean
}
```

## EXAMPLE

```java
public class Main {

    // returns an int: the bigger of two numbers
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // returns a boolean: is the number even?
    static boolean isEven(int n) {
        return n % 2 == 0;   // remainder 0 means even
    }

    public static void main(String[] args) {
        int bigger = max(12, 9);          // catch the returned int
        System.out.println("Max: " + bigger);

        boolean check = isEven(10);       // catch the returned boolean
        System.out.println("Is 10 even? " + check);
    }
}
```

**Output:**

```
Max: 12
Is 10 even? true
```

## COMMON MISTAKES

1. **Declaring a return type but forgetting to `return` a value.** `static int getNumber() { System.out.println("hi"); }` won't compile — it promised an `int` but never returns one.
2. **Returning the wrong type.** A method declared `int` cannot `return "hello";`. The returned value's type must match the declared return type.
3. **Confusing *printing* with *returning*.** `System.out.println(5)` *shows* 5 on screen; `return 5` *hands 5 back* to the caller to use. They are completely different actions. (More on this in Topic 8.)

## QUICK CHECK

What return type should a method have if its only job is to check whether a password is correct and answer **yes/no (true/false)**?

<details><summary>▶ Answer</summary>

**`boolean`** — because the method gives back a true/false answer.
</details>

---

# Topic 7 — void Methods

## THEORY

A **`void`** method is a method that **gives nothing back**. It does a job, but it doesn't hand you a value to use afterward.

Analogy: think of a **doorbell**. You press it and it *does something* — it rings. But it doesn't *give you back* an object. You don't write `Ring r = pressDoorbell();`. It just performs an action. That's `void` — action, no result handed back.

When do you use `void`? When the method's purpose is to **do something** (print, save, update, display) rather than to **calculate and return** a value.

The word `void` literally means "empty" — empty of a return value.

## SYNTAX

```java
// 'void' = this method returns nothing
static void printWelcome() {
    System.out.println("Welcome!");
    // no return statement needed (it returns nothing)
}
```

You **call** a void method as a standalone statement — you do **not** assign it to a variable:

```java
printWelcome();              // ✅ correct
// String x = printWelcome(); // ❌ wrong — there is nothing to store
```

## EXAMPLE

```java
public class Main {

    // void: its job is to display, not to return
    static void printReceipt(String item, int price) {
        System.out.println("----- RECEIPT -----");
        System.out.println("Item:  " + item);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        printReceipt("Coffee", 150);   // just call it; nothing to catch
    }
}
```

**Output:**

```
----- RECEIPT -----
Item:  Coffee
Price: 150
-------------------
```

## COMMON MISTAKES

1. **Trying to store a void method's result.** `int x = printReceipt(...);` fails — a void method returns nothing, so there's nothing to assign.
2. **Writing `return someValue;` inside a void method.** Not allowed. A void method may use a bare `return;` to exit early (Topic 8), but it can never return an actual value.
3. **Thinking `void` means the method is useless.** Void methods are everywhere and very useful — `System.out.println()` itself is a void method. "Returns nothing" doesn't mean "does nothing."

## QUICK CHECK

Is this line valid or invalid, and why?

```java
String result = printReceipt("Tea", 100);   // printReceipt is a void method
```

<details><summary>▶ Answer</summary>

**Invalid.** `printReceipt` is `void`, so it returns nothing — there is no value to store in `result`. You should just call it: `printReceipt("Tea", 100);`.
</details>

---

# Topic 8 — The return Statement

## THEORY

The **`return`** statement does two things:
1. It **hands a value back** to whoever called the method.
2. It **immediately ends** the method — any code after a reached `return` does not run.

Analogy: imagine you ask a friend to calculate your bill total. The moment they say **"It's ₹450"** (that's the `return`), their job is done — they hand you the number and stop. They don't keep talking. `return` is that "here's your answer, I'm done" moment.

Two flavors:
- In a method **with a return type** (`int`, `String`, etc.): `return value;` — must give back a value.
- In a **`void`** method: a bare `return;` (no value) can be used to **exit early**. Often you don't need it at all, because the method ends naturally at the closing brace.

**Print vs Return** — the most important distinction for beginners:
- `System.out.println(x)` → **shows** x on the screen. The value is gone after display; nothing is handed back to your code.
- `return x` → **hands x back** to the caller so the program can store it, do math with it, or pass it along. Nothing appears on screen unless you print it.

## SYNTAX

```java
static int addOne(int n) {
    return n + 1;          // hand back n+1, then stop
    // System.out.println("hi");  // ❌ unreachable — never runs
}

static void checkAge(int age) {
    if (age < 0) {
        return;            // exit the method early; nothing returned
    }
    System.out.println("Age is " + age);   // skipped if age < 0
}
```

## EXAMPLE

```java
public class Main {

    // Demonstrates RETURN vs PRINT
    static int doubleIt(int n) {
        return n * 2;      // hands back the doubled value (does NOT print)
    }

    public static void main(String[] args) {
        int result = doubleIt(4);          // catch the returned value: 8
        System.out.println("Returned: " + result);   // NOW we print it

        // We can also use the returned value directly in more math:
        int total = doubleIt(5) + doubleIt(10);   // 10 + 20
        System.out.println("Total: " + total);
    }
}
```

**Output:**

```
Returned: 8
Total: 30
```

Notice `doubleIt` itself never prints. It just returns. The printing happens in `main`. That's the difference between *returning* and *printing*.

## COMMON MISTAKES

1. **Confusing `return` with `print`.** Returning hands a value back to your code; printing shows it on screen. They are not interchangeable.
2. **Writing code after a `return` on the same path.** Anything after a reached `return` is **unreachable** and causes a compile error.
3. **Forgetting that `return` exits the whole method.** Once `return` runs, the method stops immediately — even if it's inside a loop, the loop and the method both end right there.

## QUICK CHECK

What are the **two things** the `return` statement does when it runs inside a method like `static int foo() { return 5; }`?

<details><summary>▶ Answer</summary>

1. It **hands back the value** (here, `5`) to the caller.
2. It **immediately ends the method** — no code after it runs.
</details>

---

# Topic 9 — Pass-By-Value

## THEORY

**Pass-by-value** means that when you pass a variable into a method, Java passes a **copy** of its value — **not the original variable itself**.

Analogy: you have a document. Instead of handing someone your *original*, you give them a **photocopy**. They can scribble all over the photocopy, but your original stays untouched. Java does the same: the method gets a copy, so changes inside the method **don't affect** your original variable outside.

This is why, for simple types (`int`, `double`, `boolean`, `char`, etc.), a method **cannot change** the caller's variable.

> ⚠️ **Important nuance (for later):** Java is *always* pass-by-value. But when you pass an **object** (like an array), the *value being copied* is a reference (an address) pointing to the same object. So the method can modify the object's contents through that copied address — though it still can't make your original variable point to a brand-new object. For now, focus on the simple-type case below; just know the array example shows the nuance.

## SYNTAX

```java
static void change(int x) {
    x = 100;            // changes only the COPY, not the caller's variable
}

int a = 5;
change(a);              // a copy of 5 is passed
// a is STILL 5 here — the original was never touched
```

## EXAMPLE

```java
public class Main {

    static void tryToChange(int number) {
        number = 999;                  // modifies the local copy only
        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {
        int myValue = 10;
        System.out.println("Before call: " + myValue);

        tryToChange(myValue);          // pass a COPY of 10

        System.out.println("After call:  " + myValue);   // unchanged!
    }
}
```

**Output:**

```
Before call: 10
Inside method: 999
After call:  10
```

See it? Inside the method the copy became 999, but `myValue` back in `main` is still 10. The original was never touched — only its photocopy was changed.

## COMMON MISTAKES

1. **Expecting a method to change your original simple variable.** It can't (for `int`, `double`, `boolean`, etc.). If you need the new value, **return it** and reassign: `myValue = tryToChange(myValue);`.
2. **Thinking "pass-by-value" means the variable itself travels in.** Only a *copy of the value* goes in. The original stays put.
3. **Over-generalizing to objects.** With arrays/objects, the method *can* alter the contents because the copied value is a reference to the same object. Beginners often think "Java never changes anything" — that's only true for primitive copies.

## QUICK CHECK

After this code runs, what is the value of `score`, and why?

```java
static void reset(int s) {
    s = 0;
}

int score = 50;
reset(score);
// what is score now?
```

<details><summary>▶ Answer</summary>

`score` is **still 50**. Java passed a **copy** of 50 into the method. Setting `s = 0` changed only that copy, not the original `score`.
</details>

---

# Topic 10 — Scope of Variables (Local, Method, Class)

## THEORY

**Scope** means: *where in your code a variable is alive and usable.* Outside its scope, the variable simply doesn't exist.

Analogy: a tool kept in **one room** of a house can only be used in that room. Step outside that room and you can't reach it. A tool kept in the **shared hallway** can be reached from any room. Scope decides which "room" a variable belongs to.

Three kinds you need to know:

**1. Local scope** — a variable declared **inside a block** (inside `{ }`, like inside a loop or `if`). It lives and dies *within those braces only*.

**2. Method scope** — a variable (including parameters) declared **inside a method**. It exists only while that method runs, and is invisible to other methods. (Local scope and method scope overlap — a method's variables are local to that method.)

**3. Class scope** — a variable declared **inside the class but outside any method** (often called a *field* or *member variable*). It's the "shared hallway": every method in the class can see and use it.

Key rule: **inner can see outer, but outer cannot see inner.** A method can read a class variable, but `main` cannot read a variable declared inside another method.

## SYNTAX

```java
public class Main {

    static int classVar = 100;     // CLASS scope: visible to all methods here

    static void demo() {
        int methodVar = 5;         // METHOD scope: visible only inside demo()

        if (methodVar > 0) {
            int blockVar = 9;      // LOCAL/BLOCK scope: visible only inside this if
            System.out.println(blockVar);   // ✅ works
        }
        // System.out.println(blockVar);    // ❌ error: blockVar died at the }

        System.out.println(classVar);       // ✅ class variable is reachable
    }
}
```

## EXAMPLE

```java
public class Main {

    static int counter = 0;        // CLASS scope — shared by every method

    static void increase() {
        counter = counter + 1;     // can read & change the class variable
        int temp = counter * 10;   // METHOD scope — only exists in here
        System.out.println("temp inside increase: " + temp);
    }

    public static void main(String[] args) {
        increase();
        increase();
        System.out.println("counter in main: " + counter);
        // System.out.println(temp);   // ❌ error: temp is not visible here
    }
}
```

**Output:**

```
temp inside increase: 10
temp inside increase: 20
counter in main: 2
```

`counter` (class scope) is shared and survives across both calls. `temp` (method scope) is created fresh each call and is invisible to `main`.

## COMMON MISTAKES

1. **Using a variable outside its `{ }`.** A variable declared inside an `if` or `for` block cannot be used after the block closes — it's already gone.
2. **Expecting one method to see another method's local variables.** Method variables are private to their method. To share data, use parameters/return values, or a class variable.
3. **Shadowing confusion.** Declaring a local variable with the same name as a class variable creates two separate variables; the local one "hides" the class one inside that block, which can produce surprising results.

## QUICK CHECK

Which variable below can `main` directly use — `x` or `y`? Why?

```java
public class Main {
    static int x = 5;                 // (A)
    static void test() {
        int y = 10;                   // (B)
    }
    public static void main(String[] args) {
        // can main use x? can main use y?
    }
}
```

<details><summary>▶ Answer</summary>

`main` can use **`x`** (class scope — shared across all methods) but **not `y`** (method scope — it only exists inside `test()`).
</details>

---

# Topic 11 — Method Overloading

## THEORY

**Method overloading** means having **several methods with the same name** but **different parameter lists** in the same class. Java figures out which one you meant by looking at the arguments you pass.

Analogy: the word **"open"**. *Open the door*, *open a file*, *open a bottle* — same word, but what happens depends on **what** you open. The action name is shared; the details differ based on the object. Overloaded methods work the same way: one name, behavior chosen by the inputs.

What makes overloaded methods "different"? Their **parameter list** must differ in at least one of:
- the **number** of parameters, or
- the **type** of parameters, or
- the **order** of parameter types.

> ⚠️ The **return type alone does NOT count.** Two methods that differ only by return type (same name, same parameters) will **not** compile.

Why is this useful? It lets you give *one sensible name* to a family of related operations, instead of inventing `addTwoInts`, `addThreeInts`, `addDoubles`, etc.

## SYNTAX

```java
// Same name "add", different parameter lists → valid overloading

static int add(int a, int b) {            // 2 ints
    return a + b;
}

static int add(int a, int b, int c) {     // 3 ints (different NUMBER)
    return a + b + c;
}

static double add(double a, double b) {   // 2 doubles (different TYPE)
    return a + b;
}
```

## EXAMPLE

```java
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String add(String a, String b) {
        return a + b;            // joins the two strings
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));            // calls the int version
        System.out.println(add(2.5, 1.5));        // calls the double version
        System.out.println(add("Sur", "ya"));     // calls the String version
    }
}
```

**Output:**

```
5
4.0
Surya
```

Same method name `add`, three different jobs — Java picks the right one based on the argument types.

## COMMON MISTAKES

1. **Trying to overload by return type only.** `int foo()` and `double foo()` with identical names and parameters **won't compile**. The parameter list must differ.
2. **Thinking different parameter *names* make an overload.** `add(int a, int b)` and `add(int x, int y)` are the **same** signature — names don't matter, only types/number/order do. This is a duplicate, not an overload.
3. **Ambiguous calls.** Sometimes the compiler can't decide which overload fits (e.g., due to automatic type conversions), causing an "ambiguous method" error.

## QUICK CHECK

Are these two methods a **valid** overload? Why or why not?

```java
static int show(int a) { return a; }
static double show(int a) { return a; }
```

<details><summary>▶ Answer</summary>

**No — invalid.** They have the **same name and the same parameter list** (`int a`); they differ only by **return type**, which is not allowed. This will not compile.
</details>

---

# Topic 12 — Static Methods

## THEORY

A **static method** belongs to the **class itself**, not to any individual object. You can call it using the **class name**, without creating an object first.

Analogy: think of a **calculator app on your phone**. The "add" feature belongs to the *app* — you don't need to create a personal copy of the calculator to use it. A static method is like that built-in feature: it's available straight from the class.

Contrast (just to understand the idea — full OOP comes later):
- **Static** method → called on the **class**: `Math.sqrt(9)`. No object needed.
- **Non-static (instance)** method → needs an **object** first: `myDog.bark()`. You must create `myDog` before calling.

Why `static` matters to you right now: your `main` method is **static**. A static method can **only directly call other static methods** in the same class (without an object). That's why, while learning methods, we mark helper methods `static` — so `main` can call them directly. This is also why all the examples in this guide use `static`.

Important: a static method **cannot** directly use non-static (instance) variables or methods, because those belong to objects, and a static method isn't tied to any object.

## SYNTAX

```java
public class Main {

    // 'static' → belongs to the class; callable without an object
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {   // main is static too
        int result = square(6);                 // called directly, no object
        System.out.println(result);
    }
}
```

Calling a static method **from another class** uses the class name:

```java
// In another class:
int r = Main.square(6);     // ClassName.methodName(...)
```

## EXAMPLE

```java
public class Main {

    static int cube(int n) {
        return n * n * n;
    }

    static void banner(String text) {
        System.out.println("=== " + text + " ===");
    }

    public static void main(String[] args) {
        banner("CUBE RESULTS");          // static call, no object
        System.out.println(cube(2));     // 8
        System.out.println(cube(3));     // 27
    }
}
```

**Output:**

```
=== CUBE RESULTS ===
8
27
```

You've actually been using a famous static method all along: `Math.max(a, b)`, `Math.sqrt(x)`, and `Math.random()` are all static — that's why you call them on `Math` directly without ever writing `new Math()`.

## COMMON MISTAKES

1. **Calling a non-static method from `static main` without an object.** This gives a *"non-static method cannot be referenced from a static context"* error. While learning, keep helper methods `static` so `main` can call them.
2. **Trying to use instance (non-static) variables inside a static method.** A static method isn't attached to any object, so it can't see object-specific data directly.
3. **Overusing `static` in real OOP.** It's perfect for utility/helper methods and for this learning stage, but real object-oriented designs rely heavily on non-static methods. (You'll learn the balance when you study classes and objects.)

## QUICK CHECK

Why are we able to call a method like `square(6)` directly inside `main`, without creating any object first?

<details><summary>▶ Answer</summary>

Because both `main` and `square` are **`static`** — they belong to the class itself. A static method can directly call other static methods in the same class without needing an object.
</details>

---

# Topic 13 — What is Recursion

## THEORY

**Recursion** is when a method **calls itself** to solve a problem by breaking it into a smaller version of the same problem.

Analogy 1 — **mirrors facing each other**: stand between two mirrors and you see a reflection, inside a reflection, inside a reflection… each one is a smaller copy of the same scene. Recursion is a method containing a smaller "copy" of itself.

Analogy 2 — **Russian nesting dolls (Matryoshka)**: open a doll and there's a smaller identical doll inside, then a smaller one, until you reach the tiniest doll that can't open. Recursion keeps opening smaller dolls until it hits the smallest one (the stopping point).

The core idea: a recursive method solves a big problem by saying *"I'll handle one small piece, and ask a smaller copy of myself to handle the rest."*

Every recursion has **two parts**:
1. **Base case** — the stopping point (the tiniest doll). Without it, recursion never ends. (Topic 15.)
2. **Recursive case** — the part where the method calls itself with a *smaller* input, moving toward the base case.

> Recursion vs loops: anything you can do with recursion you could also do with a loop, and vice versa. Recursion shines for problems that are naturally "self-similar" (factorials, trees, etc.). For now, we learn it as a powerful method technique.

## SYNTAX

```java
static void countdown(int n) {
    if (n == 0) {           // BASE CASE: stop here
        System.out.println("Done!");
        return;
    }
    System.out.println(n);
    countdown(n - 1);       // RECURSIVE CASE: call itself with a smaller n
}
```

## EXAMPLE

```java
public class Main {

    static void countdown(int n) {
        if (n == 0) {                    // base case
            System.out.println("Liftoff!");
            return;
        }
        System.out.println(n);           // do a bit of work
        countdown(n - 1);                // shrink the problem
    }

    public static void main(String[] args) {
        countdown(3);
    }
}
```

**Output:**

```
3
2
1
Liftoff!
```

Each call handles one number, then asks a smaller copy of itself to handle the rest — until `n` reaches 0 and it stops.

## COMMON MISTAKES

1. **No base case → infinite recursion.** The method keeps calling itself forever and crashes with a `StackOverflowError`. Every recursion *must* have a reachable stopping point.
2. **Not shrinking the input.** If you call `countdown(n)` instead of `countdown(n - 1)`, the input never gets smaller, so the base case is never reached. Each recursive call must move *closer* to the base case.
3. **Thinking recursion is "magic."** It's just a method calling itself. The same rules (parameters, return, scope) all still apply — each call gets its own fresh copy of the parameters.

## QUICK CHECK

In one sentence: what does it mean for a method to be **recursive**?

<details><summary>▶ Answer</summary>

A method is **recursive** when it **calls itself** (usually with a smaller input) to solve a problem.
</details>

---

# Topic 14 — Writing a Simple Recursive Method

## THEORY

Let's learn the **recipe for writing any recursive method**. Follow these three steps every time and you won't get lost:

1. **Find the base case** — ask: *"What's the simplest input where I already know the answer without any more work?"* That's your stopping point.
2. **Find the recursive case** — ask: *"How can I describe this problem using a smaller version of itself?"*
3. **Make sure each call shrinks toward the base case** — the input must get smaller (or closer to stopping) every time.

Classic first example: **sum of numbers from 1 to N**.

Think about it: the sum `1 + 2 + 3 + ... + N` is just `N` *plus* the sum of `1 to (N-1)`. That's the self-similar insight:
> `sum(N) = N + sum(N - 1)`

And the simplest case: `sum(1) = 1` (or `sum(0) = 0`). That's the base case.

## SYNTAX

```java
static int sum(int n) {
    if (n == 1) {              // 1. BASE CASE
        return 1;
    }
    return n + sum(n - 1);     // 2 & 3. RECURSIVE CASE, shrinking n each time
}
```

Read that return line as: *"the answer is n, plus whatever the smaller problem returns."*

## EXAMPLE

```java
public class Main {

    static int sum(int n) {
        if (n == 1) {              // base case: sum of 1..1 is just 1
            return 1;
        }
        return n + sum(n - 1);     // recursive case
    }

    public static void main(String[] args) {
        System.out.println("Sum 1..5 = " + sum(5));
    }
}
```

**Output:**

```
Sum 1..5 = 15
```

How it builds the answer (we'll formally trace this in Topic 17):
`sum(5)` = 5 + `sum(4)` = 5 + (4 + `sum(3)`) = 5 + 4 + (3 + `sum(2)`) = 5 + 4 + 3 + (2 + `sum(1)`) = 5 + 4 + 3 + 2 + 1 = **15**.

## COMMON MISTAKES

1. **Writing the recursive case before checking the base case.** Always put the base-case `if` **first**, so the method can stop before recursing.
2. **An unreachable base case.** If your base is `n == 1` but you call `sum(0)` or pass negatives, you'll skip right past it into infinite recursion. Make sure every valid input eventually hits the base.
3. **Forgetting to combine the result.** Writing `sum(n - 1);` and ignoring its return value loses the answer. You must use it: `return n + sum(n - 1);`.

## QUICK CHECK

For a recursive `sum(n)` that adds `1` to `n`, what should the **base case** be (the simplest input with a known answer)?

<details><summary>▶ Answer</summary>

`n == 1` returning `1` (or equivalently `n == 0` returning `0`). It's the simplest input whose answer we know without further recursion.
</details>

---

# Topic 15 — Base Condition

## THEORY

The **base condition** (or **base case**) is the **stopping rule** of a recursive method — the situation where the method gives a direct answer **without calling itself again**.

It is the **most important part** of any recursion. Without it, the method calls itself forever and the program crashes.

Analogy — **climbing down a staircase**: you step down, down, down… but you need to know when you've reached the **ground floor** so you stop. The base condition is "I'm on the ground floor — stop going down." Without it, you'd try to keep stepping down past the floor (crash!).

A good base case answers: *"What is the smallest/simplest input where I already know the answer instantly?"*

What happens with **no** base case (or an unreachable one)? Java keeps stacking calls until memory for the "call stack" runs out, throwing a **`StackOverflowError`**.

## SYNTAX

```java
static int factorial(int n) {
    if (n == 0) {        // BASE CONDITION — stop and return directly
        return 1;
    }
    return n * factorial(n - 1);   // recursive call moves toward n == 0
}
```

The `if` at the top is the base condition. Notice it returns a value **without** calling `factorial` again.

## EXAMPLE

```java
public class Main {

    static int factorial(int n) {
        if (n == 0) {                 // base condition
            return 1;                 // 0! is defined as 1
        }
        return n * factorial(n - 1);  // recursive case
    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("0! = " + factorial(0));   // hits base case immediately
    }
}
```

**Output:**

```
5! = 120
0! = 1
```

When we call `factorial(0)`, the base condition is true right away, so it returns `1` without any recursion. When we call `factorial(5)`, it recurses down 5 → 4 → 3 → 2 → 1 → 0, and *0* is where it stops.

## COMMON MISTAKES

1. **Omitting the base condition entirely.** Guaranteed infinite recursion and a `StackOverflowError`. Always write the base case first.
2. **A base condition that's never reached.** E.g., base is `n == 0` but each call does `n + 1` (growing) or you pass a negative number. The input must *converge* to the base.
3. **Wrong base value.** For factorial, returning `0` instead of `1` at the base would make every answer `0`. The base case's returned value must be correct, because everything else builds on it.

## QUICK CHECK

What happens if a recursive method has **no base condition** (or one that's never reached)?

<details><summary>▶ Answer</summary>

It recurses **infinitely** — the method keeps calling itself until the call stack runs out of memory, crashing with a **`StackOverflowError`**.
</details>

---

# Topic 16 — Stack Behavior in Recursion

## THEORY

To understand recursion deeply, you need to know about the **call stack**.

Whenever a method is called, Java places a **box** (called a *stack frame*) on top of a pile. This box holds that call's own parameters and local variables. When a method **finishes** (returns), its box is **removed** from the top. This pile is the **call stack**, and it works **LIFO** — *Last In, First Out*.

Analogy — a **stack of plates**: you add a plate on top, add another on top of that… and when you remove plates, you take the **top one first**. The last plate you put on is the first you take off. Recursive calls stack up exactly like this.

In recursion, each self-call **adds a new box on top** (the calls "go deeper"). The boxes pile up until the **base case** is reached. Then they're removed **one at a time from the top**, each returning its result to the box below it. This "pile up, then unwind" is the heart of how recursion computes its answer.

Two phases:
1. **Winding (going down):** calls stack up, each waiting for the one above to finish.
2. **Unwinding (coming back up):** base case returns, then each frame returns in reverse order, combining results.

This is also *why* infinite recursion crashes: the stack has limited memory, and endlessly adding boxes overflows it → `StackOverflowError`.

## SYNTAX

```java
static int sum(int n) {
    if (n == 1) return 1;       // base: top of the stack returns first
    return n + sum(n - 1);      // each call waits here for the call above to finish
}
```

The key insight: at `return n + sum(n - 1);`, the current call **pauses** and waits. It can't finish its addition until the `sum(n - 1)` box above it returns a value.

## EXAMPLE

```java
public class Main {

    static int sum(int n) {
        System.out.println("Entering sum(" + n + ")");   // shows winding (going down)
        if (n == 1) {
            System.out.println("Base hit at sum(1)");
            return 1;
        }
        int result = n + sum(n - 1);
        System.out.println("Leaving sum(" + n + ") = " + result);  // unwinding (coming back)
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Final answer: " + sum(4));
    }
}
```

**Output:**

```
Entering sum(4)
Entering sum(3)
Entering sum(2)
Entering sum(1)
Base hit at sum(1)
Leaving sum(2) = 3
Leaving sum(3) = 6
Leaving sum(4) = 10
Final answer: 10
```

Read it top to bottom: first all the "Entering" lines stack up (winding down to the base), then the "Leaving" lines fire in **reverse order** (unwinding back up). That reverse order is the LIFO stack in action.

**Visual of the stack at its deepest point** (just before the base returns):

```
   ┌────────────┐  ← top (added last, returns FIRST)
   │  sum(1)    │
   ├────────────┤
   │  sum(2)    │
   ├────────────┤
   │  sum(3)    │
   ├────────────┤
   │  sum(4)    │
   ├────────────┤
   │  main()    │  ← bottom (added first, returns LAST)
   └────────────┘
```

## COMMON MISTAKES

1. **Thinking the answer is computed on the way *down*.** For `sum`, the additions actually finish on the way **back up** (unwinding), after the base case returns. The downward trip just stacks up paused calls.
2. **Ignoring the memory cost.** Each pending call occupies a stack frame. Very deep recursion (e.g., `sum(1000000)`) can overflow the stack even with a correct base case.
3. **Assuming all calls share the same variables.** Each frame has its **own** copy of `n` and locals. `n` in `sum(4)`'s frame is a different `n` than in `sum(3)`'s frame.

## QUICK CHECK

The call stack works in **LIFO** order. What does **LIFO** stand for, and which recursive call returns its value **first** — the outermost (`sum(4)`) or the innermost (`sum(1)`)?

<details><summary>▶ Answer</summary>

**LIFO = Last In, First Out.** The **innermost** call (`sum(1)`, the base case — added to the stack last) returns **first**. The outermost call (`sum(4)`) returns last.
</details>

---

# Topic 17 — Tracing Recursive Calls (Dry Run)

## THEORY

A **dry run** (or **trace**) means **walking through code by hand**, step by step, writing down what each call does and what it returns — *without running it on a computer*. It's how you truly verify you understand a recursive method.

Analogy: it's like being a **detective reconstructing events** in order — "first this happened, then that, which led to this." You follow each call carefully and record the result it hands back.

The technique for recursion:
1. Write the call. Replace it with its body, substituting the argument.
2. When you hit another recursive call, **expand it** the same way (keep the pending operation waiting).
3. Keep going until you reach the **base case** — now you have a concrete value.
4. **Substitute back upward**, plugging each returned value into the call that was waiting for it.

## SYNTAX

We'll trace this exact method:

```java
static int factorial(int n) {
    if (n == 0) return 1;             // base case
    return n * factorial(n - 1);      // recursive case
}
```

## EXAMPLE — Full Dry Run of `factorial(4)`

**Phase 1 — Winding down (expanding each call until the base case):**

```
factorial(4) = 4 * factorial(3)
factorial(3) = 3 * factorial(2)
factorial(2) = 2 * factorial(1)
factorial(1) = 1 * factorial(0)
factorial(0) = 1                 ← BASE CASE reached, returns 1 directly
```

**Phase 2 — Unwinding back up (substitute each returned value into the waiting call):**

```
factorial(0) = 1
factorial(1) = 1 * 1   = 1
factorial(2) = 2 * 1   = 2
factorial(3) = 3 * 2   = 6
factorial(4) = 4 * 6   = 24      ← FINAL ANSWER
```

**Step-by-step table** (a clean way to write a dry run on paper):

| Call | Waiting to compute | Needs | Returns |
|------|--------------------|-------|---------|
| `factorial(4)` | `4 * factorial(3)` | `factorial(3)` | `24` |
| `factorial(3)` | `3 * factorial(2)` | `factorial(2)` | `6` |
| `factorial(2)` | `2 * factorial(1)` | `factorial(1)` | `2` |
| `factorial(1)` | `1 * factorial(0)` | `factorial(0)` | `1` |
| `factorial(0)` | base case | — | `1` |

Read the **"Needs"** column top-down (winding), then the **"Returns"** column bottom-up (unwinding). Final result: **`factorial(4)` = 24**.

**Verify with real output:**

```java
public class Main {
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
```

**Output:**

```
24
```

Your hand-trace matched the computer. That's the goal of a dry run.

## COMMON MISTAKES

1. **Trying to compute on the way down.** You *can't* finish `4 * factorial(3)` until `factorial(3)` returns. Carry the multiplication as "pending" and resolve it on the way back up.
2. **Losing track of which call is waiting for what.** Use the table or the indented expansion above so each pending operation is clearly paired with the value it's waiting on.
3. **Forgetting to substitute the base value back.** Beginners reach the base case and stop. The base value (`1`) must travel back up and be plugged into every waiting call to get the final answer.

## QUICK CHECK

Dry run `factorial(3)` by hand using the method above. Write the value each call returns, and give the final answer.

<details><summary>▶ Answer</summary>

```
factorial(0) = 1            (base case)
factorial(1) = 1 * 1 = 1
factorial(2) = 2 * 1 = 2
factorial(3) = 3 * 2 = 6
```

**Final answer: `factorial(3)` = 6.**
</details>

---

# Topic 18 — Practice — Factorial, Fibonacci, Sum of N

This is the capstone. We solve the **three classic recursion problems** completely, each with theory, full code, output, and a dry run. At the end there are extra practice challenges for you to try yourself.

---

## 18.1 — Sum of N (sum of 1 to N)

### THEORY
Add all whole numbers from `1` to `N`. The self-similar idea:
> `sum(N) = N + sum(N - 1)`, and `sum(1) = 1` (base case).

### CODE
```java
public class Main {
    static int sum(int n) {
        if (n == 1) {                 // base case
            return 1;
        }
        return n + sum(n - 1);        // recursive case
    }

    public static void main(String[] args) {
        System.out.println("Sum 1..10 = " + sum(10));
    }
}
```

### OUTPUT
```
Sum 1..10 = 55
```

### DRY RUN of `sum(4)`
```
sum(4) = 4 + sum(3)
sum(3) = 3 + sum(2)
sum(2) = 2 + sum(1)
sum(1) = 1                ← base case
→ sum(2) = 2 + 1 = 3
→ sum(3) = 3 + 3 = 6
→ sum(4) = 4 + 6 = 10
```

---

## 18.2 — Factorial (N!)

### THEORY
`N!` means `N × (N-1) × (N-2) × ... × 1`. For example `5! = 5×4×3×2×1 = 120`.
The self-similar idea:
> `factorial(N) = N × factorial(N - 1)`, and `factorial(0) = 1` (base case).

(By definition, `0! = 1`.)

### CODE
```java
public class Main {
    static int factorial(int n) {
        if (n == 0) {                     // base case
            return 1;
        }
        return n * factorial(n - 1);      // recursive case
    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("6! = " + factorial(6));
    }
}
```

### OUTPUT
```
5! = 120
6! = 720
```

### DRY RUN of `factorial(4)`
```
factorial(4) = 4 * factorial(3)
factorial(3) = 3 * factorial(2)
factorial(2) = 2 * factorial(1)
factorial(1) = 1 * factorial(0)
factorial(0) = 1               ← base case
→ factorial(1) = 1 * 1 = 1
→ factorial(2) = 2 * 1 = 2
→ factorial(3) = 3 * 2 = 6
→ factorial(4) = 4 * 6 = 24
```

> ⚠️ **Note:** `int` overflows beyond `12!` (≈ 479 million is the `int` limit). For `13!` and higher, use `long`, and for very large values use `BigInteger`.

---

## 18.3 — Fibonacci

### THEORY
The **Fibonacci sequence** starts `0, 1` and each next number is the **sum of the previous two**:

```
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
```

The self-similar idea:
> `fib(N) = fib(N - 1) + fib(N - 2)`

This needs **two base cases**, because the recursion reaches back *two* steps:
> `fib(0) = 0` and `fib(1) = 1`.

### CODE
```java
public class Main {
    static int fib(int n) {
        if (n == 0) return 0;             // base case 1
        if (n == 1) return 1;             // base case 2
        return fib(n - 1) + fib(n - 2);   // recursive case (two calls!)
    }

    public static void main(String[] args) {
        // print the first 10 Fibonacci numbers: fib(0) .. fib(9)
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }
}
```

### OUTPUT
```
0 1 1 2 3 5 8 13 21 34 
```

### DRY RUN of `fib(4)`
`fib(4)` branches into **two** calls each time, forming a tree:
```
fib(4) = fib(3) + fib(2)
       = (fib(2) + fib(1)) + (fib(1) + fib(0))
       = ((fib(1) + fib(0)) + 1) + (1 + 0)
       = ((1 + 0) + 1) + (1 + 0)
       = (1 + 1) + 1
       = 2 + 1
       = 3
```
So `fib(4) = 3`. ✓

> ⚠️ **Efficiency note:** This simple recursive Fibonacci re-computes the same values many times (notice `fib(2)` and `fib(1)` appear repeatedly above). It's great for *learning* recursion but slow for large `n`. Faster versions use a loop or "memoization" — topics for later.

---

## 🎯 Practice Challenges (try these yourself!)

Write recursive methods for each. Solutions sketch is hidden below — try first!

1. **Power:** `power(base, exp)` that computes `base^exp`. (Hint: `power(b, e) = b * power(b, e-1)`, base case `power(b, 0) = 1`.)
2. **Print 1 to N:** a recursive `void` method that prints numbers from `1` up to `N`.
3. **Count digits:** `countDigits(n)` that returns how many digits a positive number has. (Hint: `n / 10` removes the last digit.)
4. **Sum of digits:** `sumDigits(n)` that adds all digits of a number. (e.g., `sumDigits(123) = 6`.)

<details><summary>▶ Solution sketches</summary>

```java
// 1. Power
static int power(int base, int exp) {
    if (exp == 0) return 1;
    return base * power(base, exp - 1);
}

// 2. Print 1 to N (recurse first, then print → ascending order)
static void printUpTo(int n) {
    if (n == 0) return;
    printUpTo(n - 1);
    System.out.print(n + " ");
}

// 3. Count digits
static int countDigits(int n) {
    if (n < 10) return 1;
    return 1 + countDigits(n / 10);
}

// 4. Sum of digits
static int sumDigits(int n) {
    if (n == 0) return 0;
    return (n % 10) + sumDigits(n / 10);
}
```
</details>

### QUICK CHECK
Why does the **Fibonacci** method need **two** base cases (`n == 0` and `n == 1`), while **factorial** and **sum** need only **one**?

<details><summary>▶ Answer</summary>

Because `fib(n)` calls itself **twice** and reaches **two steps back** (`fib(n-1)` *and* `fib(n-2)`). To stop safely, both of the smallest inputs (`0` and `1`) must have direct answers. Factorial and sum each recurse only **one** step back, so a single base case is enough.
</details>

---

# 📌 Final Cheat Sheet

**Anatomy of a method**
```java
public static int add(int a, int b) { return a + b; }
//  │      │     │    │    └─ parameters
//  │      │     │    └─ method name
//  │      │     └─ return type
//  │      └─ static (belongs to class)
//  └─ access modifier
```

| Concept | One-line summary |
|---------|------------------|
| **Why methods** | Write once, reuse many times. Avoid repetition (DRY). |
| **Declaration** | Writing the method (the recipe). Doesn't run by itself. |
| **Calling** | `name()` — runs the method now; program jumps in and returns. |
| **Parameter** | Placeholder in the declaration. |
| **Argument** | Actual value passed in the call. |
| **Return type** | The kind of value handed back (`int`, `String`, `boolean`…). |
| **void** | Returns nothing; does an action. |
| **return** | Hands a value back AND ends the method immediately. |
| **Pass-by-value** | Methods get a *copy*; can't change your original primitive. |
| **Local/method scope** | Variable lives only inside its `{ }` / its method. |
| **Class scope** | Variable declared in the class; visible to all its methods. |
| **Overloading** | Same name, different parameter list. (Return type alone ≠ enough.) |
| **Static** | Belongs to the class; call without an object (`Math.sqrt`). |
| **Recursion** | A method that calls itself on a smaller input. |
| **Base case** | The stopping rule. Without it → `StackOverflowError`. |
| **Call stack** | LIFO pile of calls; innermost returns first. |
| **Dry run** | Trace by hand: expand down to base, substitute back up. |

**The 3 recursion templates**
```java
// SUM
static int sum(int n){ if(n==1) return 1; return n + sum(n-1); }

// FACTORIAL
static int factorial(int n){ if(n==0) return 1; return n * factorial(n-1); }

// FIBONACCI
static int fib(int n){ if(n==0) return 0; if(n==1) return 1; return fib(n-1)+fib(n-2); }
```

**Golden rules**
1. Every method needs `()` and `{ }`.
2. Non-`void` methods must `return` a value of the declared type.
3. `print` shows on screen; `return` hands a value back — not the same.
4. Every recursion needs a reachable **base case** and must **shrink** toward it.
5. While learning, keep helper methods `static` so `main` can call them.

---

*End of guide. Built for Surya — happy coding! ☕*
