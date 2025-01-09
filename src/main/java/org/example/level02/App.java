package org.example.level02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator2 calculator2 = new Calculator2();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            calculator2.calculate(num1, num2, operator);

            System.out.println("계속 계산하시겠습니까? (yes/exit/read)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            } else if (answer.equals("read")) {
                for (Integer result : calculator2.getList()) {
                    System.out.println(result);
                }
                System.out.println("1. 계속 계산 하시겠습니까?");
                System.out.println("2. 첫 번째 결과값 삭제");
                System.out.println("3. 종료");
                answer = sc.next();
                if (answer.equals("1")) {
                    continue;
                } else if (answer.equals("2")) {
                    calculator2.removeResult();
                    if (calculator2.getList().isEmpty()) {
                        System.out.println("결과 값이 비어있습니다.");
                    } else {
                        for (Integer result : calculator2.getList()) {
                            System.out.println(result);
                        }
                    }
                    System.out.println("계속 계산 하시겠습니까? (yes/exit)");
                    answer = sc.next();
                    if (answer.equals("yes")) {
                        continue;
                    } else if (answer.equals("exit")) {
                        break;
                    }
                } else if (answer.equals("3")) {
                    break;
                } else {
                    System.out.println("잘못된 입력값 입니다. 프로그램을 종료 합니다.");
                    break;
                }
            } else if (answer.equals("yes")) {
                continue;
            }
        }
    }
}
