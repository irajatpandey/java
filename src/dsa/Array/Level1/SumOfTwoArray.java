package dsa.Array.Level1;

import java.util.Scanner;

public class SumOfTwoArray {
    public static int [] addTwoArray(int arr1[], int arr2[]){
        int resultant_size = arr1.length > arr2.length ? arr1.length : arr2.length;
        int result[] = new int[resultant_size];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;
        int carry = 0;
        while(k >= 0){
            int digit = carry;
            if(i >= 0){
                digit += arr1[i];
            }
            if(j >= 0){
                digit += arr2[j];
            }
            carry = digit / 10;
            digit = digit % 10;
            result[k] =  digit;
            i--;
            j--;
            k--;
        }
        if(carry != 0){
            System.out.print(carry);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int array1[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            Scanner input = new Scanner(System.in);
            array1[i] = input.nextInt();
        }

        int n2 = sc.nextInt();
        int array2[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            Scanner input = new Scanner(System.in);
            array2[i] = input.nextInt();
        }

        int []smallOutput = addTwoArray(array1, array2);
        for(int ele : smallOutput){
            System.out.print(ele + " ");
        }

    }
}
