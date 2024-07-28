import java.util.Scanner;

public class JAVA_NESTED_TRY_CATCH {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0]= 67;
        marks[1]= 75;
        marks[2]= 9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome");
            try{
                System.out.println(marks[ind]);

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
