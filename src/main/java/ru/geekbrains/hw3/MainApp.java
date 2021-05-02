package ru.geekbrains.hw3;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        invertArray();
        System.out.println("");
        fillArray();
        System.out.println("");
        changeArray();
        System.out.println("");
        fillDiagonal();
        System.out.println("");
        enterArray();
        System.out.println("");
        minAndMax();
        System.out.println("");
    }


    public static void invertArray() {
        int arr[] = new int[]{1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print(arr[i] + 1 + " ");
            } else {
                System.out.print(arr[i] - 1 + " ");
            }
        }
    }

    public static void fillArray() {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray() {
        int arr[] = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        int a = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = arr[i][a - i] = 1;
            System.out.println(Arrays.toString(arr[i]));
            }
    }

    public static void enterArray() {
        int len=5;
        int initialValue=5;
        int [] array=arr(len,initialValue);
        System.out.println(Arrays.toString(array));
    }
    private static int[] arr(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++)
            array [i]=initialValue;
        return array;

    }

    public static void minAndMax() {
        int [] arr = new int[]{10, 2, 8, 1, 23};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= min){
                min = arr[i];
            }else if (arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение:  " + min);
        System.out.println("Максимальное значение:  " + max);

    }

}






