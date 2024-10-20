
# JavaFX Calculator Application

This is a simple calculator application built using JavaFX. It supports basic arithmetic operations like addition, subtraction, multiplication, and division.

## Features

- **Basic Operations**: Addition, subtraction, multiplication, and division.
- **Error Handling**: Displays an error message for division by zero or invalid inputs, and resets to zero.

## Installation

1. **Clone the repository**:
   git clone https://github.com/teyvas/calculator.git
   - Ensure you have JavaFX installed:
       - Download and set up JavaFX from Gluon.
        Make sure to configure JavaFX correctly with your IDE (like IntelliJ or Eclipse).

   - Build and run the project:
        Open the project in your IDE and run the main method from Main.java.
        Alternatively, you can use Maven or Gradle if the project is set up with one.

# Usage

    Use the number buttons (0-9) to input numbers.
    Use the operator buttons (+, -, *, /) to perform operations.
    Press = to compute the result.
    Use the C button to clear the input and reset the calculation.
    



# Calculator Logic

 The Calculator class handles the arithmetic logic:\
    * Stores operands (op1 and op2) and the selected operator (+, -, *, /).\
    * Implements the calculate() method to perform the chosen operation.\
    * Throws ArithmeticException for invalid operations like division by zero.

