package dsa.Array.Level1;

import java.util.Scanner;

public class RotateArray {
    public static void reverse(int arr[], int s, int e){

        while(s < e){
            int c = arr[s];
            arr[s] = arr[e];
            arr[e] = c;
            s++;
            e--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void rotateAnArray(int arr[], int k){
        int n = arr.length;
        if(k < 0){
            k = k + arr.length;
        }
        k = k % n;

        reverse(arr, 0, n -k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        rotateAnArray(array, k);
    }
}

