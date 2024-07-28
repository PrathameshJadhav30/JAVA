import java.util.Scanner;
public class JAVA_input {
    public static void main(String[] args)
    {
        System.out.println("Taking Input From User");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number 1");
        int a = sc.nextInt();
     //   boolean b1=sc.hasNext();
      //  System.out.println(b1);
        System.out.println("Enter a Number 2");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
     //   String str= sc.nextLine();
      //  System.out.println(str);
    }
}
