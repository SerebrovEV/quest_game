package org.learn;

import java.util.*;

import static java.util.List.*;

class Scratch {

    public static int[] example = new int[]{1, 2, 1, 44, 10, 2, 15, 8, 7, 9, 11};
    public static String[] example2 = new String[]{"1", "2", "1", "44", "1", "2", "15", "91", "7", "91", "11"};
    private static List<String> strings = new ArrayList<>(of("ab", "cd", "vd", "sd", "we", "gdfr", "dsfsd", "dsd", "ewrwe", "dfs", "rty", "yutir"));
    static User user1 = new User("a1", 12);
    static User user2 = new User("a2", 13);
    static User user3 = new User("a1", 14);
    static User user4 = new User("a3", 10);
    static User user5 = new User("a4", 10);
    static User user6 = new User("a1", 15);
    static User user7 = new User("a3", 11);
    static User user8 = new User("a5", 10);
    static User user9 = new User("a7", 14);
    static User user10 = new User("a4", 10);


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
        //           String s3 = task10(example2);
//           System.out.println(s3);
//        List<User> users = List.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10);
//        System.out.println(task13(users));
//        List<Integer> lists = new ArrayList<>();
//        for (int i = 0; i <= 100; i++) {
//            lists.add(i % 5);
//        }
//        lists = lists.stream()
//                .distinct()
//                .toList();
//        System.out.println(lists);
        System.out.println(task12(strings));

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
        return of(string.split(""));

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

    //5 Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age

    //10 Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.

    public static String task10(String[] sm) {

        List<String> list = new ArrayList<>(of(sm));
//        String a = "";
//        for (int i = 0; i < list.size(); i++) {
//            a = list.get(i);
//            for (int j = 1 + i; j < list.size(); j++) {
//                if (a.equals(list.get(j))) {
//                    list.remove(j);
//                }
//            }
//        }
        return list.stream()
                .distinct()
                .toList()
                .toString();
    }

    //11 Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: “Название книги” Имя Отчество Фамилия автора
    public static String[] task11(String[] strings) {

        return null;
    }

    //12 Необходимо реализовать следующий метод:
    //На вход получаем список названий книг
    //Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
    //Все книги должны быть отсортированы по алфавиту с первой до последней полки
    //Количество полок константное - 5 штук
    //Вернуть книги распределенные по полкам
    public static List<String> task12(List<String> books) {

        System.out.println(books);
        HashMap<String, Integer> bookOnShelf = new HashMap<>();
//        for (int i = 0; i < books.size(); i++) {
//            int shelf = books.size() % 5;
//            if (shelf == 0) {
//                bookOnShelf.put(books.get(i),1);
//            }
//            if (shelf == 1) {
//                bookOnShelf.put(books.get(i),2);
//            }
//            if (shelf == 2) {
//                bookOnShelf.put(books.get(i),3);
//            }
//            if (shelf == 3) {
//                bookOnShelf.put(books.get(i),4);
//            }
//            if (shelf == 4) {
//                bookOnShelf.put(books.get(i),5);
//            }
//        }
        for (int i = 0; i < books.size(); i++) {
            int shelf = i % 5;
            if (shelf == 0) {
                books.set(i, books.get(i) + " полка №1");
                continue;
            }
            if (shelf == 1) {
                books.set(i, books.get(i) + " полка №2");
                continue;
            }
            if (shelf == 2) {
                books.set(i, books.get(i) + " полка №3");
                continue;
            }
            if (shelf == 3) {
                books.set(i, books.get(i) + " полка №4");
                continue;
            }
            if (shelf == 4) {
                books.set(i, books.get(i) + " полка №5");
                continue;
            }
        }
       // return bookOnShelf;
        return books.stream().sorted().toList();
    }
    //13 Дан класс User, который содержит поля с именем и возрастом. Необходимо реализовать следующий метод:
    //На входе коллекция пользователей
    //Необходимо удалить все дубли (одинаковое имя и возраст)
    //Отсортировать по возрасту и имени
    //Вернуть самого старого пользователя

    public static User task13(Collection<User> collection) {
        List<User> users = new ArrayList<>(copyOf(collection));
        users = users.stream()
                .distinct()
                .toList();
        System.out.println(users);
        return users.stream()
                .max(Comparator.comparing(User::getAge))
                .get();

        //  return collection.stream()
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