package Arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        double average = 0.0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");

        for (int i=0; i<10; i++) {
            numbers[i] = keyboard.nextInt();
            sum = sum + numbers[i];
        
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        
        average = sum / 10;

        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The average of the numbers is " + average);
        System.out.println("The max number is " + max);
        System.out.println("The min number is " + min);

    }
}
