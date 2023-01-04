import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String myFirstDz;
        final int NUM = 123;
        String word = "Home work";
        myFirstDz = word + NUM;

        System.out.println(NUM + " " + word + " " + myFirstDz);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число.");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное чило");
        } else {
            System.out.println("Вы сохранили ноль.");
        }

        System.out.println("Введите имя : ");

        String name = scanner.nextLine();

        System.out.println("Привет " + name);
    }
}
