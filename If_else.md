IF–ELSE STATEMENTS IN JAVA
1. What is if–else?

if–else is a decision-making statement in Java.
It allows a program to execute different blocks of code based on a condition.

👉 Condition must return boolean (true or false).

2. Syntax
Simple if
if (condition) {
    // code executes if condition is true
}

if–else
if (condition) {
    // executes if condition is true
} else {
    // executes if condition is false
}

3. Example: Simple if–else
int age = 18;

if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible to vote");
}

4. if–else–if Ladder

Used when multiple conditions are checked.

Syntax
if (condition1) {
    // block 1
} else if (condition2) {
    // block 2
} else if (condition3) {
    // block 3
} else {
    // default block
}

Example
int marks = 72;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}

5. Nested if–else

An if inside another if.

Example
int age = 20;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Entry allowed");
    } else {
        System.out.println("ID required");
    }
} else {
    System.out.println("Underage");
}

6. Relational Operators Used
Operator	Meaning
>	Greater than
<	Less than
>=	Greater than or equal
<=	Less than or equal
==	Equal to
!=	Not equal
7. Logical Operators Used
Operator	Meaning
&&	AND
`	
!	NOT
Example
if (age >= 18 && age <= 60) {
    System.out.println("Working age");
}

8. Important Points

Conditions must be boolean

Curly braces {} are optional for single statement (but recommended)

else always pairs with nearest if

Use else for default execution

9. Common Mistakes

❌ Using = instead of ==
❌ Missing braces causing logic errors
❌ Comparing strings using == instead of .equals()

10. Real-World Uses

Checking login credentials

Grade calculation

Age verification

Menu-based programs

Input validation

11. Mini Program
class IfElseDemo {
    public static void main(String[] args) {
        int number = 5;

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
