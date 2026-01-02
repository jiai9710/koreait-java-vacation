package com.study._02_Variable;

public class DataType {
    public static void main(String[] args) {
        // 자료형
        // 정수 타입
        // byte(1byte), short(2byte)
        int intBox = 200000;    // 4byte, -21억 ~ 21억 표현
        long longBox = 3_000_000_000L;  // 8byte

        // 실수 타입
        float floatBox = 3.14F; // 4byte, 소수점 7자리
        double doubleBox = 3.141592;    // 8byte, 소수점 15자리

        // 문자 타입
        char char1 = 'A';   // A는 65
        char char2 = 65 + 1;    // 아스키코드
        // 컴퓨터는 결국 모든 데이터를 숫자로 취급
        // 동일한 숫자가 저장되어 있어도, 어떤 자료형이냐에 따라
        // 표현될 수 있는 경우의 수가 여러개
        // 정수로도 표현될 수 있고, 문자로도 표현될 수 있음
        System.out.println(char1);
        System.out.println(char2);

        //문자열 타입
        String str = "안녕하세요!";
        String name = "홍길동";

        // 문자열은 덧셈연산가능
        System.out.println("나의 이름: " + name);

        // 논리 타입 - boolean
        // boolean 타입 변수는 의문형으로 작명
        boolean isEmpty = true;
        boolean isAdult = true;
        boolean hasRole = false;

        // 실습) 아래의 인적사항을 적절한 타입으로 저장 후 출력
        /*
        이름 : 김자바
        출생연도 : 2000년
        키 : 175.8
        혈액형 : A형
        학생여부 : true
         */

        String nameOfKim = "김자바";
        int yearOfKim = 2000;
        float heightOfKim = 175.8F; //f 소문자여도 됨 근데 double 쓰는게 나을 듯
        // double height = 175.8; // 얘는 뒤에 알파벳 안붙여도 됨
        char bloodType = 65;
        boolean isStudent = true;

        System.out.println("이름 : " + nameOfKim);
        // 문자열 + 다른 자료형 = 문자열로 변함.
        System.out.println(""+1000);    // 1000은 문자열로 변함.
        System.out.println("출생연도 : " + yearOfKim);
        System.out.println("키 : " + heightOfKim + "cm");
        System.out.println("혈액형 : " + bloodType + "형");
        System.out.println("학생여부 : " + isStudent);

    }
}
