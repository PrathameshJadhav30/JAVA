class Employee{
    int id;
    String name;
}
public class JAVA_CUSTOM_CLASS {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee();
        //Setting properties
        harry.id = 12;
        harry.name = "prathamesh";
        System.out.println(harry.id);
        System.out.println(harry.name);
    }
}
