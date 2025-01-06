package org.example.level01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.next();

            int result = 0;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째)에 0이 입력될 수 없습니다.");
                    }
                    result = num1 / num2;
                    break;
            }

            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.next().equalsIgnoreCase("exit")) {
                break;
            } else if (sc.next().equalsIgnoreCase("yes")){
                continue;
            }
        }
    }
}
