# Java Data Types and Their Ranges — Complete Theory Notes

Java data types define **what type of value a variable can store** and **how much memory it occupies**.

Java data types are divided into two categories:

```
Java Data Types
        |
        |
  -----------------
  |               |
Primitive     Reference
Data Types    Data Types
```

---

# 1. Primitive Data Types

Primitive data types are the basic data types provided by Java.

Java has **8 primitive data types**:

| Data Type | Size          | Range                                                   | Used For              |
| --------- | ------------- | ------------------------------------------------------- | --------------------- |
| byte      | 1 byte        | -128 to 127                                             | Small integer values  |
| short     | 2 bytes       | -32,768 to 32,767                                       | Medium integer values |
| int       | 4 bytes       | -2,147,483,648 to 2,147,483,647                         | Normal integer values |
| long      | 8 bytes       | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | Large integer values  |
| float     | 4 bytes       | Approximately ±3.4E−38 to ±3.4E+38                      | Decimal values        |
| double    | 8 bytes       | Approximately ±1.7E−308 to ±1.7E+308                    | Large decimal values  |
| char      | 2 bytes       | 0 to 65,535                                             | Single character      |
| boolean   | JVM dependent | true or false                                           | Logical values        |

---

# 2. Integer Data Types

Integer types store **whole numbers** (without decimal points).

Example:

```
10
-50
1000
```

Java provides four integer types:

```
byte
short
int
long
```

---

# 3. byte Data Type

### Definition:

`byte` is the smallest integer data type in Java.

### Memory:

```
1 byte = 8 bits
```

### Range:

```
-128 to 127
```

### Example:

```java
byte age = 20;
```

### Maximum value:

```
127
```

### Minimum value:

```
-128
```

### Uses:

* Saving memory
* Storing small numbers

Example:

```java
byte temperature = 25;
```

---

# 4. short Data Type

### Definition:

`short` stores larger integers than byte.

### Memory:

```
2 bytes = 16 bits
```

### Range:

```
-32,768 to 32,767
```

### Example:

```java
short population = 30000;
```

### Uses:

* Medium-sized integer values

---

# 5. int Data Type

### Definition:

`int` is the most commonly used integer data type.

### Memory:

```
4 bytes = 32 bits
```

### Range:

```
-2,147,483,648
to
2,147,483,647
```

### Example:

```java
int marks = 95;
```

### Uses:

* Age
* Marks
* Roll numbers
* Counting values

Example:

```java
int students = 500;
```

---

# 6. long Data Type

### Definition:

`long` stores very large integer values.

### Memory:

```
8 bytes = 64 bits
```

### Range:

```
-9,223,372,036,854,775,808

to

9,223,372,036,854,775,807
```

### Example:

```java
long population = 8000000000L;
```

Note:

For long values, add `L` at the end.

```java
long number = 123456789L;
```

### Uses:

* World population
* Large calculations
* Bank transactions

---

# 7. Floating Point Data Types

Floating point data types store numbers with decimal points.

Example:

```
10.5
99.99
3.14159
```

Java has two floating types:

```
float
double
```

---

# 8. float Data Type

### Definition:

`float` stores decimal values with single precision.

### Memory:

```
4 bytes
```

### Range:

```
Approximately:

±3.4 × 10⁻³⁸

to

±3.4 × 10³⁸
```

### Example:

```java
float price = 45.5f;
```

Important:

Always add `f` after float values.

Correct:

```java
float value = 10.5f;
```

Wrong:

```java
float value = 10.5;
```

---

# 9. double Data Type

### Definition:

`double` stores decimal values with double precision.

### Memory:

```
8 bytes
```

### Range:

```
Approximately:

±1.7 × 10⁻³⁰⁸

to

±1.7 × 10³⁰⁸
```

### Example:

```java
double percentage = 95.75;
```

### Uses:

* Scientific calculations
* Financial calculations
* Precise decimal values

---

# 10. Character Data Type (`char`)

### Definition:

`char` stores a single character.

Examples:

```
'A'
'B'
'5'
'$'
```

### Memory:

```
2 bytes
```

### Range:

```
0 to 65,535
```

### Example:

```java
char grade = 'A';
```

Important:

Character uses single quotes.

Correct:

```java
char ch = 'A';
```

Wrong:

```java
char ch = "A";
```

---

# 11. Boolean Data Type

### Definition:

`boolean` stores only two values.

Values:

```
true
false
```

### Example:

```java
boolean isPassed = true;
```

### Uses:

* Conditions
* Decision making

Example:

```java
boolean result = marks >= 40;
```

---

# 12. Reference Data Types

Reference data types store references to objects.

Examples:

```
String
Arrays
Classes
Objects
```

---

# 13. String Data Type

String stores multiple characters.

Example:

```java
String name = "Pavan";
```

Memory:

* Not fixed
* Depends on number of characters

Example:

```
"Java"
```

contains:

```
J a v a
```

---

# 14. Important Default Values

When variables are declared as class variables:

| Data Type | Default Value |
| --------- | ------------- |
| byte      | 0             |
| short     | 0             |
| int       | 0             |
| long      | 0L            |
| float     | 0.0f          |
| double    | 0.0d          |
| char      | '\u0000'      |
| boolean   | false         |
| String    | null          |

---

# 15. Data Type Selection Guide

| Requirement            | Use     |
| ---------------------- | ------- |
| Small numbers          | byte    |
| Medium numbers         | short   |
| Normal integers        | int     |
| Very large integers    | long    |
| Decimal values         | float   |
| More accurate decimals | double  |
| Single character       | char    |
| True/False             | boolean |
| Text                   | String  |

---

# 16. Quick Memory and Range Revision

```
byte
↓
1 byte
↓
-128 to 127


short
↓
2 bytes
↓
-32,768 to 32,767


int
↓
4 bytes
↓
-2.1 billion to +2.1 billion


long
↓
8 bytes
↓
Very large integers


float
↓
4 bytes
↓
Decimal values


double
↓
8 bytes
↓
High precision decimals


char
↓
2 bytes
↓
Single character


boolean
↓
true / false
```

---

# Final Concept Flow

```
Java Data Types

        |
        |
 ------------------------
 |                      |
Primitive          Reference
 |                      |
 |                      |
Numbers            String
Characters         Arrays
Logic              Classes

```

For Java programming, remember:

* Use **int** for most whole numbers.
* Use **double** for most decimal values.
* Use **char** for one character.
* Use **String** for text.
* Use **boolean** for conditions.
