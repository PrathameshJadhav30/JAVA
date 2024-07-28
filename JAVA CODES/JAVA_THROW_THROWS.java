public class JAVA_THROW_THROWS {
    public static int divide(int a, int b) throws ArithmeticException{
        //made by prathamesh
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        //shivam - uses divide function created by prathamesh
        try{
            int c = divide(6,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }

    }
}
