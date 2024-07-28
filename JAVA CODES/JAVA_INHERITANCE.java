class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and Setting X now");
        this.x = x;
    }
}
class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class JAVA_INHERITANCE {
    public static void main(String[] args) {
Derived b = new Derived();
b.setX(5);
        System.out.println(b.getX());
    }
}
