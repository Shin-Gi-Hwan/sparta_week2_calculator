package org.example.level03;

import java.util.List;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();
            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operatorInput = sc.next().charAt(0);

            OperatorType operator;
            try {
                operator = OperatorType.getOperatorType(operatorInput);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            calculator.calculate(num1, num2, operator);

            System.out.println("계속 계산하시겠습니까? (yes/exit/read)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("exit")) {
                break;
            } else if (answer.equalsIgnoreCase("read")) {
                System.out.println("1. 전체 결과 확인");
                System.out.println("2. 특정 값보다 큰 결과 확인");
                int readOption = sc.nextInt();

                if (readOption == 1) {
                    System.out.println("저장된 결과:");
                    calculator.getResults().forEach(System.out::println);
                } else if (readOption == 2) {
                    System.out.print("어떤 값보다 큰 결과를 찾으시겠습니까? ");
                    double number = sc.nextDouble();
                    System.out.println("결과:");
                    calculator.maxResult(number).forEach(System.out::println);
                }

                System.out.println("첫 번째 기록을 삭제하겠습니까? (y/n)");
                if ("y".equalsIgnoreCase(sc.next())) {
                    calculator.removeFirstResult();
                    System.out.println("삭제 후 결과:");
                    calculator.getResults().forEach(System.out::println);
                } else {
                    System.out.println("삭제를 취소했습니다.");
                }

                System.out.println("다시 계산을 진행하시겠습니까? (yes/exit): ");
                String nextAnswer = sc.next();

                if (nextAnswer.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (!nextAnswer.equalsIgnoreCase("yes")) {
                    System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                    break;
                }
            }
        }
    }
}
