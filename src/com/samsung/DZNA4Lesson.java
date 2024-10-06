package com.samsung;

import java.util.Scanner;

public class DZNA4Lesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x >= 3 && x <= 8) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
