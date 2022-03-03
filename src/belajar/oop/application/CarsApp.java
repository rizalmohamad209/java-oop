package belajar.oop.application;

import belajar.oop.data.Avanza;
import belajar.oop.data.Bus;
import belajar.oop.data.Cars;

public class CarsApp {
    public static void main(String[] args) {
        Cars av = new Avanza();
        av.drive();
        System.out.println(av.getBrand());
        System.out.println(av.getTire());
        System.out.println(av.isMaintenance());
        System.out.println(av.isBig());

        System.out.println("============================");
        Cars bus = new Bus();
        bus.drive();
        System.out.println(bus.getBrand());
        System.out.println(bus.isMaintenance());
        System.out.println(bus.getTire());
        System.out.println(bus.isBig());
    }
}
