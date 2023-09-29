/**
 * Number class for presenting numbers in sequences
 */
public class Number {
    private int value;
    private int sequence_number;

    /**
     * Get sequence number
     *
     * @return sequence number
     */
    public int getSequence_number() {
        return sequence_number;
    }

    /**
     * Get value
     *
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Set new sequence_number
     *
     * @param sequence_number new sequence number, that will be setted instead current
     */
    public void setSequence_number(int sequence_number) {
        this.sequence_number = sequence_number;
    }

    /**
     * Set new value
     *
     * @param value new value, that will be setted instead current
     */
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

    /**
     * Function set properties from another Number object
     *
     * @param number Object from which fields will be copied
     */
    public void set(Number number){
        this.value = number.getValue();
        this.sequence_number = number.getSequence_number();
    }

    @Override
    public String toString() {
        return "Число №" + sequence_number + " з значенням " + value;
    }
}
