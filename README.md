# Strategy Pattern Calculator

A simple Java console application demonstrating the **Strategy Pattern**. The project encapsulates individual arithmetic operations as interchangeable strategies and delegates calculation logic from the `Calculator` context without conditional branches.

---

## Folder Structure

```text
strategy-pattern-calculator/
├── src/
│   ├── Main.java
│   ├── Calculator.java
│   ├── OperationStrategy.java
│   ├── AddStrategy.java
│   ├── SubtractStrategy.java
│   ├── MultiplyStrategy.java
│   └── DivideStrategy.java
└── README.md
```

---
## How to run it

```Bash
java -cp out Main
```

---

## How to add new strategy?
adding new strategy:

in **src** folder

```Code
public class PowerStrategy implements OperationStrategy {
    @Override
    public double execute(double a, double b) {
        return Math.pow(a, b);
    }
} 
```