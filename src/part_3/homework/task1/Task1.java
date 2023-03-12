package part_3.homework.task1;

public class Task1 {
    public static void main(String[] args) {
        int count = 10;

        if (count % 2 == 0) {
            System.out.println((int) Math.pow(count, 10));
        } else {
            System.out.println((int) Math.pow(count, 3));
        }
    }
}
