package belajar.oop.application;

public class EqualsAPp {
    public static void main(String[] args) {
        String first = "Rizal";
        first = first+" "+"Mohamad";
        System.out.println(first);

        String second = "Rizal Mohamad";
        System.out.println(second);

        System.out.println(first == second); //akan menghasilkan false

        String third = "Rizal Mohamad";
        System.out.println(second == third); //akan menghasilkan true
        
        //untuk membandingkan string menggunakan equals karena bukan tipe data primitiv
        System.out.println(first.equals(second)); //akan menghasilkan true karena menggunakan method equals
    }
}
