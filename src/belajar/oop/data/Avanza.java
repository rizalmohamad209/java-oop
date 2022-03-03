package belajar.oop.data;

public class Avanza implements Cars{

    @Override
    public void drive() {
        System.out.println("Drive Avanza");
    }

    @Override
    public int getTire() {
        return 10;
    }

    @Override
    public String getBrand() {

        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
