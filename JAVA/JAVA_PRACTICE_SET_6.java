public class JAVA_PRACTICE_SET_6 {
    public static void main(String[] args){
        //problem-1
        float[] marks={45.7f,67.8f,63.5f,69.8f,98.6f};
        float sum =0 ;
        for(float element : marks){
            sum=sum+element;
        }
        System.out.println(sum);

        //problem-2
        float[] mark={45.7f,67.8f,63.5f,69.8f,98.6f};
        float num =45.7f ;
        boolean isInarray = false;
        for(float element : mark){
          if(num==element){
              isInarray=true;
              break;
          }
            System.out.println("value is present");
        }


    }
}
