package dsa.Array.Level1;

import java.util.Scanner;

public class DifferenceOfTwoArray {
    public static void diffTwoArray(int a1[], int a2[]){
        int n1 = a1.length;
        int n2 = a2.length;
        int result [] = new int[n2];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = result.length - 1;
        int carry = 0;
        while(k >= 0){
            int d =0;
            int a1_val = i >= 0 ? a1[i] : 0;

            if(a2[j] + carry >= a1_val){
                d = a2[j] + carry - a1_val;
                carry = 0;
            }
            else{
                d = a2[j] + carry + 10 - a1_val;
                carry = -1;
            }
            result[k] = d;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while(index < result.length){
            if(result[index] == 0){
                index++;
            }
            else{
                break;
            }
        }
        System.out.println("Index " + index);
        while(index < result.length){
            System.out.print(result[index]);
            index++;
        }
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
        // Array2 - Array1, array2 will be greater than array1
        diffTwoArray(array1, array2);
    }
}
