public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.nama = "Mohamad Rizal Khamami";
        person1.address = "Brebes";
//        person1.countr = "US"  error karena final tidak bisa di modify

        System.out.println(person1.nama);
        System.out.println(person1.address);
        System.out.println(person1.countr);

        person1.sayHello("Rehan");
    }
}
