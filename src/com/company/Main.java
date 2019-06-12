package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkHooks("((()))"));
        System.out.println(checkHooks("(()"));
        System.out.println(checkHooks(")("));
    }

    public static String checkHooks(String line) {
        int check = 0;
        int count = 0;
        for (char ch:line.toCharArray()) {
            if (ch == '(') {
                check++;
                count++;
            }
            if (ch == ')') {
                check--;
            }
            if (check < 0) {
                return "error";
            }
        }
        return check == 0 ? (count + "") : "error";
    }
}
