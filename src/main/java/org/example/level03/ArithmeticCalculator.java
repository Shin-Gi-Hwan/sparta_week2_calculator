package org.example.level03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> { // calculator 클래스에 T로 선어되어있는 클래스는 반드시 넘버를 상속받은 클래스여야 한다.
    private final List<Double> results = new ArrayList<>();

    public void calculate(T num1, T num2, OperatorType operator) {
        double operand1 = num1.doubleValue();
        double operand2 = num2.doubleValue();
        double result = 0;

        switch (operator) {
            case ADD:
                result = operand1 + operand2;
                break;
            case MINUS:
                result = operand1 - operand2;
                break;
            case MULTIPLY:
                result = operand1 * operand2;
                break;
            case DIVIDE:
                if (operand2 == 0) {
                    throw new ArithmeticException("0 으로는 나눌수 없습니다.");
                }
                result = operand1 / operand2;
                break;
        }
        results.add(result);
        System.out.println("결과: " + result);
    }

    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        } else {
            System.out.println("삭제할 값이 없습니다.");
        }
    }

    public List<Double> maxResult(double threshold) {
        return results.stream()
                .filter(result -> result > threshold)
                .collect(Collectors.toList());
    }
}
