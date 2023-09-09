public class Number {
    private int value;
    private int sequence_number;

    public int getSequence_number() {
        return sequence_number;
    }

    public int getValue() {
        return value;
    }

    public void setSequence_number(int sequence_number) {
        this.sequence_number = sequence_number;
    }

    public void setValue(int value) {
        this.value = value;
    }
    /**
     * Check if num is prime
     *
     * @return True if num is prime else return False
     */
    public boolean is_prime(){
        int n = this.value;
        int k = 0;
        for (int i = 2; i<=n/2; i++){
            if (n%i==0)
                k++;
        }
        return k==0;
    }
}
