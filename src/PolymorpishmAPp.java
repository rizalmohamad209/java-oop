public class PolymorpishmAPp {
    public static void main(String[] args) {
        Employee employee = new Employee("Rizal");
        employee.sayHello("Mohamad");

        employee = new Manager("Rizal");
        employee.sayHello("Mohamad");

        employee = new VicePresident("Rizal");
        employee.sayHello("Mohamad");

        sayHello(new Employee("Mohamad"));
        sayHello(new Manager("Rizal"));
        sayHello(new VicePresident("Khamami"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "+ manager.name);
        }else if(employee instanceof VicePresident){
            VicePresident vice = (VicePresident) employee;
            System.out.println("Hello VP "+ vice.name);
        }else{
            System.out.println("Hello Employee "+ employee.name);
        }

    }
}
