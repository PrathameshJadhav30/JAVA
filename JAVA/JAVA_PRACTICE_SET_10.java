class circle{
    public int radius;
    circle(int r){
        this.radius = r;
        System.out.println("I am a parameterized constructor");
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends circle{
    public int height;
    cylinder1(int r, int h){
        super(r);
        this.height = h;
        System.out.println("I am constructor of class Cylinder1");
    }
    public double volume(){
        return  Math.PI*this.radius*this.radius*this.height;
    }
}
public class JAVA_PRACTICE_SET_10 {
    public static void main(String[] args) {
      //  circle obj = new circle(12);
        cylinder1 obj = new cylinder1(4,7);
    }
}
