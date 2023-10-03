package dsa.Array.Level1;

import java.util.Scanner;

public class SpanOfArray {

    public static int findSpanOfAnArray(int arr[]){
        int min = arr[0];
        int max = arr[0];
        for(int ele : arr){
            if(ele > max){
                max = ele;
            }
            if(ele < min){
                min = ele;
            }
        }
        System.out.println(min);
        System.out.println(max);
        return max - min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i = 0; i < n; i++){
            Scanner input = new Scanner(System.in);
            int ele = input.nextInt();
            array[i] = ele;
        }

        int smallOutput = findSpanOfAnArray(array);
        System.out.println(smallOutput);

    }
}
