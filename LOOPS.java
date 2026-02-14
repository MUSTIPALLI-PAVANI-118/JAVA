TYPES OF LOOPS
1️⃣ FOR LOOP

Used when number of iterations is known

Syntax
for(initialization; condition; increment/decrement) {
    // code
}

Example
for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}

Flow

Initialize

Check condition

Execute body

Update value

Repeat

🔹 2️⃣ WHILE LOOP

Used when condition-based repetition is required

Syntax
while(condition) {
    // code
}

Example
int i = 1;
while(i <= 5) {
    System.out.println(i);
    i++;
}


👉 Condition checked before execution

🔹 3️⃣ DO–WHILE LOOP

Executes at least once, even if condition is false

Syntax
do {
    // code
} while(condition);

Example
int i = 1;
do {
    System.out.println(i);
    i++;
} while(i <= 5);


👉 Condition checked after execution

🔹 LOOP CONTROL STATEMENTS
🔸 break

Stops the loop completely

for(int i=1;i<=5;i++){
    if(i==3)
        break;
    System.out.println(i);
}

🔸 continue

Skips current iteration

for(int i=1;i<=5;i++){
    if(i==3)
        continue;
    System.out.println(i);
}

🔹 NESTED LOOPS

Loop inside another loop

for(int i=1;i<=3;i++){
    for(int j=1;j<=3;j++){
        System.out.print("* ");
    }
    System.out.println();
}

🔹 COMMON LOOP PROGRAMS (EXAM ⭐)

✔ Print 1 to N
✔ Sum of N numbers
✔ Multiplication table
✔ Reverse a number
✔ Palindrome
✔ Factorial
✔ Pattern printing

🔹 QUICK COMPARISON
Loop	Condition Check	Minimum Execution
for	Before	0
while	Before	0
do-while	After	1
🔹 EXAM INSIGHT 💡

Use for → fixed count

Use while → unknown count

Use do–while → must run once

Forgetting increment → infinite loop
