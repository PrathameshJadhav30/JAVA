
class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

public class JAVA_PRACTICE_SET_9 {
    public static void main(String[] args) {

       cylinder mycylinder = new cylinder();
       mycylinder.setHeight(12);
       int h = mycylinder.getHeight();
        System.out.println(h);
        mycylinder.setRadius(9);
        int r = mycylinder.getRadius();
        System.out.println(r);
    }
}
