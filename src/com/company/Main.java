package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkHooks("()"));
        System.out.println(checkHooks("(()"));
        System.out.println(checkHooks(")("));
    }

    public static boolean checkHooks(String line) {
        int check = 0;
        for (char ch:line.toCharArray()) {
            if (ch == '(') {
                check++;
            }
            if (ch == ')') {
                check--;
            }
            if (check < 0) {
                return false;
            }
        }
        return check == 0;
    }
}
