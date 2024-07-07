abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends  Pen{
    void write(){
        System.out.println("Writing");
    }
    void refill(){
        System.out.println("Refilling");
    }
    void changeNib(){
        System.out.println("Changing a Nib ");
    }
}
public class JAVA_PRACTICE_SET_11 {
    public static void main(String[] args) {
        FountainPen Pen = new FountainPen();
        Pen.changeNib();

    }
}
