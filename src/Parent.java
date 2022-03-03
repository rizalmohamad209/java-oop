class Parent {
    String name;

    void doIt(){
        System.out.println("do it parent");
    }
}

class Child extends Parent{
    String name;


    void doIt() {
        System.out.println("do it child");
        System.out.println("Parent name is "+super.name);
    }
}
