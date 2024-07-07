public class JAVA_ARRAY {
    public static void main(String[] args)
    {
       int[] marks = {27,87,98,56,45,67};
        System.out.println(marks[4]);
        System.out.println(marks.length);

        //Displaying arrray using for loop
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);

            //for each loop
            for(int element:marks){
                System.out.println(element);
            }
        }
    }
}
