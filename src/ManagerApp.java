public class ManagerApp {
    public static void main(String[] args) {
        Manager mn = new Manager("Rizal Mohamad");
//        mn.name="Rizal Mohamad";
//        System.out.println("Manager "+mn.name);
        mn.sayHello("Mohamad Rizal Khamami");

        VicePresident vp = new VicePresident("Rizal Mohamad");
//        vp.name="Mohamad Rizal Khamami";
//        System.out.println("Vice President "+ vp.name);
        vp.sayHello("Rizal Mohamad");
    }
}
