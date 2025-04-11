public class sum {
    public static void main(String[] args) {
        int sum=0;
        int n=123456789;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
