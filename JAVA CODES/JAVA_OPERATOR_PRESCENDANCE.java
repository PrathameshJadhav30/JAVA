public class JAVA_OPERATOR_PRESCENDANCE {
    public static void main(String[] args)
    {
        int a= 6*5-34/2;
        /*
        highest precedence goes to * and /.evaluate left to right
        =30-34/2
        =30-17
        =13
         */
        int b = 60/5-34*2;
        /*
        =12-34*2
        =12-68
        =-56
         */
        System.out.println(a);
        System.out.println(b);
        //precedence & associativity-Left to right

        //Quick Quiz
        int x = 6;
        int y = 1;
        int k = x*y/2;
        System.out.println(k);
        
    }
}
