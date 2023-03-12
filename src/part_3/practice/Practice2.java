package part_3.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // Составте программу, выводящую на экран квадраты чисел от 10 до 20
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число от 10 до 20: ");
//        int num = in.nextInt();
//        int sqrNum = (int) Math.pow(num, 2);
//        System.out.println(sqrNum);

//        for (int i = 10; i < 20; i++) {
//            System.out.println(i-9 + ". " + (int) Math.pow(i, 2));
//          int number;
//          for (number=10; number <= 20; number++) {
//              System.out.println(number * number);
//          }
//        int number = 10;
//          while (number <= 20) {
//              System.out.println(number * number);
//              number++;
        // Составьте программу, которая заменяет все точки на пробелы в строке
//
//        String str = "Мороз.и.солнце.день.чудесный";
//        System.out.println(str);
//
//        StringBuilder builder = new StringBuilder();
//        int begin = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '.') {
//                builder.append(str.substring(begin, i));
//                builder.append(' ');
//                begin = i + 1;
//            }
//        }
//        builder.append(str.substring(begin));
//        System.out.println(builder.toString()) ;

        // Дано натуральное n. Вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
//        int n = 100;
//        double sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += (double) 1 / i;
//        }
//        System.out.printf("%.2f", sum);

        // Составте программу, которая определяет кол-во отрицательных, кол-во положительных и кол-во нулей среди введённых чисел. Значения n вводятся с клавиатуры.
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите 5 чисел:");
//        int countNegative = 0;
//        int countPositive = 0;
//        int countZero = 0;
//        for (int i = 0; i < 5; i++) {
//            int n = in.nextInt();
//            if (n < 0) {
//                countNegative++;
//            } else if (n > 0) {
//                countPositive++;
//            } else if (n == 0) {
//                countZero++;
//            }
//        }
//        System.out.println("Кол-во отрицательных чисел = " + countNegative);
//        System.out.println("Кол-во положительных чисел = " + countPositive);
//        System.out.println("Кол-во нулей = " + countZero);

//        int countNegative = 0;
//        int countPositive = 0;
//        int countZero = 0;
//        String str = "10 -2 1 3 4";
//
//        if (str.charAt(0) == '-') {
//            countNegative++;
//        } else {
//            countPositive++;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                if (str.charAt(i + 1) == '-') {
//                    countNegative++;
//                } else {
//                    countPositive++;
//                }
//            }
//        }
//        System.out.println(countPositive);
//        System.out.println(countNegative);

        //Составьте программу, которая определяет количество вхождений подстроки a в строку b.
//        String a = "ab";
////        String b = "abc abba";
////        int count = 0;
////        for (int i = 0; i < b.length() - 1; i++) {
////            if (a.charAt(0) == b.charAt(i)) {
////                if (a.charAt(1) == b.charAt(i+1)) {
////                    count++;
////                }
////            }
////        }
////        System.out.println(count);
    int mod = 23/4;
        System.out.println(mod);
    }
}
