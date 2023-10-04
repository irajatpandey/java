package dsa.Array.Level1;

import java.util.Scanner;

public class InverseArray {
    public static void inverseOfAnArray(int arr[]){

        int smallOutput [] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            smallOutput[arr[i]] = i;
        }
        for(int ele : smallOutput){
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

        inverseOfAnArray(array);
    }
}
