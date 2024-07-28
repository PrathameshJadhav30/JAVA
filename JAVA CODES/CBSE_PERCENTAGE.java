import java.util.Scanner;
public class CBSE_PERCENTAGE {
    public static void main(String[] args)
    {
        System.out.println("Taking Input From User");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of Maths");
        int a = sc.nextInt();
        System.out.println("Enter marks of DBMS");
        int b= sc.nextInt();
        System.out.println("Enter marks of DA");
        int c= sc.nextInt();
        System.out.println("Enter marks of EV");
        int d= sc.nextInt();
        int percentage= a+b+c+d;
        System.out.println(percentage/4);
    }
}
