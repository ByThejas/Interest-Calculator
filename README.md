# ☕ Simple & Compound Interest Calculator

> Learning Java by building, breaking & fixing things.

A beginner-friendly Java console application that calculates **Simple Interest** and **Compound Interest** through a menu-driven interface.

This started as a simple interest calculator and gradually evolved as I learned new Java concepts — methods, classes, conditionals, and loops.

---

## 🚀 Features

- Calculate Simple Interest
- Calculate Compound Interest
- Menu-driven interface
- Separate methods for each calculation
- Recalculate multiple times using a `do-while` loop
- Formatted output up to 2 decimal places
- Separate `Calculator` class for calculation logic

---

## 🧠 Concepts Learned

This project helped me practice:

- Java variables & data types
- `Scanner` for user input
- `if-else` statements
- Methods
- Classes
- `static` methods
- `do-while` loops
- `Math.pow()`
- Arithmetic operations
- `printf()` formatting
- Basic program structure

---

## 🏗️ Program Structure

```text
SimpleCompound
│
├── main()
│   ├── Display menu
│   ├── Get user choice
│   ├── Call calculation method
│   └── Ask whether to calculate again
│
└── Calculator
    ├── simpleInterest()
    └── compoundInterest()
