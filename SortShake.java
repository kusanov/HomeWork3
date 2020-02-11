package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortShake {
    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        Scanner in3 = new Scanner(System.in);
        int size3 = in3.nextInt();
        int[] mas3 = new int[size3];
        for (int i = 0; i < size3; i++) {
            mas3[i] = in3.nextInt();
        }
        System.out.println(Arrays.toString(mas3));
        int left = 0;
        int right = size3 - 1;
        do {
            for (int i = left; i < right; i++) {
                if (mas3[i] > mas3[i + 1]) {
                    int tmp = mas3[i];
                    mas3[i] = mas3[i + 1];
                    mas3[i + 1] = tmp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (mas3[i] < mas3[i - 1]) {
                    int tmp = mas3[i];
                    mas3[i] = mas3[i - 1];
                    mas3[i - 1] = tmp;
                }
            }
            left++;
        } while (left <= right);
        for (int i = 0; i < size3; i++) {
            System.out.print(mas3[i] + " ");
        }
    }
}