package com.study._13_MultiArray;

public class Practice {
    public static void main(String[] args) {

        // 다중배열
        String[] busanNames = {"부산1", "부산2", "부산3"};
        String[] ulsanNames = {"울산1", "울산2", "울산3"};
        String[] daeguNames = {"대구1", "대구2", "대구3"};

        // names[0][2] -> busanNames[2] -> "부산3"
        String[][] names = {busanNames, ulsanNames, daeguNames};
        System.out.println(names[0][2]);    // 부산3

    }
}
