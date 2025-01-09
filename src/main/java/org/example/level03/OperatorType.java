package org.example.level03;

public enum OperatorType {
    ADD('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char operator;

    // 생성자 생성
    OperatorType(char operator) {
        this.operator = operator;
    }

    // getter 생성
    public char getOperator() {
        return operator;
    }

    public static OperatorType getOperatorType(char operator) {
        for (OperatorType type : OperatorType.values()) {
            if (type.getOperator() == operator) {
                return type;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자 입니다.: " + operator);
    }

}
