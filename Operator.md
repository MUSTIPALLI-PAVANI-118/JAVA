What is an Operator?
Definition:
An operator is a symbol that performs a specific operation on one or more operands (values or variables).
👉 Operators tell the compiler what action to perform.
Example:
int a = 10 + 5;
+ → operator
10 and 5 → operands

Relational Operators

Used to compare two values.
Result is always boolean (true or false).
Operator	Meaning
>	Greater than
<	Less than
>=	Greater than or equal
<=	Less than or equal
==	Equal to
!=	Not equal to
Example:
int a = 10, b = 20;
System.out.println(a > b);   // false
System.out.println(a == b);  // false

Logical Operators
Used to combine multiple conditions.
Operator	Meaning
&&	Logical AND
`	
!	Logical NOT
Truth Table:
| A | B | A && B | A || B |
|---|---|-------|-------|
| true | true | true | true |
| true | false | false | true |
| false | true | false | true |
| false | false | false | false |
Example:
int age = 20;
System.out.println(age > 18 && age < 25); // true

Assignment Operators
Used to assign values to variables.
Operator	Meaning
=	Assign
+=	Add and assign
-=	Subtract and assign
*=	Multiply and assign
/=	Divide and assign
%=	Modulus and assign
Example:
int a = 10;
a += 5;  // a = a + 5 → 15
📌 Short-circuit behavior:
&& stops if first condition is false
|| stops if first condition is true

Unary Operators
Operate on a single operand.
Operator	Meaning
+	Unary plus
-	Unary minus
++	Increment
--	Decrement
!	Logical NOT
Example:
int a = 5;
System.out.println(-a); // -5

