package com.gmail.xapchenko2000;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int arraySize;

    public static void main(String[] args) {

        Scanner size = new Scanner(System.in);
        Scanner number = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        arraySize = size.nextInt();

        int[] array = new int[arraySize];


        for (int i = 0; i < array.length; i++) {
            array[i] = number.nextInt();
            System.out.print(array[i] + "  ");
        }


        int min = array[0];
        int max = array[0];
        int counerOfFive = 0;
        for (int i = 0; i < array.length; i++) {//нахождение минимального и максимального

            if (array[i] < min)
                min = array[i];

            if (array[i] > max)
                max = array[i];

            if (array[i] == 5)
                counerOfFive++;
        }
        System.out.println();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("5: " + counerOfFive);
        System.out.println(Arrays.toString(Sort(array)));//Вывод сортированого массива


    }

    public static int[] Sort(int[] array) {//сортировка пузырьком
        int i = 0;
        int pairs = 0;
        while (true) {
            if (array[i] > array[i + 1]) {
                int q = array[i];
                array[i] = array[i + 1];
                array[i + 1] = q;
                pairs = 0;
            } else {
                pairs++;
            }
            i++;
            if (i == array.length - 1) {
                i = 0;
            }
            if (pairs == array.length - 1) break;
        }
        return array;
    }


}


