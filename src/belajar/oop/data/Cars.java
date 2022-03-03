package belajar.oop.data;

public interface Cars extends HasBrand, Maintenance {

    void drive();

    int getTire();

   default boolean isBig(){
        return false;
    }
}
