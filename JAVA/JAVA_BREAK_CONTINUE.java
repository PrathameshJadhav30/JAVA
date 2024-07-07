public class JAVA_BREAK_CONTINUE {
    public static void main(String[] args)
    {
        //Break and Continue using loops
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            System.out.println("Java is Great");
            if(i==2){
                System.out.println("ending the loop");
                break;
            }
        }
        int a=0;
        while(a<5)
        {
            System.out.println(a);
            System.out.println("Java is Great");
            if(a==2){
                System.out.println("ending the loop");
                break;
            }
           a++;
        }
        for(int i=0;i<50;i++)
        {
            System.out.println(i);
            System.out.println("Java is Great");
            if(i==2){
                System.out.println("ending the loop");
                continue;
            }
        }
    }
}
