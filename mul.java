public class mul {
    public static void main(String[] args) {
        int mul=1;
        int n=12345;
        int rem=1;
        while(n>0)
        {
            rem=n%10;
            mul=mul*rem;
            n=n/10;
        }
        System.out.println(mul);
    }
}
