public class VicePresident extends Manager{

    VicePresident(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello "+this.name+" My Vicepresident is "+ name);
    }


}
