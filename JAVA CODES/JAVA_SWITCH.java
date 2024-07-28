
import java.util.Scanner;
public class JAVA_SWITCH {
    public static void main(String[] args){
        int age;
        System.out.println("Enter a age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("Adult");
                break;
            case 23:
                System.out.println("Join a Job");
                break;
            case 60:
                System.out.println("retired");
                break;
            default:
                System.out.println("Enjoy a Life");
        }
    }
}
