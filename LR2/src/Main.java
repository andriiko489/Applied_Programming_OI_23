import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмірність масиву: ");
        n = scanner.nextInt();
        Phone [] phones = new Phone[n];
        System.out.print("Вводіть телефони для телефонів в такому форматі:");
        System.out.print("\n{id} {first_name} {last_name} {phone_number} {city_call_time} {intercity_call_time}\n");
        for(int i = 0; i<n; i++){
            System.out.printf("Введіть дані для телефону №%d: ", i+1);
            Phone phone = new Phone();
            phone.read();
            phones[i] = phone;
            System.out.printf("%s\n", phones[i].toString());
        }
        System.out.print("Введіть мінімальний час міських розмов: ");
        int min_time;
        min_time = scanner.nextInt();

        System.out.printf("Аюоненти з часом міських розмов більшим за %d:\n", min_time);
        for(int i = 0; i<n; i++){
            if (phones[i].city_call_time>min_time){
                System.out.printf("%s\n", phones[i].toString());
            }
        }

        System.out.print("\nАбоненти, що користувались міжміським звязком:\n");
        for(int i = 0; i<n; i++){
            if (phones[i].intercity_call_time>0){
                System.out.printf("%s\n", phones[i].toString());
            }
        }

        System.out.print("Введіть діапазон номерів телефону: ");
        int min_number, max_number;
        min_number = scanner.nextInt();
        max_number = scanner.nextInt();
        System.out.printf("Номери телефону що входять в діапазон від %d до %d\n", min_number, max_number);
        for(int i = 0; i<n; i++){
            if (min_number<=phones[i].phone_number && phones[i].phone_number<=max_number){
                System.out.printf("%s\n", phones[i].toString());
            }
        }
    }
}

// 1 андрій грималюк 222 222 222
// 2 авпва вапв 333 333 333
// 3 пвапвп вап 444 444 444