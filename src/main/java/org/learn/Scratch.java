package org.learn;

import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {

//      14  Необходимо реализовать следующий метод:
//        Получаем на входе массив чисел
//        Все четные числа увеличиваем на единицу
//        Возвращаем кусок списка с 3-го по 7-й элемент


// 4  Напишите код, с помощью которого можно перевернуть массив. Данное задание решите в простом блокноте в Google-док.

        int[] example = new int[]{1, 2, 1, 44, 10, 2, 15, 8, 7, 9, 11};
        System.out.println(Arrays.toString(example));
        System.out.println(task14(example));
        System.out.println(Arrays.toString(task4(example)));
        System.out.println(Arrays.toString(example));

    }

    public static String task14(int[] work) {
        for (int i = 0; i < work.length - 1; i++) {
            if (work[i] % 2 == 0) {
                work[i] += 1;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 3; i < 8; i++) {
            result.append(work[i] + " ");
        }
        return result.toString();
    }

    public static int[] task4(int[] work) {
        int j;
        for (int i = 0; i <work.length / 2; i++) {
            j = work[i];
            work[i] = work[work.length - 1 - i];
            work[work.length - 1 - i] = j;
        }
        return work;
    }
}