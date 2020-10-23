package Arrays;

import java.util.*;

public class MinMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter num of elements you want in array: ");
        n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        {
            int max = a[0];
            int min = a[0];
            for (int i = 0; i < n; i++) {
                if (a[i] > max) {
                    max = a[i];
                } else if (a[i] < min) {
                    min = a[i];
                }
            }

            System.out.println("Minimum number is:" + min);
            System.out.println("Maximum number is:" + max);
        }
    }
}
