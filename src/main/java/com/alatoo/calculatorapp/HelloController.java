package com.alatoo.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    Calculator calc = new Calculator();
    private StringBuilder history = new StringBuilder(); // Stores the history of calculations

    @FXML
    private TextField text;

    @FXML
    private void onClickBut1() {
        text.appendText("1");
    }

    @FXML
    private void onClickBut2() {
        text.appendText("2");

    }

    @FXML
    private void onClickBut3() {
        text.appendText("3");

    }

    @FXML
    private void onClickBut4() {
        text.appendText("4");

    }

    @FXML
    private void onClickBut5() {
        text.appendText("5");

    }

    @FXML
    private void onClickBut6() {
        text.appendText("6");

    }

    @FXML
    private void onClickBut7() {
        text.appendText("7");

    }

    @FXML
    private void onClickBut8() {
        text.appendText("8");

    }

    @FXML
    private void onClickBut9() {
        text.appendText("9");

    }

    @FXML
    private void onClickBut0() {
        text.appendText("0");

    }

    @FXML
    private void onPlusClick() {
        calc.setOp1(Integer.parseInt(text.getText()));
        calc.setOperator('+');
        text.clear();
    }

    @FXML
    private void onMinusClick() {
        calc.setOp1(Integer.parseInt(text.getText()));
        calc.setOperator('-');
        text.clear();
    }

    @FXML
    private void onMultiplyClick() {
        calc.setOp1(Integer.parseInt(text.getText()));
        calc.setOperator('*');
        text.clear();
    }

    @FXML
    private void onDivideClick() {
        calc.setOp1(Integer.parseInt(text.getText()));
        calc.setOperator('/');
        text.clear();
    }

    @FXML
    private void onEqualClick() {
        try {
            calc.setOp2(Integer.parseInt(text.getText()));
            history.append(text.getText());
            calc.calculate();
            double result = calc.getResult();
            text.setText(String.valueOf(result));
        } catch (ArithmeticException e) {
            handleError("Error: Division by Zero");
        } catch (NumberFormatException e) {
            handleError("Error: Invalid Input");
        }
    }

    @FXML
    private void onClearClick() {
        text.clear();
        calc.setOp1(0);
        calc.setOp2(0);
        calc.setOperator('\0');
        history.setLength(0); // Clear the history as well
    }



    // New method to handle errors and reset to zero
    private void handleError(String message) {
        text.setText(message);

        // Optionally, delay before resetting to "0"
        new Thread(() -> {
            try {
                Thread.sleep(5000); // 5 seconds delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Resetting the text field on the JavaFX Application Thread
            javafx.application.Platform.runLater(() -> text.setText("0"));
        }).start();
    }

}
