import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        String[] arr3 = {"rude", "silly", "funny", "crazy"};

        System.out.println();
        System.out.println("Задача 2");
        for (int index = 0; index < arr1.length; index++) {
            if (index == arr1.length - 1) {
                System.out.println(arr1[index]);
                break;
            }
            System.out.print(arr1[index] + ", ");
        }
        for (int index = 0; index < arr2.length; index++) {
            if (index == arr2.length - 1) {
                System.out.println(arr2[index]);
                break;
            }
            System.out.print(arr2[index] + ", ");
        }
        for (int index = 0; index < arr3.length; index++) {
            if (index == arr3.length - 1) {
                System.out.println(arr3[index]);
                break;
            }
            System.out.print(arr3[index] + ", ");
        }

        System.out.println();
        System.out.println("Задача 3");
        for (int index = arr1.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr1[index]);
                break;
            }
            System.out.print(arr1[index] + ", ");
        }
        for (int index = arr2.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr2[index]);
                break;
            }
            System.out.print(arr2[index] + ", ");
        }
        for (int index = arr3.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr3[index]);
                break;
            }
            System.out.print(arr3[index] + ", ");
        }

        System.out.println();
        System.out.println("Задача 4");
        for (int index = 0; index < arr1.length; index++) {
            if (arr1[index] % 2 != 0)
            {
                arr1[index]=arr1[index]+1;
            }
        }
        System.out.println(Arrays.toString(arr1));

    }
}