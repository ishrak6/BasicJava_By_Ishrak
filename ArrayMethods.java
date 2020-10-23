package Arrays;

public class ArrayMethods {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Sum is: " + sum(array));
        System.out.println("Average is: " + average(array));
        System.out.println("Min is: " + min(array));
        System.out.println("Max is: " + max(array));
    }

    public static int sum(int[] x) {
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total;
    }

    public static int average(int[] x) {
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total / x.length;
    }

    public static int min(int[] x) {
        int temp = x[0];

        for (int i = 0; i < x.length; i++) {
            if (temp > x[i]) {
                temp = x[i];
            }
        }
        return temp;
    }
    
    public static int max(int[] x) {
        int temp = x[0];

        for (int i = 0; i < x.length; i++) {
            if (temp < x[i]) {
                temp = x[i];
            }
        }
        return temp;
    }   
}