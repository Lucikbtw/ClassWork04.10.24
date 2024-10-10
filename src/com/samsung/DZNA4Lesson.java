package com.samsung;

import java.util.*;

import static javax.swing.text.html.HTML.Attribute.N;

public class DZNA4Lesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


/*        double x = sc.nextDouble();

        if (x >= 3 && x <= 8) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }*/

/*        double x = sc.nextDouble();

        System.out.println((x >= -3 && x <= 5) || (x >= 9 && x <= 15));*/

/*        double x = sc.nextDouble();

        if ((x >= -2 && x <= 3) || (x >= 6 && x <= 9)) {
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }*/

/*        int x = sc.nextInt();

        if ((x >= 100 && x <= 999) && (x % 5 == 0)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }*/

/*        int a = 0;
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                a++;
            }
        }
        if (a == 2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        */

/*int n = sc.nextInt();

        int[] Array = new int[n];

        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < Array.length; i++) {
            if (x==Array[i]) {
                System.out.println(++i);
                return;
            }
        }
            System.out.println("NO");*/

/*        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        boolean flag = false;
        for (int j : array) {
            if (j % 2 == 0) {
                flag = true;
                sum = sum + j;
            }
        }

        if (flag) {
            System.out.println(sum);
        }
        else {
            System.out.println("NO");
        }*/

/*        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        boolean flag = false;
        int r = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                flag = true;
                sum = sum + j;
                r++;
            }
        }
        sum = sum / r;
        String res = String.format("%.2f", sum);
        if (flag) {
            System.out.println(res);
        }
        else {
            System.out.println("NO");
        }*/

/*        int n = sc.nextInt();

        int[] array = new int[n];
        int num = 4;
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
            num = num + 3;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/

/*        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =  tmp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/

/*        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        int maxFrequency = 0;
        int mostFrequentElement = array[0];

        for (int i = 0; i < n; i++) {
            int currentElement = array[i];
            frequencyMap.put(currentElement, frequencyMap.getOrDefault(currentElement, 0) + 1);
            int currentFrequency = frequencyMap.get(currentElement);


            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostFrequentElement = currentElement;
            } else if (currentFrequency == maxFrequency && currentElement < mostFrequentElement) {
                mostFrequentElement = currentElement;
            }
        }
        System.out.println(mostFrequentElement);*/

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


/*        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        List<Integer> negativeList = new ArrayList<>();
        List<Integer> nonNegativeList = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                negativeList.add(arr[i]);
            } else {
                nonNegativeList.add(arr[i]);
            }
        }


        for (int num : negativeList) {
            System.out.print(num + " ");
        }
        for (int num : nonNegativeList) {
            System.out.print(num + " ");
        }*/

        int maxcount = 0;
        int element_having_max_freq = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxcount) {
                maxcount = count;
                element_having_max_freq = arr[i];
            }
        }

        System.out.println(element_having_max_freq);

    }
}
