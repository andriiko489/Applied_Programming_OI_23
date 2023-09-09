import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Number n1 = new Number();
        n1.setValue(2);
        n1.setSequence_number(0);

        Number n2 = new Number();
        n2.setValue(1);
        n2.setSequence_number(0);

        Number temp = new Number();

        System.out.print("Введіть номер числа Люка до якого потрібно виконати обчислення, воно має бути не менше двійки: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        while (n<2){
            System.out.printf("Число %d є менше двійки, спробуйте знову: ",n);
            n = scan.nextInt();
        }

        System.out.print("Число Люка 1 з порядковим номером 2 є простим\n");

        while (n2.getSequence_number()<n){
            temp.set(n2);

            n2.setValue(n1.getValue()+n2.getValue()); // n2 = n1+n2;
            n2.setSequence_number(n2.getSequence_number()+1);

            n1.set(temp);
            if (n2.is_prime())
                System.out.printf("Число Люка %d з порядковим номером %d є простим\n", n2.getValue(), n2.getSequence_number());
        }
    }
}