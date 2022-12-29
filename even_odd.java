import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value % 2 ==0) {
            System.out.println(value + " / 2 = " + value / 2 + " => Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
