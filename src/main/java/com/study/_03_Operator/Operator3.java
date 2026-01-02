package com.study._03_Operator;

import org.w3c.dom.ls.LSOutput;

public class Operator3 {
    public static void main(String[] args) {

        int a = 10;
        // 대입 연산자는 연산자 중에 가장 우선순위가 낮다.
        a = a + 3;
        //복합대입 연산자
        a += 3; // a = a + 3
        a -= 3; // a = a - 3
        a *= 3; // a = a * 3
        a /= 3; // a = a / 3
        a %= 3; // a = a % 3

        // 연산자 우선순위 - 자격증 / 시험
        /*
        1. 괄호 () - 가장 높음
        2. 단항연산자 (피연산자가 1개) - ++, __, !
        3. 산술연산자 (곱셈, 나눗셈, 나머지 > 덧셈, 뺄셈)
        4. 비교연산자 ( (<, >, <=, >=) > (==, !=) )
        5. 논리연산자 (&&, ||)
        6. 대입연산자 - 가장 낮음
        */

        int num1 = 5;
        int num2 = 3;
        boolean result = num1 > num2 && num1 + num2 < 10;   // true
        // 산술 -> 비교 -> 논리

        // 삼항연산자
        // boolean데이터 ? true일때의 값 : false일때의 값
        int max = num1 > num2 ? num1 : num2;    // num1 > num2 : true
        boolean isSame = num1 == num2? true : false;
        // 조건문과 다른점 : 결과가 값이다!

        int age = 17;
        String ticketName = age >= 19 ? "성인요금"  // 조건 1? true일때 데이터
                : age >= 14 ? "청소년요금"   // 조건 2? true일때 데이터
                : "어린이요금";  // 깔끔하게 쓰기 위해선 : 부분을 Enter // 모든 조건이 충족 안될 때

        // 실습 1) 키가 120 이상인 경우 탑승가능, 불가능하면 탑승 불가능
        int height = 110;
        //String heightResult;    // heightResult 삼항연산자 결과를 대입받아 출력!
        String heightResult = height >= 120 ? "탑승 가능"
                : "탑승 불가능";
        System.out.println(heightResult);

        // 실습 2) 게시글이 n개가 있고, 한 페이지에 20개씩 화면에 보인다면,
        // 총페이지의 갯수를 삼항연산자로 구하시오.
        int postCount = 162;
        // int pageCount;  // postCount % 20 == 0 ? (나머지연산자!)
        // boolean isCount = postCount % 20 == 0 ?
        int pageCount = postCount % 20 == 0 // 20으로 나누어떨어집니까?
                ? postCount / 20    // 떨어지면 몫을 대입
                : postCount / 20 + 1;   // 떨어지지 않으면 몫 + 1 대입



    }
}
