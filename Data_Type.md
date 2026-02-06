What is a Data Type?
Definition:
A data type specifies:
What kind of data a variable can store
How much memory is allocated
What operations can be performed on it
👉 Without data types, the compiler cannot understand how to store or process data.
Example:
int age = 20;
int → data type
age → variable
20 → value
2. Primitive Data Types in Java
Java has 8 primitive data types.
They are basic, built-in, and store single values.
List of Primitive Data Types:
byte
short
int
long
float
double
char
boolean
3. byte Data Type
Definition:
byte is a small integer data type.
Size: 1 byte (8 bits)
Range: –128 to +127
Default value: 0
Why byte is used?
Saves memory
Useful in arrays and file handling
Example:
byte b = 100;
4. short Data Type
Definition:
short is a 16-bit integer.
Size: 2 bytes
Range: –32,768 to +32,767
Default value: 0
Example:
short s = 12000;
5. int Data Type (VERY IMPORTANT ⭐)
Definition:
int is the most commonly used integer data type.
Size: 4 bytes (32 bits)
Range: –2,147,483,648 to +2,147,483,647
Default value: 0
Example:
int marks = 95;
Why int is the Default Integer Type?
This is a frequent exam question ⚠️
int is default because:
It provides sufficient range for most applications
It gives better performance on modern processors
Smaller types (byte, short) may overflow easily
Larger type (long) wastes memory
👉 Hence, Java chooses int as the balanced and efficient default.
6. long Data Type
Definition:
long is used for very large integer values.
Size: 8 bytes (64 bits)
Range: –9,223,372,036,854,775,808 to
+9,223,372,036,854,775,807
Default value: 0L
⚠️ L or l must be used with long values.
Example:
long population = 9876543210L;
7. float Data Type
Definition:
float stores decimal (fractional) values.
Size: 4 bytes
Range: ~1.4E−45 to ~3.4E38
Default value: 0.0f
⚠️ f is compulsory.
Example:
float temperature = 36.5f;
8. double Data Type
Definition:
double stores high-precision decimal values.
Size: 8 bytes
Range: ~4.9E−324 to ~1.8E308
Default value: 0.0
Example:
double pi = 3.1415926535;
👉 double is the default decimal type.
9. char Data Type
Definition:
char stores a single character.
Size: 2 bytes
Range: 0 to 65,535
Default value: \u0000
Why 2 bytes?
Because Java uses Unicode, not ASCII.
Example:
char grade = 'A';
10. boolean Data Type
Definition:
boolean stores true or false values.
Size: JVM dependent (usually 1 bit)
Values: true or false
Default value: false
Example:
boolean isPassed = true;
