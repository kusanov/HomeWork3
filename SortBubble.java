package Sort;


import java.util.Arrays;
import java.util.Scanner;

public class SortBubble {
    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        Scanner in2 = new Scanner(System.in);
        int size2 = in2.nextInt();
        int[] mas2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            mas2[i] = in2.nextInt();
        }
        System.out.println(Arrays.toString(mas2));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int j = 1; j < size2; j++) {
                if (mas2[j] < mas2[j - 1]) {
                    int tmp2 = mas2[j];
                    mas2[j] = mas2[j - 1];
                    mas2[j - 1] = tmp2;
                    needIteration = true;
                }
            }
        }
                System.out.println(Arrays.toString(mas2));
            }
        }