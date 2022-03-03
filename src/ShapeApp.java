public class ShapeApp {

    public static void main(String[] args) {
        Shape sh = new Shape();
        System.out.println(sh.getCorner());
        Rectangle rc = new Rectangle();
        System.out.println(rc.getCorner());
        System.out.println(rc.getParentCorner());
    }
}
