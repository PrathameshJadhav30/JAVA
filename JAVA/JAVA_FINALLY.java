public class JAVA_FINALLY {
    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 8;
            int c = a/b;
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the End of program");
        }
    }
}
