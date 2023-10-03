package dsa.Array.Level1;

import java.util.Scanner;

public class BarChart {
    public static int getMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele > max) {
                max = ele;
            }
        }
        return max;
    }
    public static void printBarChart(int arr[]){
        int max = getMax(arr);

        for(int floor = max; floor >= 1; floor--){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner input = new Scanner(System.in);
            array[i] = input.nextInt();
        }
        printBarChart(array);

    }
}
