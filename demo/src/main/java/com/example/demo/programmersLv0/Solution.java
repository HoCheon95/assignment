package com.example.demo.programmersLv0;

public class Solution {
    
    public static int solution(int price) {
        int answer = price;

        // 10만원 이상 5% -> 0.05
        // 30만원 이상 10% -> 0.1
        // 50만원 이상 20% -> 0.2

        if (price >= 500000) {
            answer = (int)(price * 0.8);
        } else if (price >= 300000) {
            answer = (int)(price * 0.9);
        } else if (price > 100000) {
            answer = (int)(price * 0.95);
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(580000));
    }
}
