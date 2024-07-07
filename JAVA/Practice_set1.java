import java.util.Scanner;

public class Practice_set1 {
    public static void main (String[] args)
    {
      //  Question-1
       // add a three numbers
       int a=2;
        int b=4;
       int c=4;
       int sum = a+b+c;
     System.out.println(sum);

        // Question-2
        // Calculate cgpa of 3 subjects out of 100
        float subject1= 67;
          float subject2=88;
        float subject3=97;
        float cgpa=(subject1+subject2+subject3)/30;
        System.out.println(cgpa);

        //Question -3
        //take input from user as his name and print statement
      //  System.out.println("What is your name");
       // Scanner sc = new Scanner(System.in);
       // String name= sc.next();
      //  System.out.println("hello "  + name +  " have a good day");

        //Question-4
        // check enterd number is int or not
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
