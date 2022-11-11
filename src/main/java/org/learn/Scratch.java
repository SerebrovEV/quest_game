package org.learn;

import javax.management.StringValueExp;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Scratch {

    public static int[] example = new int[]{1, 2, 1, 44, 10, 2, 15, 8, 7, 9, 11};
    public static String[] example2 = new String[]{"1", "2", "1", "44", "1", "2", "15", "91", "7", "91", "11"};
    private static List<String> strings = new ArrayList<>(List.of("ab", "cd", "vd", "sd", "we"));

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(example));
//        System.out.println(task14(example));
//        System.out.println(Arrays.toString(task4(example)));
//        System.out.println(Arrays.toString(example));
//        System.out.println(strings);
//        System.out.println(task1(strings));
//        System.out.println(strings);

        //      String exampleString = "tenet";
        //     System.out.println(task2(exampleString));
//        String s2 = "abcvfdhk";
//        System.out.println(task3(s2));
        //     String s3 = task10(example2);
        //    System.out.println(s3);


    }

    //1 Дан List <String> names. Удалите первую букву из каждого имени и верните отсортированный список. Данное задание решите в простом блокноте в Google-док.

    public static List<String> task1(List<String> list) {
        return list.stream()
                .map((s) -> s.substring(1))
                .toList();
    }

    //   2 Напишите программу, которая проверяет, является ли строка палиндромом. Данное задание решите в простом блокноте в Google-док.
    public static boolean task2(String string) {
        String newString = new StringBuilder(string).reverse().toString();

        return newString.equals(string);
    }

    //3  Напишите код, с помощью которого можно разделить строку на части.

    public static List<String> task3(String string) {
        return List.of(string.split(""));

    }

/*4  Напишите код, с помощью которого можно перевернуть массив. Данное задание решите в простом блокноте в Google-док
    Дан List <String> names. Удалите первую букву из каждого имени и верните отсортированный список. Данное задание решите в простом блокноте в Google-док.*/

    public static int[] task4(int[] work) {
        int j;
        for (int i = 0; i < work.length / 2; i++) {
            j = work[i];
            work[i] = work[work.length - 1 - i];
            work[work.length - 1 - i] = j;
        }
        return work;
    }
    //10 Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.

    public static String task10(String[] sm) {
//        TreeSet<String> hashSet = new TreeSet<>(List.of(sm));
//        return hashSet.toString();
        List<String> list = new ArrayList<>(List.of(sm));
        String a = "";
        for (int i = 0; i < list.size(); i++) {
            a = list.get(i);
            for (int j = 1 + i; j < list.size(); j++) {
                if (a.equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        return list.toString();
    }

    //11 Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: “Название книги” Имя Отчество Фамилия автора
    public static String[] task11(String[] strings) {

        return null;
    }

    //      14  Необходимо реализовать следующий метод:
//    Получаем на входе массив чисел
//    Все четные числа увеличиваем на единицу
//    Возвращаем кусок списка с 3-го по 7-й элемент
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
}