package org.example.level02;

import java.util.ArrayList;
import java.util.List;

public class Calculator2 {
    private int result;
    private List<Integer> list = new ArrayList<>();

    // getter 생성
    public int getResult() {
        return result;
    }

    public List<Integer> getList() {
        return list;
    }

    public int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                result = sum(num1, num2);
                break;
            case '-':
                result = minus(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = divide(num1, num2);
                break;
        }
        list.add(result);
        System.out.println("결과: " + result);
        return result;
    }

    public void removeResult() {
        list.remove(0);
    }

    private int sum(int num1, int num2) {
        return num1 + num2;
    }

    private int minus(int num1, int num2) {
        return num1 - num2;
    }

    private int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private int divide(int num1, int num2) {
        return num1 / num2;
    }
}
