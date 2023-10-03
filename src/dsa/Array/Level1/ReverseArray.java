package dsa.Array.Level1;

import java.util.Scanner;

public class ReverseArray {

    public static void reverseAnArray(int arr[]){
        int n1 = arr.length;
        int i = 0;

        while(i < n1/2 ){
            int c = arr[i];
            arr[i] = arr[n1 - i - 1];
            arr[n1 - i - 1] = c;
            i++;
        }
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

        reverseAnArray(array);

    }
}
