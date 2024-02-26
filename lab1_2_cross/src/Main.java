import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо двоцифрове число з консолі
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();

        // Перевіряємо, чи введене число є двоцифровим
        if (number < 10 || number > 99) {
            System.out.println("The entered number is not a two-digit number.");
            return;
        }

        // Отримуємо першу і другу цифри числа
        int firstDigit = number / 10;
        int secondDigit = number % 10;

        // Формуємо нове число шляхом перестановки цифр
        int permutation = secondDigit * 10 + firstDigit;

        System.out.println("A number obtained by permuting its digits: " + permutation);
    }
}

