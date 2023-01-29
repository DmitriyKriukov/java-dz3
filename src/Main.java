import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex1(randomList(10));
    }

    static void ex0(List<Integer> list) {
    /*
    Пусть дан произвольный список целых чисел, удалить из него четные числа
    */
        list.removeIf(number -> number % 2 == 0);
        System.out.println(list);
    }


    static List<Integer> randomList(int n) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        return list;

    }


    static void ex1(List<Integer> list) {
    /*
    Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое
    из этого списка. Collections.max()
    */
        int min = Collections.min(list);
        int max = Collections.max(list);
        int count = list.size();
        double sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        double result = sum / count;
        System.out.printf("Минимальное: %d, максимальное: %d, среднее арифметичское: %.2f", min, max, result);
    }
}