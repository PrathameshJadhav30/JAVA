public class JAVA_PRACTICE_SET_4 {
    public static void main(String[] args)
    {
        //problem-1
        int n=4;
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
        //problem-2
        int sum=0;
        int m=3;
        for(int p=0;p<m;p++)
        {
            sum=sum+(2*p);
        }
        System.out.println("Sum of even number is:");
        System.out.println(sum);

        //problem-3
        int k=5;
        for(int q=1;q<=10;q++){
            System.out.printf("%d x %d = %d\n",k,q,k*q);
        }
        //problem-6
        int w=5;
        //what is factorial=n=n*n-1*n-2*.........1
        int r=1;
        int factorial=1;
        while(r<=w){
            factorial*=r;
            r++;
        }
        System.out.println(factorial);












    }
}
