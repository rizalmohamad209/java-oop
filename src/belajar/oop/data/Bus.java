package belajar.oop.data;

public class Bus implements Cars{

    public void drive() {
        System.out.println("Bus Sinar Jaya");
    }


    public int getTire() {
        return 30;
    }


    public boolean isBig() {
        return true;
    }


    public String getBrand() {
        return "HINO";
    }


    public boolean isMaintenance() {
        return false;
    }
}
