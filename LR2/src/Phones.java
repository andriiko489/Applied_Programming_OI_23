public class Phones {
    public Phone[] phones;
    public void read(int n){
        System.out.print("Вводіть телефони для телефонів в такому форматі:");
        System.out.print("\n{id} {first_name} {last_name} {phone_number} {city_call_time} {intercity_call_time}\n");
        phones = new Phone[n];
        for(int i = 0; i<n; i++){
            System.out.printf("Введіть дані для телефону №%d: ", i+1);
            Phone phone = new Phone();
            phone.read();
            phones[i] = phone;
            System.out.printf("%s\n", phones[i].toString());
        }
    }

    public void city_call_calling_more_than(int min_time){
        for(int i = 0; i<phones.length; i++){
            if (phones[i].city_call_time>min_time){
                System.out.printf("%s\n", phones[i].toString());
            }
        }
    }

    public void all_who_used_intercity_call(){
        for(int i = 0; i<phones.length; i++){
            if (phones[i].intercity_call_time>0){
                System.out.printf("%s\n", phones[i].toString());
            }
        }
    }

    public void numbers_in_range(int min_number, int max_number){
        for(int i = 0; i<phones.length; i++){
            if (min_number<=phones[i].phone_number && phones[i].phone_number<=max_number){
                System.out.printf("%s\n", phones[i].toString());
            }
        }
    }
}
