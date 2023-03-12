package part_3.homework.task5;

public class Task5 {
    public static void main(String[] args) {
//        Дано: строка str, начальное значение может быть любое.
//        Напишите программу, считающую количество цифр 1, 2, 3 в строке.
//        Пример: str = "сегодня мы купили 1 яблоко, 1 грушу и 2 апельсина"
//        Кол-во 1: 2
//        Кол-во 2: 1
//        Кол-во 3: 0

        String str = "сегодня мы купили 1 яблоко, 1 грушу и 2 апельсина";
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count1++;
            } else if (str.charAt(i) == '2') {
                count2++;
            } else if (str.charAt(i) == '3') {
                count3++;
            }
        }
        System.out.println("Кол-во 1: " + count1);
        System.out.println("Кол-во 2: " + count2);
        System.out.println("Кол-во 3: " + count3);
    }
}
