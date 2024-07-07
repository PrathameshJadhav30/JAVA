public class JAVA_VAR_ARGS {

    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Welcome to varargs");
        System.out.println("sum of 4 and 5 is:" + sum(4,5));
        System.out.println("sum of 4 and 5 is:" + sum(4,5 ,6));
        System.out.println("sum of 4 and 5 is:" + sum(4,5 ,7 ,8));
    }
}
