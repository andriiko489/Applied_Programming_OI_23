import java.util.Scanner;

public class Phone {
    int id;
    String first_name;
    String last_name;
    int phone_number;
    float city_call_time;
    float intercity_call_time;

    public int getId() {
        return id;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public float getCity_call_time() {
        return city_call_time;
    }

    public float getIntercity_call_time() {
        return intercity_call_time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setCity_call_time(float city_call_time) {
        this.city_call_time = city_call_time;
    }

    public void setIntercity_call_time(float intercity_call_time) {
        this.intercity_call_time = intercity_call_time;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone_number=" + phone_number +
                ", city_call_time=" + city_call_time +
                ", intercity_call_time=" + intercity_call_time +
                '}';
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        first_name = scanner.next();
        last_name = scanner.next();
        phone_number = scanner.nextInt();
        city_call_time = scanner.nextFloat();
        intercity_call_time = scanner.nextFloat();
    }
}
