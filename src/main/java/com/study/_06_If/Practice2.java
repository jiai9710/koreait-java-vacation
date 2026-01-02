package com.study._06_If;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // 1. 스캐너 생성
        // 2. int price를 입력받아주기
        // 3. 10만원 이상을 입력하면 10% 할인가격 / 할인없는가격 출력
        Scanner scanner = new Scanner(System.in);
        System.out.print("가격을 입력해주세요 : ");
        int price = scanner.nextInt();
        double salePrice = price * 0.9;

        // 내 풀이
        boolean isWrongPrice = price < 0;
        if (isWrongPrice) {
            System.out.println("가격은 양수여야 합니다.");
            return;
        }

        if (price >= 100000) {
            System.out.println("할인된 가격은 " + salePrice + "원입니다.");
        } else {
            System.out.println("가격은 " + price + "원입니다.");
        }

        // 선생님 풀이
        if (price >= 100000) {
            // 10% 할인 작성
            double discountPrice = price * 0.9;
            System.out.println("최종가격 : " + discountPrice);
        } else {
            System.out.println("최종가격 : " + price);
        }
    }
}
