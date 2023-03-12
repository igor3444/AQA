package part_3.homework.task3;

public class Task3 {
    public static void main(String[] args) {
//        Дано: строка str,  начальное значение можно указать любое.
//        Напишите программу, которая удаляет в строке все лишние пробелы, то есть серии подряд идущих пробелов заменяет на одиночные пробелы. Крайние пробелы в строке также должны удалиться.
//        Пример: str = " привет,   в этой    строке лишние   пробелы.  "
//        Результат: "привет, в этой строке лишние пробелы"

        String str = "    Мороз  и   солнце день     Чудесный                    ";
        StringBuilder builder = new StringBuilder();

        int countSpace = 0;
        int countChar = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                builder.append(str.charAt(i));
                countSpace = 0;                                                          //Если мы встретили букву, то обнуляем наш счётчик пробелов
                countChar++;
            } else if (str.charAt(i) == ' ') {
                countSpace++;                                                            //Если мы встретили пробел, то начинаем их считать. Потому что пробелов может быть несколко
                if ((countSpace == 1) && (countChar > 0)) {                              //Если нам попался один пробел и это не начало строки, то в builder кладём пробел
                    builder.append(' ');
                }
            }
        }
        builder.deleteCharAt(builder.length() - 1);                                //Удаляем последний пробел
        System.out.println(builder.toString());
    }
}
