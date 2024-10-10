package com.samsung;

import java.util.Scanner;

public class Classwork5 {
    public static void main(String[] args) {

/*        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
            System.out.println(array[i]);*/

        /*Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            sum += array[i];
            System.out.println(array[i] + " ");
        }
        double res = (double) sum / n;
        System.out.println("\n" + res);*/

/*        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
                if(i == j) sum1 += arr[i][j];
                if(i + j + 1 == arr.length) sum2 += arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum1 +" "+ sum2);*/

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}


//Сложить два числа в массиве и складывать их дальше
//подготовиться к тесту и повторть все темы по 1 модулю
//array[i]=array[i - 2] + array[i - 1]
// Если все четные 
//if (!(x % 2 == 0 && y % 2 ==0 && z % 2 == 0))
