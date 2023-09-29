public class LucasSequence {
    private int n;
    private Number[] numbers;
    public LucasSequence(int n){
        this.numbers = new Number[n];
        this.numbers[0] = new Number();
        this.numbers[0].setValue(2);
        this.numbers[0].setSequence_number(0);

        this.numbers[1] = new Number();
        this.numbers[1].setValue(1);
        this.numbers[1].setSequence_number(1);

        int i = 2;

        while (i<n){
            this.numbers[i] = new Number();
            this.numbers[i].setValue(this.numbers[i-2].getValue()+this.numbers[i-1].getValue()); // n2 = n1+n2;
            this.numbers[i].setSequence_number(this.numbers[i-1].getSequence_number()+1);

//            if (this.numbers[i].is_prime())
//                System.out.printf("Число Люка %d з порядковим номером %d є простим\n", this.numbers[i].getValue(), this.numbers[i].getSequence_number());
            i++;
        }
    }

    public Number[] getNumbers() {
        return numbers;
    }
//    public Number[] getPrimeNumbers() {
//        Number[] prime_numbers;
//        for (int i = 0; i < this.n; i++){
//            if (numbers[i].is_prime()) {
//                prime_numbers[numbers.length] = numbers[i];
//            }
//        }
//        return prime_numbers;
//    }
}
