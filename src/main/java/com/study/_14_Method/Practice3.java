package com.study._14_Method;

public class Practice3 {
    public static double calcAvg(int kor, int eng, int math) {
        int sum = kor + eng + math;
        double avg = sum / 3.0; // 자동형변환
        return avg;
    }

//    public static String getGrade(double avg) {
//        String grade;
//        if (avg >= 90) {
//            grade = "A";
//        } else if (avg >= 80) { // && avg < 90
//            grade = "B";
//        } else if (avg >= 70) { // && avg < 80
//            grade = "C";
//        } else {
//            grade = "D";
//        }
//    }
//
//    public static void main(String[] args) {
//        // 1. 국영수 점수를 받아서, 평균을 구하고 리턴하는 메서드
//        // 2. 평균으로 등급을 구하는 메서드(90이상 A, 80~89 B, 70~79 C, 나머지 D)
//        String Name = "김철수";
//        int kor = 85;
//        int eng = 90;
//        int math = 70;
//
//        double avg = calcAvg(kor, eng, math);
//        String grade = getGrade(avg);
//        // 호출결과가 값이면 값처럼 사용가능하다
//        // f(g()) -> g() 실행 -> f() 실행
//        // String grade = getGrade(calcAvg(kor,eng,math));  // 똑같이 적용
//
//
//        System.out.println("name" + "의 등급 : " + grade);
//
//        // calcAvg(kor, eng, math); 평균
//        // getGrade(avg) 등급
//




    }

