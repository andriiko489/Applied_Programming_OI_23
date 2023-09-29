import java.util.Scanner;

/**
 * Just main class
 */
public class Main {

    public static int get_sequence_number(){
        int n;
        System.out.print("Введіть номер числа Люка до якого потрібно виконати обчислення, воно має бути не менше двійки: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        while (n<2){
            System.out.printf("Число %d є менше двійки, спробуйте знову: ",n);
            n = scan.nextInt();
        }
        return n;
    }
    /**
     * main function
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        int n = get_sequence_number();

        LucasSequence sequence = new LucasSequence(n);
        Number[] numbers = sequence.getNumbers();
        for(int i=0; i<n; i++){
            if (numbers[i].is_prime())
                System.out.printf("\n%s є простим",numbers[i].toString());
        }
    }
}