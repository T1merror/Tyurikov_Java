import java.util.Arrays;
import java.util.Scanner;

public class Task {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("***** First task *****");
        firstTask();
        System.out.println("***** Second task *****");
        secondTask();
        System.out.println("***** Third task *****");
        thirdTask();
    }

    /**
     * 1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”
     */
    public static void firstTask() {
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        if (x > 7) {
            System.out.println("Привет\n");
        }
    }

    /**
     * 2. Составить алгоритм: если введенное имя совпадаетс Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
     */
    public static void secondTask() {
        System.out.print("Введите имя: ");
        String x = scanner.next();

        String result = (x.equals("Вячеслав")) ? "Привет, Вячеслав" : "Нет такого имени";
        System.out.println(result + "\n");
    }

    /**
     * 3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
     */
    public static void thirdTask() {
        System.out.print("Введите размер: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Введите " + size + " значений: ");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

}

/**
 * 4. Дана скобочная последовательность: [((())()(())]]
 * - Можно ли считать эту последовательность правильной? //нет
 * - Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?
 * <p>
 * Чтобы скобочная последовательность стала правильной, нужно добавить одну квадратную скобку '[' и одну круглую скобку ')'
 * [[((())()(()))]]
 */