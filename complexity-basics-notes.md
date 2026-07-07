# Time & Space Complexity — Foundational Notes
### (Java) — Beginner Level

---

## 1. What Time Complexity Means
__________________________________

- Time complexity = **how the runtime of a program grows** as input size grows
- It does **not** mean "how many seconds it takes"
- It means **how many basic operations** the code performs, relative to input size
- Expressed using **Big O notation** — example: `O(n)`, `O(n²)`, `O(log n)`
- Focuses on **growth pattern**, not exact operation count

**Example (Java):**
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
- This loop runs `n` times → Time complexity = `O(n)`

---

## 2. What Space Complexity Means
__________________________________

- Space complexity = **how much extra memory** a program uses as input size grows
- Includes:
  - Variables
  - Data structures (arrays, lists, etc.)
  - Function call stack (recursion)
- Does **not** include the input itself (usually)

**Example (Java):**
```java
int[] arr = new int[n]; // uses O(n) space
```
- Memory grows directly with `n` → Space complexity = `O(n)`

---

## 3. Why Exact Seconds Are Not Used
______________________________________

- Seconds depend on:
  - CPU speed
  - Programming language
  - Compiler/JVM optimizations
  - System load (background apps running)
- Same code can run in different times on different machines
- Big O ignores hardware — it measures **logic efficiency**, not machine speed
- Goal: a complexity measure that stays **true everywhere**, on any computer

---

## 4. Why Growth With Input Size Matters
___________________________________________

- A program may work fine with small input but **fail or slow down** with large input
- We care about **how fast the runtime increases**, not the runtime at one fixed point
- Helps predict behavior **before running the code** on huge datasets
- Helps in **comparing two algorithms** fairly

---

## 5. What Input Size `n` Means
___________________________________

- `n` = the **number of elements** being processed
- Examples of `n`:
  - Size of an array
  - Number of elements in a list
  - Number of nodes in a tree/graph
  - Length of a string
- `n` is a **variable**, not a fixed number — it can be 10, 1000, or 10,00,000

**Example (Java):**
```java
int[] arr = {1, 2, 3, 4, 5}; // here, n = 5
```

---

## 6. Why Complexity Matters For Large Inputs
_____________________________________________

- Small inputs almost **never** show performance problems
- Real-world systems (banking, social media, Google Search) handle **millions/billions** of data points
- An algorithm that looks "fine" for `n = 10` may **crash or take hours** for `n = 10,00,00,000`
- Complexity analysis helps **avoid production failures** before deployment

---

## 7. Difference Between Small Input and Large Input Performance
___________________________________________________________________

| Input Size | O(n) Algorithm | O(n²) Algorithm |
|---|---|---|
| n = 10 | 10 steps | 100 steps |
| n = 1,000 | 1,000 steps | 10,00,000 steps |
| n = 1,00,000 | 1,00,000 steps | 1,00,00,000,000 steps |

- At **small `n`**, even a bad algorithm (`O(n²)`) may run instantly
- At **large `n`**, the difference becomes **huge and very noticeable**
- This is why complexity analysis is done using **large-scale thinking**, not small test cases

---

### Quick Recap
_______________

- Time complexity → growth of **operations**, not seconds
- Space complexity → growth of **memory usage**
- Big O ignores machine speed, focuses on **logic scaling**
- `n` = input size (array length, list size, etc.)
- Small inputs hide inefficiency; **large inputs expose it**
