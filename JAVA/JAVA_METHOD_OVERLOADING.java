public class JAVA_METHOD_OVERLOADING {
    static void foo(){
        System.out.println("Good morning bro");
    }
    static void foo( int a){
        System.out.println("Good morning" + a + "bro");
    }

    static void telljoke(){
        System.out.println("I invented a new word!\n"  + "plagiarism");
    }
    public static void main(String[] args){
        telljoke();
        foo();
        foo(300);

    }
}
