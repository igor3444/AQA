package part_2.theory;

public class Main {
    public static void main(String[] args) {
        //Примитивные типы
        int intNum = (int) Math.pow(2, 32);
        long longNum = 1L;
        byte byteNum = 1;
        short shortNum = 1;

        //Границы

        //Объявление и инициализация
        int count;
        count = 1;

        //Double.NaN
        double x = Double.NaN;
        boolean isDoubleNan = x == Double.NaN;

        //final
        final int DAYS_AT_WEEK = 7;

        //Static final
        System.out.println(Calendar.DAYS_AT_WEEK);

        //Enum
        System.out.println(WeekDays.MON);
    }
}