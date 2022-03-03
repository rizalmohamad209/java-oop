public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Rizal";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();
        parent.name= "khamami";
        System.out.println(parent.name);
    }
}
