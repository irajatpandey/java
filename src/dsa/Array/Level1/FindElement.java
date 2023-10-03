package dsa.Array.Level1;

import java.util.Scanner;

public class FindElement {
    public static int findElementInAnArray(int arr[], int ele){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            Scanner input = new Scanner(System.in);
            array[i] = input.nextInt();
        }

        int ele = sc.nextInt();

        int index = findElementInAnArray(array, ele);
        System.out.println(index);
    }
}
