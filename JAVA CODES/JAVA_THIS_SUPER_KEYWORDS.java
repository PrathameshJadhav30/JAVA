class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int v){
        a = v;
    }
    public int returnone(){
        return 1;
    }

}

public class JAVA_THIS_SUPER_KEYWORDS {
    public static void main(String[] args) {
       Ekclass e = new Ekclass(5);
        System.out.println(e.getA());
    }
}
