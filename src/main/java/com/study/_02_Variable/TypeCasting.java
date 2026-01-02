package com.study._02_Variable;

public class TypeCasting {
    public static void main(String[] args) {
        // (자료)형변환 : 데이터 타입이 다른 타입으로 변환

        // 큰 -> 작은 : 넘칠 수도 있음 -> 데이터유실 가능성 존재
        // 작은 -> 큰 : 넘칠 수 없음 -> 데이터유실 가능성 X

        // 작은
        int intValue = 10;  // 4byte
        // 큰
        long longValue; // 8byte
        double doubleValue; // 8byte

        // 작은 -> 큰
        longValue = intValue;   // int(작은) -> long(큰) : 자동형변환
        System.out.println(longValue);
        doubleValue = intValue; // 자동형변환
        System.out.println(doubleValue);

        // 큰 -> 작은
        doubleValue = 1.5;
        intValue = (int) doubleValue; // Error -> (int) 추가해줘야함 => 명시적 형변환
        System.out.println(intValue);   // 데이터 유실 -> 1로 출력

        // 다른타입끼리 연산할 때
        // 규칙 : 더 큰 범위의 타입으로 자동변환 후 연산
        intValue = 1;
        doubleValue = 1.5;

        // double이 더 큰 자료형이라서 자동으로 결과는 double로 변환
        System.out.println(intValue + doubleValue); // 2.5

        int kor = 80;
        int eng = 90;
        int math = 90;
        // 3말고, 3.0으로 연산해서 최종결과를 double로 받는다.
        System.out.println( (kor + eng + math) / 3.0 ); // 그냥 3으로 나누게 되면 int형으로 출력 -> 86으로 출력
        // 3.0으로 연산하면 double형으로 출력 -> 86.66666...7로 출력

        // 문자열 -> 숫자
        String data = "34";
        // 문자열 + 다른데이터 -> 다른데이터가 문자열로 변환되고 이어 붙혀짐.
        System.out.println(data + 1);   // 341

        // 문자열 -> 숫자
        int intData = Integer.parseInt(data);   // Integer -> 참조자료형
        System.out.println(intData + 1);

        data = " 34.44";
        double doubleData = Double.parseDouble(data);   // Double.~ -> 참조자료형
        System.out.println(doubleData + 0.1);

        // 숫자 -> 문자열
        // 문자열("") + 숫자 -> 문자열
        int num1 = 100;
        double num2 = 100.1;
        String strNum1 = "" + num1; // 빈 문자열 -> 하나의 데이터임
        System.out.println(strNum1 + 1);    // 1001 (문자열처럼 붙혀짐)
        String strNum2 = "" + num2;
        System.out.println(strNum2 + 1);    // 100.11

        // 객체 메서드 사용
        String strNum3 = Integer.toString(num1);
        String strNum4 = Double.toString(num2);

        // 간략 메서드 파악
        // 메서드(데이터) -> 메서드 호출(동작시키는 것)

        // 큰 -> 작은 자료형 변환 시, 데이터 유실 가능성
        // 오버플로우
        long overIntValue = 2_147_483_648L; // int 최댓값 + 1
        int overflowInt = (int) overIntValue;   // 명시적 형변환
        // int -> -21억 ~ 21억
        System.out.println(overflowInt);    // -2147483648 -> overflow 발생

        // 1. 명시적 형변환 -> 데이터유실 및 오버플로우까지 고려하자
        // 2. 서비스를 만들 때, 정수타입은 long 고려하자

    }
}
