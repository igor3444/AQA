package part_3.homework.task4;

public class Task4 {
    public static void main(String[] args) {
//        Дано: целочисленное число n, начальное значение может быть любое.
//        Напишите программу, которая определяет: (можно сделать не все варианты, а выбрать понравившийся)

        int n = 972;                                 //Сюда подставить своё число

//        а) количество цифр в нем;
        int length = String.valueOf(n).length();
        System.out.println("а) " + length);

//       б) сумму его цифр;
        int sum = 0;
        int num = n;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("б) " + sum);

//        в) произведение его цифр;
        int comp = 1;
        int num1 = n;
        while (num1 > 0) {
            comp = comp * (num1 % 10);
            num1 = num1 / 10;
        }
        System.out.println("в) " + comp);

//        г) среднее арифметическое его цифр;
        int sum1 = 0;
        double average = 0;
        int num2 = n;
        while (num2 > 0) {
            sum1 = sum1 + num2 % 10;
            num2 = num2 / 10;
        }
        average = (double) sum1 / String.valueOf(n).length();
        System.out.printf("г) " + "%.2f", average);
        System.out.println();

//        ж) его первую цифру;
        int firstChar = 0;
        int num3 = n;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            firstChar = num3 % 10;
            num3 = num3 / 10;
        }
        System.out.println("ж) " + firstChar);

//        з) сумму его первой и последней цифр.
        int sumFirstAndLast = n;
        while (sumFirstAndLast > 10) {
            sumFirstAndLast = sumFirstAndLast / 10;
        }
        sumFirstAndLast = sumFirstAndLast + (n % 10);
        System.out.println("з) " + sumFirstAndLast);
    }
}
