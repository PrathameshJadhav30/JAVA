class Base1{
    Base1(){
        System.out.println("Mai Ek Constructor Hoon");
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am Constructor of Derived Class");
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class JAVA_CONSTRUCTORS_INHERITANCE {
    public static void main(String[] args) {
          Base1 b = new Base1();
          Derived1 d = new Derived1();

    }
}
