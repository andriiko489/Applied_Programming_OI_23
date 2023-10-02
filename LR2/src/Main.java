import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмірність масиву: ");
        n = scanner.nextInt();
        Phones phones = new Phones();
        phones.read(n);
        System.out.print("Введіть мінімальний час міських розмов: ");
        int min_time;
        min_time = scanner.nextInt();

        System.out.printf("Аюоненти з часом міських розмов більшим за %d:\n", min_time);
        phones.city_call_calling_more_than(min_time);

        System.out.print("\nАбоненти, що користувались міжміським звязком:\n");
        phones.all_who_used_intercity_call();

        System.out.print("Введіть діапазон номерів телефону: ");
        int min_number, max_number;
        min_number = scanner.nextInt();
        max_number = scanner.nextInt();
        System.out.printf("Номери телефону що входять в діапазон від %d до %d\n", min_number, max_number);
        phones.numbers_in_range(min_number, max_number);
    }
}