package Sort;


import java.util.Arrays;
import java.util.Scanner;

public class SortChoise {
    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] mas = new int[size];
        for (int i = 0; i < size; i++) {
            mas[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(mas));
        for (int left = 0; left < size; left++) {
            int minInd = left;
            for (int j = left; j < size; j++) {
                if (mas[j] < mas[minInd]) {
                    minInd = j;
                }
            }
            int tmp = mas[left];
            mas[left] = mas[minInd];
            mas[minInd] = tmp;
        }
        System.out.println(Arrays.toString(mas));
    }
}
