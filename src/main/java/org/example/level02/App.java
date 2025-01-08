package org.example.level02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator2 calculator2 = new Calculator2();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            calculator2.calculate(num1, num2, operator);

            System.out.println("결과: " + calculator2.getResult());
            System.out.println("계속 계산하시겠습니까? (y(yes)/e(exit)/r(read)) ");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("exit")) {
                break;
            } else if (answer.equalsIgnoreCase("read")) {
                int no = 1;
                for (Integer reads : calculator2.getList()) {
                    System.out.println(no++ + ". " + reads);
                }
            } else {
                continue;
            }
        }
    }
}
